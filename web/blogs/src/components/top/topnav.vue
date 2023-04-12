<template>
	<div id="topnav">
		<el-row></el-row>
		<el-row>
			<el-col :span="14"><i class="el-icon-s-help"></i>
				<h2 style="color: #409EFF;display: inline;">绝影</h2>
			</el-col>
			<el-col :span="5">
				<div class="demo-input-suffix" style="margin-top: 5%;">
					<el-input placeholder="请输入内容" prefix-icon="el-icon-search" v-model="seach"></el-input>
				</div>
			</el-col>
			<el-col :span="4" style="padding-left: 2%;padding-top: 10px;">
				<div style="margin-top: 5%;">
					<el-link type="primary" :underline="false">登陆</el-link>
					<el-link type="primary" :underline="false" disabled>&nbsp;|&nbsp;</el-link>
					<el-link type="primary" :underline="false">注册</el-link>
				</div>
			</el-col>
		</el-row>
		<el-tabs v-model="activeName" @tab-click="handleClick">
			<el-tab-pane label="Java" name="java"></el-tab-pane>
			<el-tab-pane label="Python" name="Python"></el-tab-pane>
			<el-tab-pane label="C++" name="C++"></el-tab-pane>
			<el-tab-pane label="C" name="C"></el-tab-pane>
			<el-tab-pane label="Vue" name="Vue"></el-tab-pane>
			<el-tab-pane label="Spring" name="Spring"></el-tab-pane>
			<el-tab-pane label="BootStrap" name="BootStrap"></el-tab-pane>
			<el-tab-pane label="JVM" name="JVM"></el-tab-pane>
		</el-tabs>
	</div>
</template>

<script>
	import axios from 'axios'
	export default {
		name: "topnav",
		data() {
			return {
				activeName: '',
				seach: '',
				data: ''
			};
		},
		methods: {
			handleClick(tab, event) {
				this.$router.push(tab.name)
			}
		}
	}
</script>

<style scoped>
	.el-icon-s-help {
		font-size: 50px;
		display: inline;
	}

	h2 {
		color: #0080FF;
		font-family: "small fonts";
		display: inline;
		padding-left: 20px;
	}

	#topnav {
		position: fixed;
		top: 0px;
		display: inline-block;
		width: 80%;
	}

	<style>.el-row {
		margin-bottom: 20px;

		&:last-child {
			margin-bottom: 0;
		}
	}

	.el-col {
		border-radius: 4px;
	}

	.bg-purple-dark {
		background: #99a9bf;
	}

	.bg-purple {
		background: #d3dce6;
	}

	.bg-purple-light {
		background: #e5e9f2;
	}

	.grid-content {
		border-radius: 4px;
		min-height: 36px;
	}

	.row-bg {
		padding: 10px 0;
		background-color: #f9fafc;
	}
</style>
</style>
