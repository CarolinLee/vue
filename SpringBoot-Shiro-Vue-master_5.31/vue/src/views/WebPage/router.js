import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'
import totalInPoolDemo from './views/Webpage/totalInPoolDemo/config/router.js'
import crossBorderECommerceDemo from './views/Webpage/crossBorderECommerceDemo/config/router.js'

Vue.use(Router)

let routes = [
  {
    path: '/',
    name: 'home',
    component: Home
  }
]

routes = routes.concat(totalInPoolDemo);
routes = routes.concat(crossBorderECommerceDemo);

let $router = new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

//跳转前触发
$router.beforeEach((to, from, next) => {
  // console.log(to)
  next();
})

//跳转后触发
$router.afterEach((to, from, next) => {
  //console.log(from)
  setTimeout(() => window.scrollTo(0, 0), 0)
})

export default $router
