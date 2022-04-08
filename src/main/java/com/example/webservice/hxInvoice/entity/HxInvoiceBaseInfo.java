package com.example.webservice.hxInvoice.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;
import lombok.Data;

import java.util.List;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/31 14:16
 */


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "COMMON_YKPFPKJ_FPT")
public class HxInvoiceBaseInfo {

    /**
     * 发票请求唯一流水号
     */
    @JacksonXmlProperty(localName = "FPQQLSH")
    private String FPQQLSH;

    /**
     * 订单号
     */
    @JacksonXmlProperty(localName = "DDH")
    private String DDH;

    /**
     * 产品类型
     */
    @JacksonXmlProperty(localName = "CPLX")
    private String CPLX;

    /**
     * 交付方式
     */
    @JacksonXmlProperty(localName = "JFFS")
    private String JFFS;

    /**
     * 开票方纳税人名称
     */
    @JacksonXmlProperty(localName = "NSRMC")
    private String NSRMC;

    /**
     * 开票方纳税人识别号
     */
    @JacksonXmlProperty(localName = "NSRSBH")
    private String NSRSBH;

    /**
     * 分机号
     */
    @JacksonXmlProperty(localName = "FJH")
    private String FJH;

    /**
     * 代开标志
     */
    @JacksonXmlProperty(localName = "DKBZ")
    private String DKBZ;

    /**
     * 编码表版本号
     */
    @JacksonXmlProperty(localName = "BMB_BBH")
    private String BMB_BBH;

    /**
     * 销货方名称
     */
    @JacksonXmlProperty(localName = "XHFMC")
    private String XHFMC;

    /**
     * 销货方识别号
     */
    @JacksonXmlProperty(localName = "XHF_NSRSBH")
    private String XHF_NSRSBH;

    /**
     * 销货方地址、电话
     */
    @JacksonXmlProperty(localName = "XHF_DZDH")
    private String XHF_DZDH;

    /**
     * 销货方银行账号
     */
    @JacksonXmlProperty(localName = "XHF_YHZH")
    private String XHF_YHZH;

    /**
     * 购货方企业类型
     * 01：企业
     * 02：机关事业单位
     * 03：个人
     * 04：其它
     */
    @JacksonXmlProperty(localName = "GHFQYLX")
    private String GHFQYLX;

    /**
     * 购货方名称
     */
    @JacksonXmlProperty(localName = "GHFMC")
    private String GHFMC;

    /**
     * 购货方识别号
     */
    @JacksonXmlProperty(localName = "GHF_NSRSBH")
    private String GHF_NSRSBH;

    /**
     * 购货方地址、电话
     */
    @JacksonXmlProperty(localName = "GHF_DZDH")
    private String GHF_DZDH;

    /**
     * 购货方银行账号
     */
    @JacksonXmlProperty(localName = "GHF_YHZH")
    private String GHF_YHZH;

    /**
     * 购货方邮箱
     */
    @JacksonXmlProperty(localName = "GHF_EMAIL")
    private String GHF_EMAIL;

    /**
     * 购货方手机
     */
    @JacksonXmlProperty(localName = "GHF_SJ")
    private String GHF_SJ;

    /**
     * 开票员
     */
    @JacksonXmlProperty(localName = "KPY")
    private String KPY;

    /**
     * 收款员
     */
    @JacksonXmlProperty(localName = "SKY")
    private String SKY;

    /**
     * 复核人
     */
    @JacksonXmlProperty(localName = "FHR")
    private String FHR;

    /**
     * 开票类型
     */
    @JacksonXmlProperty(localName = "KPLX")
    private String KPLX;

    /**
     * 发票种类代码
     */
    @JacksonXmlProperty(localName = "FPZL_DM")
    private String FPZL_DM;

    /**
     * 原发票代码
     */
    @JacksonXmlProperty(localName = "YFP_DM")
    private String YFP_DM;

    /**
     * 原发票号码
     */
    @JacksonXmlProperty(localName = "YFP_HM")
    private String YFP_HM;

    /**
     * 清单标志
     */
    @JacksonXmlProperty(localName = "QD_BZ")
    private String QD_BZ;

    /**
     * 价税合计金额
     */
    @JacksonXmlProperty(localName = "KPHJJE")
    private String KPHJJE;

    /**
     * 合计不含税金额，所有商品行不含税金额之和
     */
    @JacksonXmlProperty(localName = "HJBHSJE")
    private String HJBHSJE;

    /**
     * 合计税额，所有商品行税额之和
     */
    @JacksonXmlProperty(localName = "HJSE")
    private String HJSE;

    /**
     * 备注
     * 红字发票备注应必须以“对应正数发票代码:XXXXXXXXXXXX号码:YYYYYYYY”开始。
     * 例如：对应正数发票代码:150010020011号码:00076649  顾客退货。
     */
    @JacksonXmlProperty(localName = "BZ")
    private String BZ;



}
