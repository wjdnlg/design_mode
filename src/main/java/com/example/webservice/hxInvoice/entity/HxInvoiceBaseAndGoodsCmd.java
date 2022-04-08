package com.example.webservice.hxInvoice.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

import java.util.List;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/4/1 11:20
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JacksonXmlRootElement(localName = "REQUEST_COMMON_YKPFPKJ")
public class HxInvoiceBaseAndGoodsCmd {
    @JacksonXmlProperty(localName = "COMMON_YKPFPKJ_FPT")
    private HxInvoiceBaseInfo baseInfo;

    @JacksonXmlElementWrapper(localName = "COMMON_YKPFPKJ_XMXXS")
    @JacksonXmlProperty(localName = "COMMON_YKPFPKJ_XMXX")
    private List<HxInvoiceGoodsInfo> items;

}
