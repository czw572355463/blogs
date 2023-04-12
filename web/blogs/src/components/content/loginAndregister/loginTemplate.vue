<template>
	<div id="loginT">
		<!--未登陆-->
		<div id="noLogin" v-if="values">
			<el-form :model="ruleForm" ref="ruleForm">
				<el-col :span="24" class="cols">
					<el-form-item prop="uloginname" :rules="[
			{required : true,message:'用户名不能为空',trigger:'blur'}
		]">
						<el-input v-model="ruleForm.uloginname" placeholder="用户名"></el-input>
					</el-form-item>
				</el-col>

				<el-col :span="24" class="cols">
					<el-form-item prop="upass" :rules="[
			{required : true,message:'密码不能为空',trigger:'blur'}
		]">
						<el-input type="password" v-model="ruleForm.upass" placeholder="密码"></el-input>
					</el-form-item>

				</el-col>

				<el-col :span="24" class="cols">
					<el-button @click='login' type="primary" style="width: 100%" size="medium">登陆</el-button>
				</el-col>
			</el-form>
		</div>
		<!-- 登陆后 -->
		<div id="loged" v-if="!values">
			<h1>登陆成功!</h1>
			
			<el-button @click="logout">注销</el-button>
		</div>
	</div>
</template>

<script>
	import axios from 'axios'

	export default {
		data() {
			return {
				ruleForm: {
					pass: '',
					upass: '',
				},
				values: true,
				user: {
					
				}
			}
		},
		methods: {
			login: function() {
				var params = new URLSearchParams()
				var that = this
				params.append('uloginname', this.ruleForm.uloginname)
				params.append('upass', this.ruleForm.upass)
				console.log(this.ruleForm.uloginname + " : " + this.ruleForm.upass);
				axios.post('/users/login', params).then(function(res) {
					that.$store.state.stu = res.data
					if (res.data){
						that.values = false
						that.$message('登陆成功!')
					}else{
						that.$message({message : '请检查用户名或密码',type: 'warning'})
					}
				})
			},
			logout : function(){
				this.$store.state.user = this.user
				console.log(this.$store.state);
				this.values = true
			}
		}
	}
</script>

<style>
</style>
