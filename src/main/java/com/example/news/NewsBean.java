package com.example.news;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 付旺辉 on 2017/3/15.
 */

public class NewsBean implements Serializable {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"941804af39d389a29b89f244e8d923c4","title":"中国制造抢眼 天猫国际开了个\u201c假\u201d丹麦馆?","date":"2017-03-15 12:27","category":"科技","author_name":"亿邦动力网","url":"http://mini.eastday.com/mobile/170315122707018.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170315/20170315122707_5ad4de2db38def8be4e3c001bea23967_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170315/20170315122707_5ad4de2db38def8be4e3c001bea23967_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170315/20170315122707_5ad4de2db38def8be4e3c001bea23967_3_mwpm_03200403.jpeg"},{"uniquekey":"25c2bd1fc0ff89f8e22ef212667a29f5","title":"\u201c百度世界\u201d, 什么样的世界？","date":"2017-03-15 12:27","category":"科技","author_name":"36氪","url":"http://mini.eastday.com/mobile/170315122709311.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170315/20170315122709_1c9ad3950afc7e5c1c658e289e6dee94_1_mwpm_03200403.jpeg"},{"uniquekey":"3828706e375e0dff5e4dfa496fda1ae8","title":"你觉得AirPods的微波会影响我们的健康吗？","date":"2017-03-15 12:25","category":"科技","author_name":"威锋网","url":"http://mini.eastday.com/mobile/170315122532976.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170315/20170315122532_95c1508f02c452eef77e059936ce6497_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170315/20170315122532_95c1508f02c452eef77e059936ce6497_2_mwpm_03200403.jpeg"},{"uniquekey":"573474668a51874976e1c10aa26f5f10","title":"畅玩王者荣耀60帧模式 这些国产旗舰堪称游戏利器","date":"2017-03-15 12:20","category":"科技","author_name":"互联网财神","url":"http://mini.eastday.com/mobile/170315122029360.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170315/20170315122029_9ac237731c96274de8974924118cf4d9_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170315/20170315122029_9ac237731c96274de8974924118cf4d9_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170315/20170315122029_9ac237731c96274de8974924118cf4d9_3_mwpm_03200403.jpeg"},{"uniquekey":"a41cf0aeb678649aeaeffc8534bae9a3","title":"暗访苹果售后 这样的回复着实让人有点心寒","date":"2017-03-15 12:20","category":"科技","author_name":"中国派","url":"http://mini.eastday.com/mobile/170315122026766.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170315/20170315122026_52227fe5d715747ae118fa431f796ac4_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170315/20170315122026_52227fe5d715747ae118fa431f796ac4_2_mwpm_03200403.jpeg"},{"uniquekey":"c4b62cb437af3df61fa180ad74f2bbc0","title":"\u201c顶上英语\u201d完成数千万元A轮融资 将用于扩大教师和服务团队规模","date":"2017-03-15 12:20","category":"科技","author_name":"一鸣网","url":"http://mini.eastday.com/mobile/170315122023978.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170315/20170315122023_993cb4d5d6080b5c8ea233dc6e1a1866_1_mwpm_03200403.png"},{"uniquekey":"408b4676c815974eae0d1529d6f87813","title":"papi酱公司股东变更 成Angelababy同门","date":"2017-03-15 12:20","category":"科技","author_name":"鞭牛士","url":"http://mini.eastday.com/mobile/170315122023907.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170315/20170315122023_feaa344229ebbc18d3cf3831d5de763f_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170315/20170315122023_feaa344229ebbc18d3cf3831d5de763f_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170315/20170315122023_feaa344229ebbc18d3cf3831d5de763f_3_mwpm_03200403.jpeg"},{"uniquekey":"df68d51dbf479260e8b1897ed3ac69fc","title":"共享单车疯狂增长 它都带来哪些变化？","date":"2017-03-15 12:20","category":"科技","author_name":"中国派","url":"http://mini.eastday.com/mobile/170315122023794.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170315/20170315122023_53abc316db5470a64302941d90be876e_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170315/20170315122023_53abc316db5470a64302941d90be876e_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170315/20170315122023_53abc316db5470a64302941d90be876e_3_mwpm_03200403.jpeg"},{"uniquekey":"6d5898fc227aab19dbd817384e3e9827","title":"N种办法教你自测是否是山寨机！","date":"2017-03-15 12:20","category":"科技","author_name":"鲁大师官网","url":"http://mini.eastday.com/mobile/170315122023299.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170315/20170315122023_e9c698dbf38299b1d09bbf6544643763_1_mwpm_03200403.jpeg"},{"uniquekey":"5131aa7f9ba54131fc91b2f80e819388","title":"VRAge:你有10个理由做VR营销，但小心这4大坑","date":"2017-03-15 12:20","category":"科技","author_name":"VRAge","url":"http://mini.eastday.com/mobile/170315122022986.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170315/20170315122022_7c8e282766642216594e0d8b75eb1c99_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170315/20170315122022_7c8e282766642216594e0d8b75eb1c99_2_mwpm_03200403.jpeg"},{"uniquekey":"63c52cb7287b27b5b7cbd72d7febcb79","title":"小米最成功的机型，正在清仓，价格即将跌破800！","date":"2017-03-15 12:20","category":"科技","author_name":"魔方科技快报","url":"http://mini.eastday.com/mobile/170315122020866.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170315/20170315122020_50934fc17663354603d866e39ba6c037_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170315/20170315122020_50934fc17663354603d866e39ba6c037_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170315/20170315122020_50934fc17663354603d866e39ba6c037_3_mwpm_03200403.jpeg"},{"uniquekey":"9aed2ae9e3dccdd14188701459ddd253","title":"湖南师大反占座神器走红：想自习，先微信扫码","date":"2017-03-15 12:20","category":"科技","author_name":"星辰在线","url":"http://mini.eastday.com/mobile/170315122011008.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170315/20170315122011_23af296d86ffda1e5f83e1bbbbcefcee_1_mwpm_03200403.jpeg"},{"uniquekey":"25ef5b3f5780609eac3a84d90d6e4c14","title":"对屏幕漏光都忍不了的你，怎么在互联网上老是吃哑巴亏？","date":"2017-03-15 12:19","category":"科技","author_name":"三易在线","url":"http://mini.eastday.com/mobile/170315121916068.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170315/20170315121916_3e3bde830e003064bd658bc3fc1d3cc4_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170315/20170315121916_3e3bde830e003064bd658bc3fc1d3cc4_2_mwpm_03200403.jpeg"},{"uniquekey":"634dd2f37f068c798285cc471beb0d40","title":"美公司欲在火星酿啤酒","date":"2017-03-15 12:18","category":"科技","author_name":"中国搜索","url":"http://mini.eastday.com/mobile/170315121835821.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170315/20170315121835_3bbba447f618edb7f81dc7a78f5ef656_1_mwpm_03200403.jpeg"},{"uniquekey":"d28e8cc28a764a52d561081ebf7d717a","title":"从VIPKID的一次小危机谈谈危机公关","date":"2017-03-15 12:17","category":"科技","author_name":"宏民","url":"http://mini.eastday.com/mobile/170315121700504.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170315/20170315_cbe886d54fcd0c7541b055d8de86ed03_mwpm_03200403.png","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170315/20170315_c22cbd5a7826f69bea1c7ddeee27985b_cover_mwpm_03200403.png","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170315/20170315_bfe99c612a407dd97c3b122137f973b9_cover_mwpm_03200403.jpeg"},{"uniquekey":"e35441864db51613d2ae89ee5813fde0","title":"Thakoon成为\u201c即秀即买\u201d炮灰 小品牌前景在何处","date":"2017-03-15 12:16","category":"科技","author_name":"新浪","url":"http://mini.eastday.com/mobile/170315121647801.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170315/20170315121647_e5c859b738d21190e50d3280bfa062d7_1_mwpm_03200403.jpeg"},{"uniquekey":"0880c5b9f4581681d9f4f277e363f08c","title":"这届315的消费者不行:我硬盘容量被你吃了?","date":"2017-03-15 12:16","category":"科技","author_name":"天极网","url":"http://mini.eastday.com/mobile/170315121620364.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170315/20170315121620_d1aaaa808a74ba73f77461a216037e69_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170315/20170315121620_d1aaaa808a74ba73f77461a216037e69_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170315/20170315121620_d1aaaa808a74ba73f77461a216037e69_3_mwpm_03200403.jpeg"},{"uniquekey":"6d80d52bc6781a023bee97714d010080","title":"iPhone 8将成为史上最贵 无缘9月上市","date":"2017-03-15 12:15","category":"科技","author_name":"天极网","url":"http://mini.eastday.com/mobile/170315121536043.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170315/20170315121536_f9861b4cc9d6362875b08be1e834051c_1_mwpm_03200403.jpeg"},{"uniquekey":"c3b57b76dada6b0187495624c95261e3","title":"绝大多数公司都没做到 这就是苹果生产力强的秘密","date":"2017-03-15 12:15","category":"科技","author_name":"威锋网","url":"http://mini.eastday.com/mobile/170315121527716.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170315/20170315121527_e8dae91af0cca62af69c4771c397cc08_1_mwpm_03200403.png","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170315/20170315121527_e8dae91af0cca62af69c4771c397cc08_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170315/20170315121527_e8dae91af0cca62af69c4771c397cc08_3_mwpm_03200403.jpeg"},{"uniquekey":"82f05d861127fe9ab9289d21c2ea8d47","title":"机械表如何规范的调时间？调时方法错误可能导致手表故障","date":"2017-03-15 12:15","category":"科技","author_name":"深圳钟表展","url":"http://mini.eastday.com/mobile/170315121524266.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170315/20170315121524_435bd8c6eba456cf94b50d5fbc78d1f8_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170315/20170315121524_435bd8c6eba456cf94b50d5fbc78d1f8_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170315/20170315121524_435bd8c6eba456cf94b50d5fbc78d1f8_3_mwpm_03200403.jpeg"},{"uniquekey":"8a772e0aad986a55e8a35ad00c6cb3ec","title":"自带大变焦还兼4K视频 这样松下FZ2500相机请来一打","date":"2017-03-15 12:15","category":"科技","author_name":"爱活新鲜播","url":"http://mini.eastday.com/mobile/170315121511053.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170315/20170315121511_8cae8fe067076dc0fdcdf77b53f3fd14_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170315/20170315121511_8cae8fe067076dc0fdcdf77b53f3fd14_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170315/20170315121511_8cae8fe067076dc0fdcdf77b53f3fd14_3_mwpm_03200403.jpeg"},{"uniquekey":"aa45c829a55bde52492b3ab123c74bd6","title":"2016外卖消费事件话题前三是啥？微博315为你揭晓","date":"2017-03-15 12:14","category":"科技","author_name":"搜狐","url":"http://mini.eastday.com/mobile/170315121438130.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170315/20170315121438_52a6b31fa9799c477a4955682dc43cea_3_mwpm_03200403.png","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170315/20170315121438_52a6b31fa9799c477a4955682dc43cea_4_mwpm_03200403.jpeg"},{"uniquekey":"a5fa4ac242c867a3ef148ef5824e6895","title":"VR技术带你穿越虚拟世界","date":"2017-03-15 12:13","category":"科技","author_name":"技术猿人","url":"http://mini.eastday.com/mobile/170315121342513.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170315/20170315121342_e9226bde1acaae99c7ef2774e0c3561f_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170315/20170315121342_e9226bde1acaae99c7ef2774e0c3561f_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170315/20170315121342_e9226bde1acaae99c7ef2774e0c3561f_3_mwpm_03200403.jpeg"},{"uniquekey":"80e928873f9bb96166aa923cea88f62f","title":"315消费者权益日 让我们聊聊那些真货吧","date":"2017-03-15 12:13","category":"科技","author_name":"天极网","url":"http://mini.eastday.com/mobile/170315121305563.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170315/20170315121305_b95d9fb1044bb86d278957247fd8eaee_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170315/20170315121305_b95d9fb1044bb86d278957247fd8eaee_2_mwpm_03200403.jpeg"},{"uniquekey":"566e509de3293fd91db3304caa1914c8","title":"三星S8零部件曝光 这次的主角是紫水晶配色版本","date":"2017-03-15 12:12","category":"科技","author_name":"千龙网中国首都网","url":"http://mini.eastday.com/mobile/170315121254305.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170315/20170315121254_055fa35d17f58dce862a80ea7bc43e38_1_mwpm_03200403.jpeg"},{"uniquekey":"9aa6fe8da885826baba02866a0a954f5","title":"新旗舰将不在中国发售，LG离退出中国手机市场不远了？","date":"2017-03-15 12:08","category":"科技","author_name":"36kr","url":"http://mini.eastday.com/mobile/170315120857224.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170315/20170315120857_ceb90ba33237fbee88755fb9193f989b_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170315/20170315120857_ceb90ba33237fbee88755fb9193f989b_2_mwpm_03200403.jpeg"},{"uniquekey":"89262317b6ffd04750da14acbc35b37f","title":"硅谷新潮流：想入职？先搞份VR版简历来！","date":"2017-03-15 12:08","category":"科技","author_name":"青亭网","url":"http://mini.eastday.com/mobile/170315120850100.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170315/20170315120850_e8f095b3ff42011fb0978257b24af621_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170315/20170315120850_e8f095b3ff42011fb0978257b24af621_2_mwpm_03200403.png"},{"uniquekey":"b662feecbca497fef1f3b2304638e149","title":"5G时代，从手工制作的无线电测试开始","date":"2017-03-15 12:08","category":"科技","author_name":"DeepTech深科技","url":"http://mini.eastday.com/mobile/170315120824359.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170315/20170315120824_ed6995e1f8b755275ec1a4584b6a6cf1_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170315/20170315120824_ed6995e1f8b755275ec1a4584b6a6cf1_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170315/20170315120824_ed6995e1f8b755275ec1a4584b6a6cf1_3_mwpm_03200403.jpeg"},{"uniquekey":"a8ad81d4081009e3b7f91b2d5daebff7","title":"号称\u201c素人\u201d的绿色被华为、OPPO玩坏了，绿色音箱简直美翻天","date":"2017-03-15 12:07","category":"科技","author_name":"郭静的互联网圈","url":"http://mini.eastday.com/mobile/170315120751312.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170315/20170315120751_d06c0b0188e0881b534dbf8af8ee26cd_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170315/20170315120751_d06c0b0188e0881b534dbf8af8ee26cd_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170315/20170315120751_d06c0b0188e0881b534dbf8af8ee26cd_3_mwpm_03200403.jpeg"},{"uniquekey":"f60c53a76dd9d097e5b25b011c6f34f4","title":"在这个一体机和笔记本猖狂的年代里，你家还用台式吗？","date":"2017-03-15 12:04","category":"科技","author_name":"尖端科技","url":"http://mini.eastday.com/mobile/170315120435109.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170315/20170315120435_6b121dd92718305215e6632210ec0d81_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170315/20170315120435_6b121dd92718305215e6632210ec0d81_2_mwpm_03200403.jpeg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    @Override
    public String toString() {
        return "NewsBean{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code=" + error_code +
                '}';
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"941804af39d389a29b89f244e8d923c4","title":"中国制造抢眼 天猫国际开了个\u201c假\u201d丹麦馆?","date":"2017-03-15 12:27","category":"科技","author_name":"亿邦动力网","url":"http://mini.eastday.com/mobile/170315122707018.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170315/20170315122707_5ad4de2db38def8be4e3c001bea23967_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170315/20170315122707_5ad4de2db38def8be4e3c001bea23967_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170315/20170315122707_5ad4de2db38def8be4e3c001bea23967_3_mwpm_03200403.jpeg"},{"uniquekey":"25c2bd1fc0ff89f8e22ef212667a29f5","title":"\u201c百度世界\u201d, 什么样的世界？","date":"2017-03-15 12:27","category":"科技","author_name":"36氪","url":"http://mini.eastday.com/mobile/170315122709311.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170315/20170315122709_1c9ad3950afc7e5c1c658e289e6dee94_1_mwpm_03200403.jpeg"},{"uniquekey":"3828706e375e0dff5e4dfa496fda1ae8","title":"你觉得AirPods的微波会影响我们的健康吗？","date":"2017-03-15 12:25","category":"科技","author_name":"威锋网","url":"http://mini.eastday.com/mobile/170315122532976.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170315/20170315122532_95c1508f02c452eef77e059936ce6497_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170315/20170315122532_95c1508f02c452eef77e059936ce6497_2_mwpm_03200403.jpeg"},{"uniquekey":"573474668a51874976e1c10aa26f5f10","title":"畅玩王者荣耀60帧模式 这些国产旗舰堪称游戏利器","date":"2017-03-15 12:20","category":"科技","author_name":"互联网财神","url":"http://mini.eastday.com/mobile/170315122029360.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170315/20170315122029_9ac237731c96274de8974924118cf4d9_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170315/20170315122029_9ac237731c96274de8974924118cf4d9_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170315/20170315122029_9ac237731c96274de8974924118cf4d9_3_mwpm_03200403.jpeg"},{"uniquekey":"a41cf0aeb678649aeaeffc8534bae9a3","title":"暗访苹果售后 这样的回复着实让人有点心寒","date":"2017-03-15 12:20","category":"科技","author_name":"中国派","url":"http://mini.eastday.com/mobile/170315122026766.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170315/20170315122026_52227fe5d715747ae118fa431f796ac4_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170315/20170315122026_52227fe5d715747ae118fa431f796ac4_2_mwpm_03200403.jpeg"},{"uniquekey":"c4b62cb437af3df61fa180ad74f2bbc0","title":"\u201c顶上英语\u201d完成数千万元A轮融资 将用于扩大教师和服务团队规模","date":"2017-03-15 12:20","category":"科技","author_name":"一鸣网","url":"http://mini.eastday.com/mobile/170315122023978.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170315/20170315122023_993cb4d5d6080b5c8ea233dc6e1a1866_1_mwpm_03200403.png"},{"uniquekey":"408b4676c815974eae0d1529d6f87813","title":"papi酱公司股东变更 成Angelababy同门","date":"2017-03-15 12:20","category":"科技","author_name":"鞭牛士","url":"http://mini.eastday.com/mobile/170315122023907.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170315/20170315122023_feaa344229ebbc18d3cf3831d5de763f_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170315/20170315122023_feaa344229ebbc18d3cf3831d5de763f_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170315/20170315122023_feaa344229ebbc18d3cf3831d5de763f_3_mwpm_03200403.jpeg"},{"uniquekey":"df68d51dbf479260e8b1897ed3ac69fc","title":"共享单车疯狂增长 它都带来哪些变化？","date":"2017-03-15 12:20","category":"科技","author_name":"中国派","url":"http://mini.eastday.com/mobile/170315122023794.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170315/20170315122023_53abc316db5470a64302941d90be876e_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170315/20170315122023_53abc316db5470a64302941d90be876e_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170315/20170315122023_53abc316db5470a64302941d90be876e_3_mwpm_03200403.jpeg"},{"uniquekey":"6d5898fc227aab19dbd817384e3e9827","title":"N种办法教你自测是否是山寨机！","date":"2017-03-15 12:20","category":"科技","author_name":"鲁大师官网","url":"http://mini.eastday.com/mobile/170315122023299.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170315/20170315122023_e9c698dbf38299b1d09bbf6544643763_1_mwpm_03200403.jpeg"},{"uniquekey":"5131aa7f9ba54131fc91b2f80e819388","title":"VRAge:你有10个理由做VR营销，但小心这4大坑","date":"2017-03-15 12:20","category":"科技","author_name":"VRAge","url":"http://mini.eastday.com/mobile/170315122022986.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170315/20170315122022_7c8e282766642216594e0d8b75eb1c99_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170315/20170315122022_7c8e282766642216594e0d8b75eb1c99_2_mwpm_03200403.jpeg"},{"uniquekey":"63c52cb7287b27b5b7cbd72d7febcb79","title":"小米最成功的机型，正在清仓，价格即将跌破800！","date":"2017-03-15 12:20","category":"科技","author_name":"魔方科技快报","url":"http://mini.eastday.com/mobile/170315122020866.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170315/20170315122020_50934fc17663354603d866e39ba6c037_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170315/20170315122020_50934fc17663354603d866e39ba6c037_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170315/20170315122020_50934fc17663354603d866e39ba6c037_3_mwpm_03200403.jpeg"},{"uniquekey":"9aed2ae9e3dccdd14188701459ddd253","title":"湖南师大反占座神器走红：想自习，先微信扫码","date":"2017-03-15 12:20","category":"科技","author_name":"星辰在线","url":"http://mini.eastday.com/mobile/170315122011008.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170315/20170315122011_23af296d86ffda1e5f83e1bbbbcefcee_1_mwpm_03200403.jpeg"},{"uniquekey":"25ef5b3f5780609eac3a84d90d6e4c14","title":"对屏幕漏光都忍不了的你，怎么在互联网上老是吃哑巴亏？","date":"2017-03-15 12:19","category":"科技","author_name":"三易在线","url":"http://mini.eastday.com/mobile/170315121916068.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170315/20170315121916_3e3bde830e003064bd658bc3fc1d3cc4_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170315/20170315121916_3e3bde830e003064bd658bc3fc1d3cc4_2_mwpm_03200403.jpeg"},{"uniquekey":"634dd2f37f068c798285cc471beb0d40","title":"美公司欲在火星酿啤酒","date":"2017-03-15 12:18","category":"科技","author_name":"中国搜索","url":"http://mini.eastday.com/mobile/170315121835821.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170315/20170315121835_3bbba447f618edb7f81dc7a78f5ef656_1_mwpm_03200403.jpeg"},{"uniquekey":"d28e8cc28a764a52d561081ebf7d717a","title":"从VIPKID的一次小危机谈谈危机公关","date":"2017-03-15 12:17","category":"科技","author_name":"宏民","url":"http://mini.eastday.com/mobile/170315121700504.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170315/20170315_cbe886d54fcd0c7541b055d8de86ed03_mwpm_03200403.png","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170315/20170315_c22cbd5a7826f69bea1c7ddeee27985b_cover_mwpm_03200403.png","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170315/20170315_bfe99c612a407dd97c3b122137f973b9_cover_mwpm_03200403.jpeg"},{"uniquekey":"e35441864db51613d2ae89ee5813fde0","title":"Thakoon成为\u201c即秀即买\u201d炮灰 小品牌前景在何处","date":"2017-03-15 12:16","category":"科技","author_name":"新浪","url":"http://mini.eastday.com/mobile/170315121647801.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170315/20170315121647_e5c859b738d21190e50d3280bfa062d7_1_mwpm_03200403.jpeg"},{"uniquekey":"0880c5b9f4581681d9f4f277e363f08c","title":"这届315的消费者不行:我硬盘容量被你吃了?","date":"2017-03-15 12:16","category":"科技","author_name":"天极网","url":"http://mini.eastday.com/mobile/170315121620364.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170315/20170315121620_d1aaaa808a74ba73f77461a216037e69_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170315/20170315121620_d1aaaa808a74ba73f77461a216037e69_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170315/20170315121620_d1aaaa808a74ba73f77461a216037e69_3_mwpm_03200403.jpeg"},{"uniquekey":"6d80d52bc6781a023bee97714d010080","title":"iPhone 8将成为史上最贵 无缘9月上市","date":"2017-03-15 12:15","category":"科技","author_name":"天极网","url":"http://mini.eastday.com/mobile/170315121536043.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170315/20170315121536_f9861b4cc9d6362875b08be1e834051c_1_mwpm_03200403.jpeg"},{"uniquekey":"c3b57b76dada6b0187495624c95261e3","title":"绝大多数公司都没做到 这就是苹果生产力强的秘密","date":"2017-03-15 12:15","category":"科技","author_name":"威锋网","url":"http://mini.eastday.com/mobile/170315121527716.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170315/20170315121527_e8dae91af0cca62af69c4771c397cc08_1_mwpm_03200403.png","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170315/20170315121527_e8dae91af0cca62af69c4771c397cc08_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170315/20170315121527_e8dae91af0cca62af69c4771c397cc08_3_mwpm_03200403.jpeg"},{"uniquekey":"82f05d861127fe9ab9289d21c2ea8d47","title":"机械表如何规范的调时间？调时方法错误可能导致手表故障","date":"2017-03-15 12:15","category":"科技","author_name":"深圳钟表展","url":"http://mini.eastday.com/mobile/170315121524266.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170315/20170315121524_435bd8c6eba456cf94b50d5fbc78d1f8_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170315/20170315121524_435bd8c6eba456cf94b50d5fbc78d1f8_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170315/20170315121524_435bd8c6eba456cf94b50d5fbc78d1f8_3_mwpm_03200403.jpeg"},{"uniquekey":"8a772e0aad986a55e8a35ad00c6cb3ec","title":"自带大变焦还兼4K视频 这样松下FZ2500相机请来一打","date":"2017-03-15 12:15","category":"科技","author_name":"爱活新鲜播","url":"http://mini.eastday.com/mobile/170315121511053.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170315/20170315121511_8cae8fe067076dc0fdcdf77b53f3fd14_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170315/20170315121511_8cae8fe067076dc0fdcdf77b53f3fd14_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170315/20170315121511_8cae8fe067076dc0fdcdf77b53f3fd14_3_mwpm_03200403.jpeg"},{"uniquekey":"aa45c829a55bde52492b3ab123c74bd6","title":"2016外卖消费事件话题前三是啥？微博315为你揭晓","date":"2017-03-15 12:14","category":"科技","author_name":"搜狐","url":"http://mini.eastday.com/mobile/170315121438130.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170315/20170315121438_52a6b31fa9799c477a4955682dc43cea_3_mwpm_03200403.png","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170315/20170315121438_52a6b31fa9799c477a4955682dc43cea_4_mwpm_03200403.jpeg"},{"uniquekey":"a5fa4ac242c867a3ef148ef5824e6895","title":"VR技术带你穿越虚拟世界","date":"2017-03-15 12:13","category":"科技","author_name":"技术猿人","url":"http://mini.eastday.com/mobile/170315121342513.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170315/20170315121342_e9226bde1acaae99c7ef2774e0c3561f_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170315/20170315121342_e9226bde1acaae99c7ef2774e0c3561f_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170315/20170315121342_e9226bde1acaae99c7ef2774e0c3561f_3_mwpm_03200403.jpeg"},{"uniquekey":"80e928873f9bb96166aa923cea88f62f","title":"315消费者权益日 让我们聊聊那些真货吧","date":"2017-03-15 12:13","category":"科技","author_name":"天极网","url":"http://mini.eastday.com/mobile/170315121305563.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170315/20170315121305_b95d9fb1044bb86d278957247fd8eaee_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170315/20170315121305_b95d9fb1044bb86d278957247fd8eaee_2_mwpm_03200403.jpeg"},{"uniquekey":"566e509de3293fd91db3304caa1914c8","title":"三星S8零部件曝光 这次的主角是紫水晶配色版本","date":"2017-03-15 12:12","category":"科技","author_name":"千龙网中国首都网","url":"http://mini.eastday.com/mobile/170315121254305.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170315/20170315121254_055fa35d17f58dce862a80ea7bc43e38_1_mwpm_03200403.jpeg"},{"uniquekey":"9aa6fe8da885826baba02866a0a954f5","title":"新旗舰将不在中国发售，LG离退出中国手机市场不远了？","date":"2017-03-15 12:08","category":"科技","author_name":"36kr","url":"http://mini.eastday.com/mobile/170315120857224.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170315/20170315120857_ceb90ba33237fbee88755fb9193f989b_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170315/20170315120857_ceb90ba33237fbee88755fb9193f989b_2_mwpm_03200403.jpeg"},{"uniquekey":"89262317b6ffd04750da14acbc35b37f","title":"硅谷新潮流：想入职？先搞份VR版简历来！","date":"2017-03-15 12:08","category":"科技","author_name":"青亭网","url":"http://mini.eastday.com/mobile/170315120850100.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170315/20170315120850_e8f095b3ff42011fb0978257b24af621_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170315/20170315120850_e8f095b3ff42011fb0978257b24af621_2_mwpm_03200403.png"},{"uniquekey":"b662feecbca497fef1f3b2304638e149","title":"5G时代，从手工制作的无线电测试开始","date":"2017-03-15 12:08","category":"科技","author_name":"DeepTech深科技","url":"http://mini.eastday.com/mobile/170315120824359.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170315/20170315120824_ed6995e1f8b755275ec1a4584b6a6cf1_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170315/20170315120824_ed6995e1f8b755275ec1a4584b6a6cf1_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170315/20170315120824_ed6995e1f8b755275ec1a4584b6a6cf1_3_mwpm_03200403.jpeg"},{"uniquekey":"a8ad81d4081009e3b7f91b2d5daebff7","title":"号称\u201c素人\u201d的绿色被华为、OPPO玩坏了，绿色音箱简直美翻天","date":"2017-03-15 12:07","category":"科技","author_name":"郭静的互联网圈","url":"http://mini.eastday.com/mobile/170315120751312.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170315/20170315120751_d06c0b0188e0881b534dbf8af8ee26cd_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170315/20170315120751_d06c0b0188e0881b534dbf8af8ee26cd_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170315/20170315120751_d06c0b0188e0881b534dbf8af8ee26cd_3_mwpm_03200403.jpeg"},{"uniquekey":"f60c53a76dd9d097e5b25b011c6f34f4","title":"在这个一体机和笔记本猖狂的年代里，你家还用台式吗？","date":"2017-03-15 12:04","category":"科技","author_name":"尖端科技","url":"http://mini.eastday.com/mobile/170315120435109.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170315/20170315120435_6b121dd92718305215e6632210ec0d81_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170315/20170315120435_6b121dd92718305215e6632210ec0d81_2_mwpm_03200403.jpeg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "stat='" + stat + '\'' +
                    ", data=" + data +
                    '}';
        }

        public static class DataBean {
            /**
             * uniquekey : 941804af39d389a29b89f244e8d923c4
             * title : 中国制造抢眼 天猫国际开了个“假”丹麦馆?
             * date : 2017-03-15 12:27
             * category : 科技
             * author_name : 亿邦动力网
             * url : http://mini.eastday.com/mobile/170315122707018.html
             * thumbnail_pic_s : http://06.imgmini.eastday.com/mobile/20170315/20170315122707_5ad4de2db38def8be4e3c001bea23967_1_mwpm_03200403.jpeg
             * thumbnail_pic_s02 : http://06.imgmini.eastday.com/mobile/20170315/20170315122707_5ad4de2db38def8be4e3c001bea23967_2_mwpm_03200403.jpeg
             * thumbnail_pic_s03 : http://06.imgmini.eastday.com/mobile/20170315/20170315122707_5ad4de2db38def8be4e3c001bea23967_3_mwpm_03200403.jpeg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }

            @Override
            public String toString() {
                return "DataBean{" +
                        "uniquekey='" + uniquekey + '\'' +
                        ", title='" + title + '\'' +
                        ", date='" + date + '\'' +
                        ", category='" + category + '\'' +
                        ", author_name='" + author_name + '\'' +
                        ", url='" + url + '\'' +
                        ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                        ", thumbnail_pic_s02='" + thumbnail_pic_s02 + '\'' +
                        ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                        '}';
            }
        }
    }
}
