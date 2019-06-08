<template lang = "jade">
  -var c = 'homeScroll'
  -var wrap = c + '__wrap'

    div(class="#{wrap}", id="box")


        ul(id="scrollBox")
          li
            a(href="http://gkml.samr.gov.cn/nsjg/rzjgs/201903/t20190320_292207.html", target="blank")
              img(src="../../../common/img/scroll/TradeAlert1.jpg")
          li
            a(href="http://szs.mof.gov.cn/zhengwuxinxi/zhengcefabu/201903/t20190320_3200168.html", target="blank")
              img(src="../../../common/img/scroll/TradeAlert2.jpg")
          li
            a(href="http://www.gov.cn/premier/2019-04/03/content_5379418.htm", target="blank")
              img(src="../../../common/img/scroll/TradeAlert3.jpg", style="height:550px")
          li
            a(href="http://gkml.samr.gov.cn/nsjg/rzjgs/201903/t20190320_292207.html", target="blank")
              img(src="../../../common/img/scroll/TradeAlert1.jpg")
        ul(id="scrollPoint")
          li(class="current")
          li
          li
        div(id="scrollLeft") <
        div(id="scrollRight") >
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
      // let scrollLeft = document.getElementById("scrollLeft");
      let scrollRight = document.getElementById("scrollRight");
      let timeOuter;//外部定时器，用来设置开启内部定时器时间
      let timeInner;//内部定时器，用来设置每张图的滚动时间
      function move() {
        timeOuter = setInterval(function () {
          clearInterval(timeInner);
          timeInner = setInterval(function () {
            count = count + 10;
            num = num + 10;
            if(num > 1390){//此长度限制的条件为每张图的宽度减去移动的宽度，超过的话就清除内部定时器
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
            if(count > 4200){//此长度限制的条件为所有图片的总宽度（除去最后一张是第一张图片的宽度），超过的话重新回到第一张图的位置
              count = 0;
              num = 0;
              pointIndex = 0;
              clearInterval(timeInner)
            }
            scrollBox.style.left = -count-50+10+'px';
          },5);
          if(count > 4200) clearInterval(timeInner);

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
          count = i*1400;
          num = i*1400;
          scrollBox.style.left = -count-50+10+'px';
          console.log(pointIndex)
        }
      }
    },
  }
</script>

<style rel="stylesheet/scss" lang="scss">
   .homeScroll__wrap {
     /*margin-left: 150px;*/
     width: 1400px;
     height: 700px;
     position: relative;
     overflow: hidden;
     display: -webkit-flex; /* Safari */
     display: flex;
     flex-direction: row;
     justify-content: space-between;

       #scrollBox {
         width: 5640px;
         height: 550px;
         left: -40px;
         list-style: none;
         position: absolute;
         overflow: hidden;

         li {
           float: left;
           transition: all 0s;

           img {
             width: 1400px;
             height: 550px;
           }
         }
       }

       #scrollPoint {
         position: absolute;
         /*bottom: 10px;*/
         list-style: none;
         width: 250px;
         left: 40%;
         top: 565px;

         li {
           width: 15px;
           height: 15px;
           margin-bottom: 10px;
           margin-left: 40px;

           color: #FFDF25;
           /*border: 1px solid #666666;*/
           border-radius: 50%;
           float: left;
           /*margin-left: 30px;*/
           background: #CCCCCC;

           &:hover {
             cursor: pointer;
           }
         }

         .current {
           background: #666666;
         }
       }

     #scrollLeft{
       width: 50px;
       height: 50px;
       line-height: 50px;
       text-align: center;
       border-radius: 50%;
       color: white;
       background-color: #3f4a48;
       opacity: 0.6;
       font-size: 3em;
       position: absolute;
       top: 40%;
       font-family: "Adobe Caslon Pro";
       cursor: pointer;
     }

     #scrollRight{
       width: 50px;
       height: 50px;
       line-height: 50px;
       text-align: center;
       border-radius: 50%;
       color: white;
       background-color: #3f4a48;
       opacity: 0.6;
       font-size: 3em;
       position: absolute;
       top: 40%;
       right: 0px;
       font-family: "Adobe Caslon Pro";
       cursor: pointer;
     }
     }
</style>
