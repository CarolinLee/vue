<template lang = "jade">
  -var c = 'crossBorderECommerce'
  -var wrap = c + '__wrap'

  div(class="#{wrap}")
    div(class="goBack")
      router-link(to="/Home")  back
    cross-border-e-commerce-header
    div(class="poolList")
      ul
        //中央人民政府（国务院）
        li
          a(href="http://www.gov.cn/zhengce/zuixin.htm", target="blank")
            img(src="../../../common/img/poolIcon/财政部Ministry of Finance.png")
          p 中央人民政府（国务院）
          p State Council
        //中国海关总署
        li
          a(href="http://www.customs.gov.cn/customs/302249/302266/302269/index.html", target="blank")
            img(src="../../../common/img/poolIcon/GAC.png")
          p 中国海关总署
          p General Administration of Customs,P.R.China
        //国家质量监督检验检疫总局
        li
          a(href="http://samr.aqsiq.gov.cn/xxgk_13386/jlgg_12538/", target="blank")
            img(src="../../../common/img/poolIcon/质量监督检验检疫总局General-Administration-of-Quality-Supervision,-Inspection-and-Quarantine.png")
          p 原国家质量监督检验检疫总局
          p General Administration of Quality Supervision,Inspection and Quarantine of the People Repubic of China
        //国家税务总局
        li
          a(href="http://www.chinatax.gov.cn/n810341/n810755/index.html", target="blank")
            img(src="../../../common/img/poolIcon/税务局 Taxation Administration.png")
          p 国家税务总局
          p State Taxation Administation
        //中华人民共和国农业农村部
        li
          a(href="http://www.moa.gov.cn/gk/zcfg/nybgz/", target="blank")
            img(src="../../../common/img/poolIcon/农业农村部 Ministry of Agriculture and Rural Affairs.png")
          p 中华人民共和国农业农村部
          p Ministry of Agriculture and Rural Affairs of the People Repubic of China
        //中国国家认证许可监督管理委员会
        li
          a(href="http://www.cnca.gov.cn/xxgk/ggxx/", target="blank")
            img(src="../../../common/img/poolIcon/CNCA.png")
          p 中国国家认证许可监督管理委员会
          p Certification and Accreditation Administration of the People's of Republic of China
        //中华人民共和国商务部
        li
          a(href="http://www.mofcom.gov.cn/article/b/", target="blank")
            img(src="../../../common/img/poolIcon/商务部MOFCOM.png")
          p 中华人民共和国商务部
          p Ministy of Commerce of the People's Republic of China
        //国家市场监督管理总局
        li
          a(href="http://samr.saic.gov.cn/", target="blank")
            img(src="../../../common/img/poolIcon/国家市场监督管理总局State Administration for Market Regulation.png")
          p 国家市场监督管理总局
          p State Administration for Market Regulation
        //全国标准信息公共服务平台
        li
          a(href="http://www.std.gov.cn/noc/nocGB", target="blank")
            img(src="../../../common/img/poolIcon/国家标准化管理委员会standardization administration.png")
          p 全国标准信息公共服务平台
          p National Public Service Platform for Standards Information
        //国家外汇管理局
        li
          a(href="http://www.safe.gov.cn/safe/zcfg/index.html", target="blank")
            img(src="../../../common/img/poolIcon/外汇管理.png")
          p 国家外汇管理局
          p State Administration of Foreign Exchange
        //国家发展和改革委员会
        li
          a(href="http://zfxxgk.ndrc.gov.cn/web/dirlist.jsp", target="blank")
            img(src="../../../common/img/poolIcon/发改委.png")
          p 国家发展和改革委员会
          p National Development and Reform Commission
        //中国人民共和国生态环境部
        li
          a(href="http://www.mee.gov.cn/xxgk/tz/", target="blank")
            img(src="../../../common/img/poolIcon/生态环境部.png")
          p 中国人民共和国生态环境部
          p Ministry of Ecology and Environment
        //国家卫生健康委员会
        li
          a(href="http://www.nhc.gov.cn/wjw/gfxwjj/list.shtml", target="blank")
            img(src="../../../common/img/poolIcon/卫计委.jpg")
          p 国家卫生健康委员会
          p National Health Commision of the People's of Republic of China
        //中国人民银行
        li
          a(href="http://www.pbc.gov.cn/tiaofasi/144941/3581332/index.html", target="blank")
            img(src="../../../common/img/poolIcon/中国人民银行.png")
          p 中国人民银行
          p People's Bank of China
        //国家药品监督管理局
        li
          a(href="http://www.nmpa.gov.cn/WS04/CL2051/", target="blank")
            img(src="../../../common/img/poolIcon/药品管理局.png")
          p 国家药品监督管理局
          p National Medical Products Administration
</template>

<script>
  import CrossBorderECommerceHeader from '../../../components/WebPageDemo/headerDemo/CrossBorderECommerceHeader'

  export default {
    name: 'crossBorderECommerce',
    components: { CrossBorderECommerceHeader },
    data() {
      return {
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss">
    .crossBorderECommerce__wrap {
      text-align: center;
      width: 1515px;
      margin: 0 auto;
      .goBack {
        width: 85px;
        height: 33px;
        border: 1px solid black;
        border-radius: 8px;
        margin: 30px 30px;
        a {
          width: 85px;
          height: 33px;
          color: black;
          font-size: 1.2em;
          font-weight: bold;
          text-decoration: none;
          display: -webkit-flex; /* Safari */
          display: flex;
          justify-content:center;
          align-items: center;
        }
      }
      .poolList {
        ul {
          margin: 0 auto;
          width: 1400px;
          list-style: none;
          display: -webkit-flex; /* Safari */
          display: flex;
          flex-wrap: wrap;
          justify-content:center;
          align-items: center;
          li {
            width: 247px;
            font-weight: bold;
            font-size: 1.0em;
            padding: 70px 12px;
            a {
              img {
                width: 95px;
                height: 95px;
                transition: all 0s;
                -moz-transition: all 0s;	/* Firefox */
                -webkit-transition: all 0s; /* Safari 和 Chrome */
                -o-transition: all 0s;	/* Opera */
                &:hover {
                  background-color: rgba(242, 242, 242, 1);
                  transform: scale(1.2);
                  -ms-transform: scale(1.2); /* Internet Explorer */
                  -moz-transform: scale(1.2); /* Firefox */
                  -webkit-transform: scale(1.2); /* Safari 和 Chrome */
                  -o-transform: scale(1.2); /* Opera */
                }
              }
            }
            p:first-of-type {
              padding-top: 10px ;
            }
          }
        }
      }
    }
</style>
