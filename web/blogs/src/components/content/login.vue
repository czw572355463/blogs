<template>

	<div id="login">
		<div>
			<el-row>
				<el-col :span="8" style="border-right: #000000 1px solid;width: 35%;">
					<p style="font-family: 'microsoft yahei';">一个不会帮助你开发的网站</p> 
				</el-col>
				<el-col :span="14" style="margin-top: 8%;margin-left: 5%;">
					<el-switch  v-model="value1" active-text="登陆" inactive-text="注册"></el-switch>
				</el-col>

			</el-row>
			<el-row v-if="value1">
				<loginTemplate></loginTemplate>
			</el-row>
			<el-row v-if="!value1">
				<registerTemplate></registerTemplate>
			</el-row>
		</div>
	</div>
</template>
<script>
	import axios from 'axios'
	import loginTemplate from './loginAndregister/loginTemplate.vue'
	import registerTemplate from './loginAndregister/registerTemplate.vue'
	export default {
		data() {
			return {
				value1: true
			}
		},
		components: {
			loginTemplate,
			registerTemplate
		}
	}
</script>

<style>
	#login {
		margin-top: 40%;
		margin-left: ;
	}

	.cols {
		margin-top: 4%;
	}
</style>
