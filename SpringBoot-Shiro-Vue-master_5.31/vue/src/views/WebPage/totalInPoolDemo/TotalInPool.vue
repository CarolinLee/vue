<template lang = "jade">
  -var c = 'totalInPool'
  -var wrap = c + '__wrap'

  div(class="#{wrap}")
    total-in-pool-header
    total-in-pool-search(class="search")
    div(class="content")
      div(class="content_left")
        ul
          li
            a(href="http://www.customs.gov.cn/customs/302249/302266/302269/2410800/index.html", target="blank") · 关于全面推广原产地证书自助打印的公告
            label 【置顶】
            br
            p 业务模式：GS      关键词：无     类目I：通关监管      类目II：原产地     类目III：原产地     简介：海关总署决定自2019年5月20日起，全面推广原产地证书自助打印...
          li
            a(href="http://www.customs.gov.cn/customs/302249/302266/302269/2410036/index.html", target="blank") · 关于中国和俄罗斯进出口禽肉检验检疫要求的公告
            label 【置顶】
            br
            p 业务模式：无      关键词：无     类目I：检验检疫管理      类目II： 疫情管理     类目III：检疫要求      简介：根据中国和俄罗斯相关法律法规以及中俄两国政府主管部门签署的...
          li
            a(href="http://www.customs.gov.cn/customs/302249/302266/302269/2410026/index.html", target="blank") · 关于进口智利榛子检验检疫要求的公告
            label 【置顶】
            br
            p 业务模式：无      关键词：无     类目I：检验检疫管理      类目II： 疫情管理     类目III：检疫要求      简介：根据中国相关法律法规和《中华人民共和国海关总署和智利共和国农业部关于...
          li
            a(href="http://gkml.samr.gov.cn/nsjg/wjs/201904/t20190430_293337.html", target="blank") · 市场监管总局关于《网络交易监督管理办法（征求意见稿）》公开征求意见的公告
            label 【置顶】
            br
            p 业务模式：DI      关键词：无       类目I：市场准入      类目II： 行政监管     类目III：其它      简介：为贯彻落实电子商务法，完善网络交易规范制度，促进网络交易活动...
          li
            a(href="http://szs.mof.gov.cn/zhengwuxinxi/zhengcefabu/201903/t20190320_3200168.html", target="blank") · 关于深化增值税改革有关政策的公告
            br
            p 业务模式：DI/FTZ/3PCB/AGS/GS/KINDLE     关键词：降增值税     类目I：税务管理     类目II：增值税/关税/消费税     类目III：增值税/关税/消费税...
          li
            a(href="http://www.npc.gov.cn/npc/xinwen/2018-08/31/content_2060261.htm", target="blank") · 电子商务法
            br
            p 业务模式：FTZ/AGS/3PCB/GS      关键词：电商法      类目I：电子商务    类目II：法律      类目III：法律    简介：参与跨境电子商务零售进口业务...
          li
            a(href="http://www.customs.gov.cn/customs/302249/302266/302269/2087562/index.html", target="blank") · 关于实时获取跨境电子商务平台企业支付相关原始数据有关事宜的公告
            br
            p 业务模式：FTZ/AGS/3PCB/GS       关键词：跨境电子商务  原始数据      类目I：跨境电商     类目II：通关监管    类目III：通关系统...
          li
            a(href="http://www.mof.gov.cn/mofhome/guanshuisi/zhengwuxinxi/zhengcefabu/201811/t20181129_3079063.html", target="blank") · 关于调整跨境电商零售进口商品清单的公告
            br
            p 业务模式：FTZ/AGS/3PCB       关键词：扩大正面清单       类目I：跨境电商         类目II：白名单/黑名单      类目III：白名单/黑名单...
      div(class="content_right")
        div(class="relatedTerms")
          p 相关术语
          ul
            li 跨境电商
            li 进口税
            li 正面清单
        div(class="relatedWeb")
          p 相关网站
          ul
            li
              a(href="http://www.customs.gov.cn/customs/302249/302266/302269/index.html", target="blank")
                img(src="../../../common/img/poolIcon/GAC.png" width="90" height="90")
              br
              br
              p 中国海关总署
            li
              a(href="http://www.std.gov.cn/noc/nocGB", target="blank")
                img(src="../../../common/img/poolIcon/国家标准化管理委员会standardization administration.png" width="100" height="100")
              br
              p 全国标准信息公共服务平台
            li
              a(href="http://samr.saic.gov.cn/", target="blank")
                img(src="../../../common/img/poolIcon/国家市场监督管理总局State Administration for Market Regulation.png" width="90" height="90")
              br
              br
              p 国家市场监督管理总局
            li
              a(href="http://www.cnca.gov.cn/xxgk/ggxx/", target="blank")
                img(src="../../../common/img/poolIcon/CNCA.png" width="90" height="90")
              br
              br
              p 中国国家认证许可监督管理委员会
                <img src="../../../common/img/poolIcon/CNCA.png" height="500" width="500"/>
</template>

<script>
  import TotalInPoolHeader from '../../../components/WebPageDemo/headerDemo/TotalInPoolHeader'
  import TotalInPoolSearch from '../../../components/WebPageDemo/searchDemo/SearchTwo'

  export default {
    name: 'Key Policy',
    components: { TotalInPoolHeader, TotalInPoolSearch },
    data() {
      return {
      }
    }
  }
</script>

<style>
  @c totalInPool {
    @d wrap {
      .search {
        margin-left: 50px;
        margin-top: 20px;
        margin-bottom: 30px;
      }
      .content {
        display: -webkit-flex; /* Safari */
        display: flex;
        justify-content: space-between;
        font-family: 'Arial Bold', 'Arial';
        ul {
          list-style: none;
        }
        .content_left {
          width: 1200px;
          ul {
            text-align: left;
            li {
              a {
                text-decoration: underline;
                font-weight: bold;
                font-size: 1.4em;
                color: black;
                &:hover{
                  opacity: 0.7;
                }
              }
              label{
                color: red;
                font-size: 1.4em;
              }
              p {
                padding: 25px 15px 30px;
                font-size: 1.2em;
                word-wrap: break-word;
              }
            }
          }
        }
        .content_right {
          width: 324px;
          display: -webkit-flex; /* Safari */
          display: flex;
          flex-direction: column;
          text-align: left;
          ul {
            overflow: hidden;
            li {
              float: left;
            }
          }
          p {
            font-weight: bold;
            font-size: 1.2em;
            padding-bottom: 20px;
          }
          .relatedTerms {
              padding-bottom: 30px;
            ul {
              li {
                font-size: 1.2em;
                padding-right: 20px;
                &:hover {
                  opacity: 0.7;
                }
              }
            }
          }
          .relatedWeb {
            ul {
              margin: 0 auto;
              width: 324px;
              list-style: none;
              display: -webkit-flex; /* Safari */
              display: flex;
              flex-wrap: wrap;
              li {
                padding: 15px 42px 10px 10px;
                font-size: 1.0em;
                a {
                  img {
                    /*width: 90px;*/
                    /*height: 90px;*/
                    &:hover {
                      transform: scale(1.2);
                      -ms-transform: scale(1.2); /* Internet Explorer */
                      -moz-transform: scale(1.2); /* Firefox */
                      -webkit-transform: scale(1.2); /* Safari 和 Chrome */
                      -o-transform: scale(1.2); /* Opera */
                           }
                      }
                  }
                p {
                  font-size: 1.0em;
                  width: 110px;
                  display: flex;
                  flex-wrap: wrap;
                }
                }
            }
          }

        }
      }
    }
  }
</style>
