<template>
	<div style="height: 1000px;">
		<el-scrollbar style="height: 100%;">
			<div id="articles" v-infinite-scroll="load" infinite-scroll-disabled="false" infinite-scroll-distance='0'>
				<el-card v-for="(item,index) in list" :key="index" shadow="hover" style="margin-top: 2%;margin-left: 2.5%; width: 95%;"
				 box-shadow="0 2px 4px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04)">
				 
					<el-row>
						<el-link :underline="false">{{item.ptitle}}</el-link>
						
					</el-row>
					<br />
					<el-row>
						<el-button-group>
							<el-button size="mini" icon="el-icon-view"></el-button>
							<el-button>{{item.ffalg}}</el-button>
							<el-button size="mini" :plain="true" v-show="item.ffalg" @click="favorate(index)"  icon="el-icon-star-on"></el-button>
							<el-button size="mini" :plain="true" v-show="!item.ffalg" @click="favorate(index)" icon="el-icon-star-off"></el-button>
							<el-button size="mini" icon="el-icon-delete"></el-button>
						</el-button-group>
					</el-row>
				</el-card>
				<p v-if="loading" style="margin-left: 10px;" class="loading">
					<span></span>
				</p>
				<p v-if="noMore" style="margin-top:10px;font-size:13px;color:#ccc">没有更多了</p>
			</div>
		</el-scrollbar>
	</div>
</template>

<script>
	import axios from 'axios'


	export default {
		data() {
			return {
				count: 0, //起始页
				loading: true,
				totalPage: "",
				list: [],
				ffalg: true,
			}
		},
		computed: {
			noMore() {
				//当起始数大于总页数,则停止
				return this.count >= this.totalPage - 1
			},
			disabled() {
				return this.loading || this.noMore;
			}
		},
		created() {
			this.getArticles()
		},
		methods: {
			like: function() {

			},
			favorate: function(index) {
				if (this.list[index].ffalg) {
					this.list[index].ffalg = false
					this.$message({
						showClose: true,
						message: '取消收藏',
						duration: '1000',
					});
				} else {
					this.list[index].ffalg = true
					this.$message({
						message: '收藏成功',
						showClose: true,
						duration: '1000',
						type: 'success'
					})
				}
			},
			getArticles: function() {
				const that = this
				var type = ''
				if (this.$route.params.type == undefined) {
					type = 'java'
				} else {
					type = this.$route.params.type
				}

				var params = new URLSearchParams();
				params.append('ptype', type)
				axios.post("/article/selectAll", params).then(function(res) {
					for (var i = 0; i < res.data.length; i++) {
						that.list.push(res.data[i])
						that.$set(that.list[i], 'ffalg', false)
					}
				})
			},
			getArticle: function() {
				const that = this
				var type = ''

				if (this.$route.params.type == undefined) {
					type = 'java'
				} else {
					type = this.$route.params.type
				}
				this.count += 1;

				var params = new URLSearchParams();
				params.append('ptype', type)
				params.append('count', this.count)
				params.append('size', 10)

				axios.post('/article/showAll', params).then(res => {
					that.list = res.data
					that.totalPage = res.length
					that.loading = false;
				})
			},
			load: function() {
				//滑倒底部时加载
				this.loading = true;
				setTimeout(() => {
					this.count += 1; //页数+1
					this.getArticle();
				}, 1000)
			}
		}
	}
</script>

<style>
	#articles {
		margin-top: 10px;
		width: 100%;
		height: 100%;
	}

	.loading span {
		display: inline-block;
		width: 20px;
		height: 20px;
		border: 2px solid #409eff;
		border-left: transparent;
		animation: zhuan 0.5s linear infinite;
		border-radius: 50%;
	}
</style>
