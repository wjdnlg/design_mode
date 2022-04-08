package com.example.webservice.hxInvoice.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/30 13:56
 * <p>
 * 交换数据
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "Data")
public class Data {

    /**
     * 数据描述
     */
    @JacksonXmlProperty(localName = "dataDescription")
    private DataDescription dataDescription;

    /**
     * <content>base64/3DES请求数据内容或返回数据内容</content>
     */
    @JacksonXmlProperty(localName = "content")
    private String content;

}
