package com.example.webservice.hxInvoice.entity;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "globalInfo")
public class GlobalInfo {
    /**
     * 接口版本,当前1.0
     */
    @JacksonXmlProperty(localName = "version")
    private String version;
    /**
     * 接口编码
     */
    @JacksonXmlProperty(localName = "interfaceCode")
    private String interfaceCode;
    /**
     * 纳税人识别号
     */
    @JacksonXmlProperty(localName = "taxpayerId")
    private String taxpayerId;
    /**
     * 接入系统平台授权码（由平台提供）
     */
    @JacksonXmlProperty(localName = "authorizationCode")
    private String authorizationCode;


    public GlobalInfo(String interfaceCode, String taxpayerId, String authorizationCode) {
        this.version = "1.0";
        this.interfaceCode = interfaceCode;
        this.taxpayerId = taxpayerId;
        this.authorizationCode = authorizationCode;
    }
}
