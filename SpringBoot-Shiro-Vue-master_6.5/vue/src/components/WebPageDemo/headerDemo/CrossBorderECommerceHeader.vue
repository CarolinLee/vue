<template lang = "jade">
  -var c = 'crossBorderECommerceHeader'
  -var wrap = c + '__wrap'

  div(class="#{wrap}")
    div(class="logoPic")
      img(src='../../../common/img/logo/GTSlogo.jpg' width="521" height="104")
      | &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      img(src='../../../common/img/logo/copslogo.jpg' width="100" height="104")
    p(class="logoText") Ark Regulation Database
</template>

<script>
  export default {
    name: "crossBorderECommerceHeader",
    data() {
      return {
      }
    },
    methods: {
    },
  }
</script>

<style>
  @c crossBorderECommerceHeader {
    @d wrap {
      .logoPic {
        margin-bottom: 20px;
        img {
          /*width: 521px;
          height: 104px;*/
        }
      }
      .logoText {
        width: 883px;
        height: 67px;
        margin: 0 auto;
        background-color: rgba(255, 102, 0, 1);
        white-space: nowrap;
        font-family: 'Arial Bold', 'Arial Regular', 'Arial';
        font-weight: 700;
        font-style: normal;
        font-size: 40px;
        display: -webkit-flex; /* Safari */
        display: flex;
        justify-content:center;
        align-items: center;
      }
    }
  }
</style>
