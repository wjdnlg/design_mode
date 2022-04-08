package com.example.webservice.hxInvoice.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/31 15:21
 * 发票中间位置 明细 是个数组
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JacksonXmlRootElement(localName = "COMMON_YKPFPKJ_XMXX")
public class HxInvoiceGoodsInfo {

    /**
     * 发票行性质
     * 0：表示正常商品行。如蓝字发票的正数商品行。
     * 1：表示折扣行。如蓝字发票的负数商品行。
     * 2：表示被折扣行
     */
    @JacksonXmlProperty(localName = "FPHXZ")
    private String FPHXZ;

    /**
     * 项目名称
     * 项目名称前必须加商品简称，
     * 格式： *项目简称*项目名称。
     * 只允许对单行商品进行折扣，
     * 折扣行紧挨被折行之后，折扣
     * 行的商品名称、 商品编码与被
     * 折行相同。当FPZL_DM为41（卷票），长度限制为40。
     */
    @JacksonXmlProperty(localName = "XMMC")
    private String XMMC;

    /**
     * 项目单位
     */
    @JacksonXmlProperty(localName = "XMDW")
    private String XMDW;

    /**
     * 规格型号
     */
    @JacksonXmlProperty(localName = "GGXH")
    private String GGXH;

    /**
     * 项目数量
     */
    @JacksonXmlProperty(localName = "XMSL")
    private String XMSL;

    /**
     * 含税标志
     */
    @JacksonXmlProperty(localName = "HSBZ")
    private String HSBZ;

    /**
     * 项目单价
     */
    @JacksonXmlProperty(localName = "XMDJ")
    private String XMDJ;

    /**
     * 商品编码
     */
    @JacksonXmlProperty(localName = "SPBM")
    private String SPBM;

    /**
     * 自行编码
     */
    @JacksonXmlProperty(localName = "ZXBM")
    private String ZXBM;

    /**
     * 优惠政策标识
     */
    @JacksonXmlProperty(localName = "YHZCBS")
    private String YHZCBS;

    /**
     * 零税率标识
     */
    @JacksonXmlProperty(localName = "LSLBS")
    private String LSLBS;

    /**
     * 增值税特殊管理
     */
    @JacksonXmlProperty(localName = "ZZSTSGL")
    private String ZZSTSGL;

    /**
     * 项目金额
     */
    @JacksonXmlProperty(localName = "XMJE")
    private String XMJE;

    /**
     * 税率
     */
    @JacksonXmlProperty(localName = "SL")
    private String SL;

    /**
     * 税额
     */
    @JacksonXmlProperty(localName = "SE")
    private String SE;


}
