<template lang = "jade">
  -var c = 'totalInPoolHeader'
  -var wrap = c + '__wrap'

  div(class="#{wrap}")
    p(class="logoText") Key Policy
    div(class="goBack")
      router-link(to="/")  Back to Home

</template>

<script>
  export default {
    name: "totalInPoolHeader",
    data() {
      return {
      }
    },
    methods: {
    },
  }
</script>

<style>
  @c totalInPoolHeader {
    @d wrap {
      overflow: hidden;
      padding-top: 40px;
      padding-bottom: 20px;
      border-bottom: 1px solid black;
      .logoText {
        float: left;
        width: 257px;
        height: 71px;
        background-color: #FFDF25;
        -webkit-box-shadow: 5px 5px 5px rgba(0, 0, 0, 0.2);
        box-shadow: 5px 5px 5px rgba(0, 0, 0, 0.2);
        font-family: 'Arial Bold', 'Arial';
        font-weight: bold;
        font-size: 3em;
        word-wrap: break-word;
        text-align: left;
        padding-left: 15px;
        padding-top: 15px;
      }
      .goBack {
        width: 110px;
        height: 29px;
        float: right;
        border: 1px solid black;
        border-radius: 5px;
        margin-top: 70px;
        a {
          text-decoration: none;
          color: black;
          line-height: 27px;
          font-size: 1.1em;
        }
      }
    }
  }
</style>
