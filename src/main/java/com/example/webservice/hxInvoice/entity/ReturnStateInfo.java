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
 * @date 2022/3/30 14:28
 * <p>
 * 返回信息
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JacksonXmlRootElement(localName = "returnStateInfo")
public class ReturnStateInfo {
    /**
     * 返回代码  0000 成功，其他为错误
     */
    @JacksonXmlProperty(localName = "returnCode")
    private String returnCode;
    /**
     * base64 返回描述
     */
    @JacksonXmlProperty(localName = "returnMessage")
    private String returnMessage;
}
