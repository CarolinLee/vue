<template lang = "jade">
  -var c = 'searchOne'
  -var wrap = c + '__wrap'

  div(class="#{wrap}")
    div(class="searchOption")
      label() 政策名称：
      input(class="searchText", v-model="searchStr")
      &nbsp&nbsp&nbsp&nbsp
      //img(class="cancel", src="../../common/img/icon/cancel.png", @click="cancel()")
      label 政策代号：
      input(class="searchText", v-model="searchStr")
      &nbsp&nbsp&nbsp&nbsp
      label 行政部门：
      input(class="searchText", v-model="searchStr")
      &nbsp&nbsp&nbsp&nbsp
      label 风险等级：
      input(class="searchText", v-model="searchStr")
      &nbsp&nbsp&nbsp&nbsp
      label 业务影响：
      input(class="searchText", v-model="searchStr")
      div(class="searchBtn") 搜索
        br
        | Search


</template>

<script>
  export default {
    name: "searchOne",
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
  .searchOne__wrap {
    margin-left: 50px;
      .searchOption{
        width: 1280px;
        position: relative;
        overflow: hidden;
        padding-top: 23px;
        padding-left: 23px;
        margin-right: 50px;
        text-align: center;
        /*margin: 0 54px;*/
        .searchText {
          width: 130px;
          height: 35px;
        }
        .cancel {
          position: absolute;
          right: 125px;
          bottom: 2px;
          &:hover{
            cursor: pointer;
           }
       }
        .searchBtn {
          float: right;
          width: 100px;
          height: 39px;
          font-size: 1em;
          font-weight: bold;
          color: white;
          background-color: #169BD5;
          text-align: center;
          vertical-align: middle;
          &:hover{
            cursor: pointer;
          }
        }
      }
    }
</style>
