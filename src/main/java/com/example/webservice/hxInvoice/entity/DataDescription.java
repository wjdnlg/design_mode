package com.example.webservice.hxInvoice.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/30 13:57
 */
@Getter
@Setter
@ToString
@JacksonXmlRootElement(localName = "dataDescription")
public class DataDescription {
    /**
     * <zipCode>0,1</zipCode> (0,1根据数据包大小判断是否进行压缩)
     */
    @JacksonXmlProperty(localName = "zipCode")
    private String zipCode;
    /**
     * <encryptCode>0,1,2</encryptCode >(加密方式代码，0表示base64)
     */
    @JacksonXmlProperty(localName = "encryptCode")
    private String encryptCode;
    /**
     * <codeType>0,3DES,CA</codeType>(三种加密方式代码)
     */
    @JacksonXmlProperty(localName = "codeType")
    private String codeType;

    public DataDescription(String zipCode, String encryptCode, String codeType) {
        this.zipCode = zipCode;
        this.encryptCode = encryptCode;
        this.codeType = codeType;
    }

    /**
     * 默认 不压缩  base64加密方式
     */
    public DataDescription() {
        this.zipCode = "0";
        this.encryptCode = "0";
        this.codeType = "0";
    }

}
