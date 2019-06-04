


let router = [
  {
    path: '/totalInPool',
    name: 'TotalInPool',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "PCProducts" */ '../TotalInPool.vue')
  }
]

export default router
