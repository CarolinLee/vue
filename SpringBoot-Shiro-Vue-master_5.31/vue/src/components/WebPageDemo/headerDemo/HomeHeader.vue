<template lang = "jade">
  -var c = 'homeHeader'
  -var wrap = c + '__wrap'

  div(class="#{wrap}")
    div(class="logo")
      img(src='../../../common/img/logo/GTSlogo.jpg' width="286" height="70")
      | &nbsp;&nbsp;&nbsp;&nbsp;
      span Ark Regulation Database
      | &nbsp;&nbsp;&nbsp;
      img(src='../../../common/img/logo/copslogo.jpg' width="60" height="75")

</template>

<script>
  export default {
    name: "homeHeader",
    data() {
      return {
      }
    },
    methods: {
    },
  }
</script>

<style rel="stylesheet/scss" lang="scss">
    .homeHeader__wrap {
      margin-left: auto;
      margin-right: auto;
      text-align: center;
      .logo {
        img {
          padding-top: 20px;
          /*width: 226px;*/
          /*height: 48px;*/
          vertical-align:bottom;
          margin-left:auto;
          margin-right: auto;
        }
        span {
          background-color: rgba(255, 102, 0, 1);
          white-space: nowrap;
          font-family: 'Arial Bold', 'Arial Regular', 'Arial';
          font-weight: 700;
          font-style: normal;
          font-size: 45px;
          text-align: center;
          margin-left:auto;
          margin-right: auto;
        }
      }

    }
</style>
