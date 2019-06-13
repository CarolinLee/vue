import Vue from 'vue'
import Router from 'vue-router'
// in development env not use Lazy Loading,because Lazy Loading too many pages will cause webpack hot update too slow.so only in production use Lazy Loading
/* layout */
import Layout from '../views/layout/Layout'
import Home from '../views/WebPage/Home.vue'

const _import = require('./_import_' + process.env.NODE_ENV)
Vue.use(Router)
export const constantRouterMap = [
  {path: '/login', component: _import('login/index'), hidden: true},
  {path: '/404', component: _import('404'), hidden: true},
  {
    path: '/',
    component: Layout,
    redirect: '/dashboard',
    name: '首页',
    hidden: true,
    children: [{
      path: 'dashboard', component: _import('dashboard/index')
    }]
  },{
    path: '/totalInPool',
    name: '各项法规',
    component: _import('WebPage/totalInPoolDemo/TotalInPool'),
    hidden: true,
  },
  {
    path: '/CrossBorderECommerceHeader',
    name: '重要政策',
    component: _import('WebPage/crossBorderECommerceDemo/CrossBorderECommerce'),
    hidden: true,
  },
  {
    path: '/CrossBorderECommerce',
    name: '重要政策',
    component: _import('WebPage/crossBorderECommerceDemo/CrossBorderECommerce'),
    hidden: true,
  },
  {
    path: '/Home',
    name: '法规导航',
    component: _import('WebPage/Home'),
    hidden: true,
  },
]
export default new Router({
  // mode: 'history', //后端支持可开
  scrollBehavior: () => ({y: 0}),
  routes: constantRouterMap
})
export const asyncRouterMap = [
  /*{
    path: '/system',
    component: Layout,
    redirect: '/system/article',
    name: '功能模块',
    meta: {title: '功能模块', icon: 'tree'},
    children: [
      {
        path: 'article',
        name: '文章',
        component: _import('article/article'),
        meta: {title: '文章', icon: 'example'},
        menu: 'article'
      },
    ]
  },
  {
    path: '/user',
    component: Layout,
    redirect: '/user/',
    name: '权限模块',
    meta: {title: '用户权限', icon: 'table'},
    children: [
      {
        path: '',
        name: '用户列表',
        component: _import('user/user'),
        meta: {title: '用户列表', icon: 'user'},
        menu: 'user'
      },
      {
        path: 'role',
        name: '角色管理',
        component: _import('user/role'),
        meta: {title: '角色管理', icon: 'password'},
        menu: 'role'
      },
    ]
  },*/{
    path: '/ark',
    component: Layout,
    redirect: '/ark/',
    name: 'ARK',
    meta: {title: 'ARK', icon: 'table'},
    children: [
      {
        path: '',
        name: 'REGULATION',
        component: _import('ark/regulationList'),
        meta: {title: 'REGULATION', icon: 'example'},
        menu: 'regulation'
      },
     /* {
        path: 'regulation',
        name: 'NAVIGATATION',
        component: _import('user/role'),
        meta: {title: 'NAVIGATATION', icon: 'example'},
        menu: 'regulation'
      }*/
    ]
  },{
    path: '/WebPage',
    component: Layout,
    redirect: '/NAVIGATATION/',
    name: 'NAVIGATATION',
    meta: {title: 'NAVIGATATION', icon: 'tree'},
    children: [
      {
        path: 'Home',
        name: 'WebPage',
        component: _import('WebPage/Home'),
        meta: {title: '法规导航', icon: 'example'},
        menu: 'Home'
      },
      {
        path: 'crossBorderECommerceDemo/CrossBorderECommerce',
        name: '各项法规',
        component: _import('WebPage/crossBorderECommerceDemo/CrossBorderECommerce'),
        meta: {title: '各项法规', icon: 'example'},
        menu: 'Home'
      },
      {
        path: 'totalInPoolDemo/TotalInPool',
        name: '重要政策',
        component: _import('WebPage/totalInPoolDemo/TotalInPool'),
        meta: {title: '重要政策', icon: 'example'},
        menu: 'Home'
      }
    ]
  },
  {path: '*', redirect: '/404', hidden: true}
]
