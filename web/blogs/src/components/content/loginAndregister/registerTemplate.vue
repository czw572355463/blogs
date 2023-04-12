<template>
	<el-form :model="ruleForm" :rules="rules" ref="ruleForm" class="demo-ruleForm">
		<el-col :span="24">
			<el-form-item prop="uname" class="cols" :rules="[
				{required:true,message:'请输入用户昵称',trigger:'blur'}
			]">
				<el-input v-model="ruleForm.uname" placeholder="用户昵称"></el-input>
			</el-form-item>
		</el-col>
		
		<el-col :span="24">
			<el-form-item prop="uemail" class="cols" :rules="[
	      { required: true, message: '请输入邮箱地址', trigger: 'blur' },
	      { type: 'email', message: '请输入正确的邮箱地址', trigger: ['blur', 'change'] }
	    ]">
				<el-input v-model="ruleForm.uemail" placeholder="邮箱"></el-input>
			</el-form-item>
		</el-col>
		
		<el-col :span="24">
			<el-form-item prop="uloginname" :rules="[
				{required:true , message:'请输入用户名',trigger:'blur'}
			]">
				<el-input v-model="ruleForm.uloginname" autocomplete="off" placeholder="用户名"></el-input>
			</el-form-item>
		</el-col>


		<el-col :span="24" class="cols">
			<el-form-item prop="pass">
				<el-input type="password" v-model="ruleForm.pass" autocomplete="off" placeholder="密码"></el-input>
			</el-form-item>
		</el-col>

		<el-col :span="24">
			<el-form-item prop="checkPass">
				<el-input type="password" placeholder="请确认密码" v-model="ruleForm.checkPass" autocomplete="off"></el-input>
			</el-form-item>
		</el-col>
		
		<el-col :span="24">
			<el-button @click='register' type="primary" style="width: 100%;">立即注册</el-button>
		</el-col>
	</el-form>
</template>

<script>
	import axios from "axios"
	export default {
		
		data() {
			var validatePass = (rule, value, callback) => {
				if (value === '') {
					callback(new Error('请输入密码'));
				} else if (value.length < 6) {
					callback(new Error('密码长度需要大于6位'));
				} else {
					if (this.ruleForm.upass !== '') {
						this.$refs.ruleForm.validateField('upass');
					}
					callback();
				}
			};
			var validatePass2 = (rule, value, callback) => {
				if (value === '') {
					callback(new Error('请再次输入密码'));
				} else if (value !== this.ruleForm.pass) {
					callback(new Error('两次输入密码不一致!'));
				} else {
					callback();
				}
			}

			return {
				ruleForm: {
					pass: '',
					upass: '',
					email: '',
				},
				rules: {
					pass: [{
						validator: validatePass,
						trigger: 'blur'
					}],
					checkPass: [{
						validator: validatePass2,
						trigger: 'blur'
					}]
				},
				value1: true,

			}
		},
		methods:{
			register:function(){
				var temp = new URLSearchParams()
				var that = this
				temp.append("uemail",this.ruleForm.uemail)
				temp.append("uloginname",this.ruleForm.uloginname)
				temp.append("upass",this.ruleForm.upass)
				temp.append("uname",this.ruleForm.uname)
				axios.post('/users/register',temp).then(function(res){
					console.log(res.data)
					if(res.data!==null){
						that.$message('注册成功!')
					}else{
						that.$message({message : '注册失败,请联系管理员',type:'warning'})
					}
				})
			},
		}
	}
</script>

<style>
</style>
