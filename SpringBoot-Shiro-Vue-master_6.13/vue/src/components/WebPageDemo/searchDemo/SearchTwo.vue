<template lang = "jade">
  -var c = 'searchTwo'
  -var wrap = c + '__wrap'

  div(class="#{wrap}")
    select(class="searchClass")
      option(value="本网站搜索") 本网站搜索
      option(value="按海关搜索") 按海关搜索
      option(value="按财务部搜索") 按财务部搜索
      option(value="按国务院搜索") 按国务院搜索
    input(class="searchText", v-model="searchStr")
    img(class="cancel", src="../../../common/img/icon/cancel.png", @click="cancel()")
    p(class="searchBtn") 搜索
    button(class="seniorBtn") 高级搜索


</template>

<script>
  export default {
    name: "searchTwo",
    data() {
      return {
        searchStr: '',
      }
    },
    methods: {
      cancel() {
        this.searchStr = '';
      }
    },
  }
</script>

<style rel="stylesheet/scss" lang="scss">
  .searchTwo__wrap {
      width: 600px;
      position: relative;
      overflow: hidden;
      .searchClass {
        float: left;
        width: 147px;
        height: 30px;
        font-size: 1.1em;
      }
      .searchText {
        float: left;
        width: 187px;
        height: 30px;
        margin-left: 20px;
      }
      .cancel {
        position: absolute;
        left: 321px;
        bottom: 19px;
        width: 30px;
        height: 28px;
        &:hover{
          cursor: pointer;
        }
      }
      .searchBtn {
        float: left;
        width: 94px;
        height: 32px;
        font-size: 1em;
        font-weight: bold;
        color: white;
        background-color: #169BD5;
        display: -webkit-flex; /* Safari */
        display: flex;
        justify-content:center;
        align-items: center;
        margin-left: 20px;
        margin-top: 0px;
        &:hover{
          cursor: pointer;
        }
      }
      .seniorBtn {
        float: left;
        margin-left: 20px;
        width: 107px;
        height: 32px;
        font-size: 1.0em;
      }
    }
</style>
