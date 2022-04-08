package com.example.webservice.hxInvoice.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/30 14:31
 * <p>
 * 航信开发票 请求体
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JacksonXmlRootElement(localName = "interface")
public class HxInvoiceRequest {

    /**
     * 全局信息
     */
    @JacksonXmlProperty(localName = "globalInfo")
    private GlobalInfo globalInfo;

    /**
     * 返回信息
     */
    @JacksonXmlProperty(localName = "returnStateInfo")
    private ReturnStateInfo returnStateInfo;
    /**
     * 交换数据
     */
    @JacksonXmlProperty(localName = "Data")
    private Data data;

    public String toXml() throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
        String xml = xmlMapper.writeValueAsString(this).replace("&lt;", "<").replace("&gt;", ">");
        return xml;
    }

}
