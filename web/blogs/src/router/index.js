//用于编写路由相关的代码
import Vue from 'vue'
import VueRouter from 'vue-router'
import index from '../components/index.vue'
import articles from '../components/content/articles.vue'


Vue.use(VueRouter)

var routers = new VueRouter({
	mode: "history",
	routes: [{
		path: "/",
		component: index,
		children: [{
				path: "/:type",
				component: articles
			}
		]
	}],
	mode: "history"
})

export default routers
