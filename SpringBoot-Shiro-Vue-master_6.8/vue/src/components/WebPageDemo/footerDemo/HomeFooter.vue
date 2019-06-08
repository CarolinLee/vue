<template lang = "jade">
  -var c = 'homeFooter'
  -var wrap = c + '__wrap'

  div(class="#{wrap}")
    ul
      li
        a(href="#") 关于本站
          br
          | About Site
      li
        a(href="#") 网站声明
          br
          | Site Policy
      li
        a(href="https://www.amazon.com", target="blank") 亚马逊官网
          br
          | Amazon.com
      li
        a(href="#") 联系我们
          br
          | Contact Us
      li
        a(href="#") 建议与反馈
          br
          | Suggestions
    p @Copyright Amazon Cops GTS Team
    //img(src="../../common/img/otherIcon/QC.png")


</template>

<script>
  export default {
    name: "homeFooter",
    data() {
      return {
      }
    },
    methods: {

    },
  }
</script>

<style rel="stylesheet/scss" lang="scss">
  .homeFooter__wrap {
      position: relative;
      width: 100%;
      margin: 0 auto;
      border-top: 1px solid black;
      ul {
        list-style: none;
        overflow: hidden;
        text-align: center;
        margin: 20px 34%;
        width: 100%;
        margin-top: 35px;
        li {
          float: left;
          padding: 0 7px;
          border-left: 1px solid black;
          a {
            color: black;
            text-decoration: none;
            /*font-weight: bold;*/
            font-size: .8em;
            &:hover {
              opacity: 0.7;
            }
          }
        }
        li:nth-of-type(1){
          border: none;
        }
      }
      p {
        text-align: center;
      }
      img {
        display: block;
        width: 88px;
        height: 75px;
        position: absolute;
        right: 30px;
        bottom: 25px;
      }
    }
</style>
