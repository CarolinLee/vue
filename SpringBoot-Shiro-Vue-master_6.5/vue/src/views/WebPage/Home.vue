<template lang = "jade">
  -var c = 'home'
  -var wrap = c + '__wrap'
  -var header = c + '__header'
  -var menu = c + '__menu'
  -var content = c + '__content'
  -var faq = c + '__faq'
  -var homeScroll = c + '__homeScroll'
  -var footer = c + '__footer'

  div(class="#{wrap}")
    home-header(class="#{header}")
    div(class="login")
      ul
        li
          img(src="../../common/img/logo/u17.png")
        li
          a(href="https://i3691l.axshare.com/log.html", target="blank") Register
        li
          a(href="#") Login
        li
          a(href="#") Exit
    home-menu(class="#{menu}")
    br
    home-search(class="#{search}")
    div(class="#{content}")
      //div(class="tradeAlert")
        p Trade Alert
        home-scroll
      div(class="legalHierarchy")
        ul
          li 法律层级
            br
            | Legal hierarchy
          li 最新
            br
            | Newest Regulation
          li 法律
            br
            | Laws
          li 行政法规
            br
            | Administration Regulations
          li 国家标准
            br
            | National Standards
          li 部门规章
            br
            | Departmental Regulations
          li 地方法规
            br
            | Local Regulations
          li 法规性文件
            br
            | Legislative Documents
          li 贸易新规
            br
            | TC/PC_Alert
      div(class="newsReport")
        ul
          li
            a(href="http://www.gov.cn/premier/2019-04/03/content_5379418.htm", target="blank") · SC 国务院常务会议 确定今年降低政府性收费和经营服务性收费的措施等
              br
              | · China's State Council has announced new measures to&nbsp;drastically reduce government fees&nbsp;and operating service charges
          li
            a(href="http://szs.mof.gov.cn/zhengwuxinxi/zhengcefabu/201903/t20190320_3200168.html", target="blank") · MOF SAT GAC 2019年39号 关于深化增值税改革有关政策的公告
              br
              | · Announcement [2019] No. 39 (“Announcement 39”), jointly released by the MoF, the SAT and the General Administration of Customs (“GAC”), and SAT  ，Announcement regarding to Further VAT reform (including reduction of general VAT rates)
          li
            a(href="http://gkml.samr.gov.cn/nsjg/rzjgs/201903/t20190320_292207.html", target="blank") · SAMR GAC 公告〔2019〕13号 关于免予办理强制性产品认证工作有关安排的公告
              br
              | · SAMR and GAC jointly published “Notice on Unified management of Defective product recalls”
          li
            a(href="http://gkml.samr.gov.cn/nsjg/rzjgs/201903/t20190320_292207.html", target="blank") · GAC SAIC 2019年第14号 关于《报关单位注册登记证书》（进出口货物收发货人）纳入“多证合一”改革的公告
              br
              | · GAC SAIC No. 14 of 2019 Announcement on the “Registration Certificate for Customs Declaration” (consignment and consignor of import and export goods)
          li
            a(href="http://gkml.samr.gov.cn/nsjg/rzjgs/201903/t20190320_292207.html", target="blank") · GAC 2018年第219号 关于跨境电子商务企业海关注册登记管理有关事宜的公告
              br
              | · GAC No. 219 of 2018 Announcement on matters related to customs registration management of cross-border e-commerce enterprises
          li
            a(href="http://gkml.samr.gov.cn/nsjg/rzjgs/201903/t20190320_292207.html", target="blank") · MOF 税委会〔2018〕65号 国务院关税税则委员会关于2019年进出口暂定税率等调整方案的通知
              br
              | · MOF Taxation Committee [2018] No. 65 Notice of the State Council Customs Tariff Commission on the adjustment plan for the 2019 import and export provisional tax rate
      div(class="relatedWebsites")
        ul
          li 相关网站
            br
            | Related Websites
          li
            a(href="http://www.gov.cn/zhengce/zuixin.htm", target="blank") 国务院
              br
              | State Council
          li
            a(href="http://www.customs.gov.cn/customs/302249/302266/302269/index.html", target="blank") 中国海关总署
              br
              | General Administration of Customs
          li
            a(href="http://samr.aqsiq.gov.cn/xxgk_13386/jlgg_12538/", target="blank") 原质检总局
              br
              | Administration of Quality Supervision
          li
            a(href="http://www.mof.gov.cn/zhengwuxinxi/zhengcefabu/", target="blank") 税务总局
              br
              | State Taxation Administration
          li
            a(href="http://samr.saic.gov.cn/xw/", target="blank") 市场监督总局
              br
              | General Administration of Markets
          li
            a(href="http://www.moa.gov.cn/gk/zcfg/nybgz/", target="blank") 农业部
              br
              | Ministry of Agriculture
          li
            a(href="http://www.pbc.gov.cn/tiaofasi/144941/3581332/index.html", target="blank") 中国人民银行
              br
              | People's Bank of China
          li
            a(href="http://www.safe.gov.cn/safe/zcfg/index.html", target="blank") 国家外汇管理局
              br
              | Foreign exchange administration
          li
            router-link(to="/crossBorderECommerce") 更多...
              br
              | More...
    home-scroll(class="#{homeScroll}")
    div(class="#{faq}")
      div(class="title")
        ul
          li
      div(class="question")
        ul
          li 问：请问该网站有哪些法律法规？
            br
            | 答：本站收集了国务院、海关总署等15个部委的进出口贸易法律法规文件，经过筛选和整合后，对重点法律法规进行解读形成。
            br
            | Q: What laws and regulations are there on this website?
            br
            | A:  This site collects the import and export trade laws and regulations documents of 15 ministries and commissions including the State Council and the General Administration of Customs. After screening and integration, the key laws and regulations are interpreted.
          li 问：请问在哪里能查看最新的法规文件？
            br
            | 答：在“导航栏”的“各项法规”中，置顶文件是最新法规文件。
            br
            | Q: Where can I check the latest regulatory documents?
            br
            | A:  In the “Regulations” of the “Navigation Bar”, the top file is the latest regulatory document.
    home-footer(class="#{footer}")

</template>

<script>
    import HomeHeader from '../../components/WebPageDemo/headerDemo/HomeHeader'
    import HomeFooter from '../../components/WebPageDemo/footerDemo/HomeFooter'
    import HomeMenu from '../../components/WebPageDemo/menuDemo/HomeMenu'
    import HomeScroll from '../../components/WebPageDemo/scrollDemo/HomeScroll'
    import HomeSearch from '../../components/WebPageDemo/searchDemo/SearchOne'

  export default {
    name: 'home',
    components: { HomeHeader, HomeFooter, HomeMenu, HomeScroll, HomeSearch },
    data() {
        return {
        }
    },
    methods: {

    },
  }
</script>

<style rel="stylesheet/scss" lang="scss">
  .home__wrap {
      margin: 0 auto;
      overflow: hidden;
      .login {
        text-align: right;
        overflow: hidden;
        padding-top: 10px;
        padding-right: 55px;
        ul {
          list-style: none;
          float: right;
          li {
            float: left;
            padding: 0 7px;
            border-left: 1px solid black;
            a {
              color: #3367CC;
              text-decoration: none;
              font-weight: bold;
              &:hover {
                opacity: 0.7;
              }
            }
          }
          li:nth-of-type(1){
            border: none;
          }
        }
        img {
          width: 24px;
          height: 21px;
        }
      }
    }
  .home__header{
      margin: 10px auto;
    }
  .home__menu {
      margin: 0 auto;
    }
  .home__search {
      margin: 100px auto;
      padding: 50px 500px;
      padding-top: 30px;
    }
  .home__content {
      margin: 25px auto;
      padding: 0px 54px;
      display: -webkit-flex; /* Safari */
      display: flex;
      flex-direction: row;
      justify-content: space-between;
      .legalHierarchy {
        width: 340px;
        height: 720px;
        padding: 0 0px;
        box-sizing: content-box;
        overflow: auto;
        ul {
          list-style: none;
          li{
            width: 250px;
            height: 73px;
            padding: 0px 10px;
            font-size: 1.1em;
            vertical-align: middle;
            color: #169BD5;
            font-weight: bold;
            text-align: center;
            display: -webkit-flex; /* Safari */
            display: flex;
            justify-content:center;
            align-items: center;
            transition: all 0s;
            -moz-transition: all 0s;	/* Firefox */
            -webkit-transition: all 0s; /* Safari 和 Chrome */
            -o-transition: all 0s;	/* Opera */
            &:hover {
              cursor: pointer;
              width: 260px;
            }
          }

          li:nth-of-type(odd) {
            background-color: #CCCCCC;
            box-shadow: 5px 5px 5px #999999;
            text-align: center;
          }
          li:first-of-type{
            text-align: center;
            color: white;
            background-color: #169BD5;
            border-radius: 5px;
            font-size: 1.4em;
            /*justify-content: flex-start;*/
            font-family: "Microsoft YaHei";
            &:hover {
              cursor: default;
              width: 250px;
            }
          }
        }
      }
      .newsReport {
        width: 917px;
        height: 710px;
        margin-left: 20px;
        padding: 0px 0px;
        box-sizing: content-box;
        overflow: auto;
        /*box-shadow: 5px 5px 5px #999999;*/
        ul {
          height: 590px;
          list-style: none;
          text-align: left;
          padding: 40px 40px 40px 40px;
          background-color: #F2F2F2;
          li {
            padding-bottom: 31px;
            a {
              font-size: 1.15em;
              font-weight: bold;
              color: #169BD5;
              &:hover {
                text-decoration: underline;
                }
              }
            }
          }
        }
      }
      .relatedWebsites {
        width: 360px;
        padding: 0px 0px;
        /*box-sizing: content-box;*/
        overflow: auto;
        ul {
          height: 30px;
          list-style: none;
          text-align: left;
          margin-right: 10px;
          /*padding: 40px 40px;*/
          /*background-color: #F2F2F2;*/
          li {
             margin-bottom: 11px;
             /*padding-bottom: 30px;*/
             padding-top: 7px;
             padding-left: 11px;
             height: 56px;
             background-color: #CCCCCC;
             box-shadow: 5px 5px 5px #999999;
             a {
                 font-size: 1.0em;
                 color: black;
                 height: 10px;
                 font-family: "Microsoft YaHei";
                 &:hover {
                   text-decoration: underline;
                 }
               }
             }
          li:first-of-type{
            text-align: left;
            vertical-align: middle;
            color: white;
            height: 60px;
            background-color: #666666;
            font-family: "Microsoft YaHei";
            font-size: 1.1em;
            justify-content: flex-start;
          }
        }

    }
  .home__homeScroll {
      margin: 0 auto;
    }
  .home__faq {
      margin-left: 100px;
      margin-right: 50px;
      margin-bottom: 50px;
      /*padding: 0px 54px;*/
      display: -webkit-flex; /* Safari */
      display: flex;
      flex-direction: row;
      justify-content: space-between;
      height: 230px;
      .title {
        /*margin-left: 100px;*/
        background-color: #666666;
        ul {
          list-style: none;
          li {
            width: 20px;
            text-align: center;
            /*font-weight: bold;*/
            /*vertical-align: middle;*/
            /*line-height: 50px;*/
            font-family: "Microsoft YaHei";
            font-size: 1.0em;
            color: white;
          }
        }
      }
      .question {
        box-sizing: content-box;
        margin-left: 10px;
        margin-right: 36px;
        border: 1px solid black;
        text-align: left;
        ul{
          list-style: none;
          li {
            padding-left: 15px;
            padding-right: 15px;
            padding-top: 15px;
            padding-bottom: 15px;
            font-family: "Microsoft YaHei";
            text-align: left;
            font-size: 0.9em;
            color: black;
          }
        }
      }
    }
  .home__footer {
      margin: 0 auto;
      padding-bottom: 40px;
    }
</style>
