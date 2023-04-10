<template>
	<div id="app">
		<el-container>
			<el-header id="top">
				<topnav></topnav>
			</el-header>
			<el-main>
				<router-view :key="$route.path"></router-view>
			</el-main>
		</el-container>
	</div>
</template>

<script>
	import index from './components/index.vue'
	import topnav from './components/top/topnav.vue'
	import articles from './components/content/articles.vue'
	import login from './components/content/login.vue'

	export default {
		name: 'app',
		components: {
			index,
			topnav,
			articles,
			login
		},
		data:function () {
			return{
				isRouterAlive: true
			}
		}
	}
</script>

<style>
	body {
		overflow: scroll;
		overflow-y: hidden;
		overflow-x: hidden;
	}

	#top {
		margin-left: 10%;
		width: 80%;
	}
</style>
