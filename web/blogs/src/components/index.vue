<template>
	<div id="index">
		<el-container>
			<el-main>
				<articles></articles>
			</el-main>
			<el-aside>
				<login></login>
			</el-aside>
		</el-container>
	</div>
</template>
<script>
	import articles from './content/articles.vue'
	import login from './content/login.vue'

	export default {
		name: 'index',
		components: {
			articles,
			login
		}
	}
</script>

<style>
	#index {
		margin-left: 10%;
		width: 80%;
	}
</style>
