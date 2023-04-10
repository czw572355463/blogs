import Vue from 'vue'
import App from './App.vue'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import router from './router/index.js'
import axios from 'axios'
import Vuex from 'vuex'

const originalPush = router.push
   router.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}

axios.defaults.baseURL='/api'

Vue.use(ElementUI)
Vue.use(router)
Vue.config.productionTip = false
Vue.use(Vuex)

const store = new Vuex.Store({
  state:{
    user:{
		uid : 0,
		uname : '',
		uloginname : '',
		upass : '',
		uimg : '',
		urealname : '',
		ujobname:'',
		ucontact:'',
		uemail:'',
		ustates:''
	},
	loginflag : false,
  }
})

new Vue({
  render: h => h(App),
  router,
  axios,
  store
}).$mount('#app')

