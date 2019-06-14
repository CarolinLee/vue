<template lang = "jade">
  -var c = 'homeMenu'
  -var wrap = c + '__wrap'

  div(class="#{wrap}")
    ul
      li
        img(src="../../../common/img/icon/homeIcon.png")
        router-link(to="/") 首页
          br
          | Home
      li
        router-link(to="/CrossBorderECommerceHeader") 各项法规
          br
          | Total In Pool
      li
        router-link(to="/totalInPool") 重要政策
          br
          | Key Policy
      li
        router-link(to="/") 全球开店/物流
          br
          | Global Selling/AGL
      li
        router-link(to="/") Lab 126
          br
          | Lab 126
      li
        router-link(to="/LinkRelatedBusiness/1") 亚马逊相关业务
          br
          | Link Amazon Business
      li
        router-link(to="/") 亚马逊跨境电商
          br
          | Amazon Cross Border E-Commerce
      li
        router-link(to="/") 关联PT
          br
          | Link PT
      li
        router-link(to="/") 亚马逊AGS
          br
          | Link Amazon AGS
      li
        router-link(to="/") 亚马逊DI
          br
          | Link Amazon DI
      li
        router-link(to="/") 亚马逊Kindle
          br
          | Amazon Kindle

</template>

<script>
  export default {
    name: "homeMenu",
    data() {
      return {
      }
    },
    methods: {
    },
  }
</script>

<style rel="stylesheet/scss" lang="scss">
  .homeMenu__wrap {
      width: 100%;
      height: 52px;
      ul {
        list-style: none;
        overflow: hidden;
        padding-top: 10px;
        margin: 0 39px;
        font-size: 14px;
        text-align: center;
        li {
          float: left;
          padding: 8px 8px;
          border: 1px solid black;
          margin-left: 2px;
          transition: all 0s;
          -moz-transition: all 0s;	/* Firefox */
          -webkit-transition: all 0s; /* Safari 和 Chrome */
          -o-transition: all 0s;	/* Opera */
          a {
            color: black;
            font-weight: bold;
            &:hover {
              opacity: 0.7;
            }
          }
          &:hover {
            cursor: pointer;
            height: 50px;
            transform: translateY(-10px);
            -ms-transform: translateY(-10px); /* Internet Explorer */
            -moz-transform: translateY(-10px); /* Firefox */
            -webkit-transform: translateY(-10px); /* Safari 和 Chrome */
            -o-transform: translateY(-10px); /* Opera */
          }
        }

        li:first-of-type {
          overflow: hidden;
          img {
            float: left;
            padding-top: 10px;
          }
          a {
            float: right;
          }
        }
      }
    }
</style>
