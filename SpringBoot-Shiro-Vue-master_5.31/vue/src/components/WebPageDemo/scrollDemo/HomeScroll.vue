<template lang = "jade">
  -var c = 'homeScroll'
  -var wrap = c + '__wrap'

    div(class="#{wrap}", id="box")
      div(class="left")
        ul
          li
          li
          li
      div(class="right")
        ul(id="scrollBox")
          li
            img(src="../../../common/img/scroll/TradeAlert1.jpg")
          li
            p
          li
            img(src="../../../common/img/scroll/TradeAlert2.jpg")
          li
            p
          li
            img(src="../../../common/img/scroll/TradeAlert3.jpg", style="height:550px")
          li
            p
          li
            img(src="../../../common/img/scroll/TradeAlert1.jpg")
        ul(id="scrollPoint")
          li(class="current")
          li
          li
</template>

<script>
  export default {
    name: "homeScroll",
    data() {
      return {
      }
    },
    methods: {
    },
    mounted() {
      let count = 0;
      let num = 0;
      let pointIndex = 0;
      let box = document.getElementById("box");
      let scrollBox = document.getElementById("scrollBox");
      let scrollPoint = document.getElementById("scrollPoint");
      let timeOuter;//外部定时器，用来设置开启内部定时器时间
      let timeInner;//内部定时器，用来设置每张图的滚动时间
      function move() {
        timeOuter = setInterval(function () {
          clearInterval(timeInner);
          timeInner = setInterval(function () {
            count = count + 10;
            num = num + 10;
            if(num > 1440){//此长度限制的条件为每张图的宽度减去移动的宽度，超过的话就清除内部定时器
              num = 0;
              pointIndex++;
              scrollPoint.childNodes[pointIndex-1].classList.remove("current");
              if(pointIndex < 3) {
                scrollPoint.childNodes[pointIndex].classList.add("current");
              }else {
                scrollPoint.childNodes[0].classList.add("current");
              }
              clearInterval(timeInner);
            }
            if(count > 4350){//此长度限制的条件为所有图片的总宽度（除去最后一张是第一张图片的宽度），超过的话重新回到第一张图的位置
              count = 0;
              num = 0;
              pointIndex = 0;
              clearInterval(timeInner)
            }
            scrollBox.style.left = -count+50+'px';
          },10);
          if(count > 4350) clearInterval(timeInner);

        },4000)//设置秒速（如：4s=4000）
      }
      this.$nextTick(() => {
        move();
      });

      //鼠标移入图片，暂停定时器
      box.onmouseover = function(e){
        clearInterval(timeOuter);
      }
      //鼠标移出图片，开启定时器
      box.onmouseout = function(e){
        move();
      }

      //给点增添点击事件
      for(let i = 0; i < scrollPoint.childElementCount; i++){
        scrollPoint.childNodes[i].onclick = function () {
          for(let j = 0; j < scrollPoint.childElementCount; j++){
            scrollPoint.childNodes[j].classList.remove("current");
          }
          scrollPoint.childNodes[i].classList.add("current");
          pointIndex = i;
          count = i*1450;
          num = i*1450;
          scrollBox.style.left = -count+50+'px';
          console.log(pointIndex)
        }
      }
    },
  }
</script>

<style rel="stylesheet/scss" lang="scss">
   .homeScroll__wrap {
      margin-left: 100px;
      width: 1450px;
      height: 600px;
      position:relative;
      overflow:hidden;
      display: flex;
      flex-direction: row;
      .left {
        ul {
          list-style: none;
          li {
            width: 50px;
            height: 90px;
            background-color: #FFDF25;
            margin-bottom: 8px;
            box-shadow: 5px 5px #999999;
            border-radius: 8%;
            }
          }
      }
      .right {
        #scrollBox {
          width: 5800px;
          height: 550px;
          list-style: none;
          position: absolute;
          /*overflow: hidden;*/
          li {
            float: left;
            transition: all 0s;
            img {
              width: 1400px;
              height: 550px;
            }
            p {
              width: 50px;
              height: 550px;
            }
          }
        }
        #scrollPoint{
          position: absolute;
          bottom: 10px;
          right: 25px;
          list-style: none;
          li {
            width: 13px;
            height: 13px;
            /*border: 1px solid #666666;*/
            border-radius: 50%;
            float: left;
            margin-left: 30px;
            background: #CCCCCC;
            &:hover{
              cursor: pointer;
            }
          }
          .current{
            background: #666666;
          }
        }
      }
    }
</style>
