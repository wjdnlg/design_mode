package com.example.webservice.main;

import com.example.webservice.rhInvoice.*;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/29 16:36
 */
public class testRhInvoice {
    public static void main(String[] args) {
        //WKWebService wkWebService = new WKWebService();
        //WKWebServicePortType wkWebServiceHttpport = wkWebService.getWKWebServiceHttpport();
        //String s = wkWebServiceHttpport.doService("");
        //System.out.println(s);


        ObjectFactory objectFactory = new ObjectFactory();
        DoService request = new DoService();
        request.setXml(objectFactory.createDoServiceResponseReturn("xxxxxx"));

        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.example.webservice.rhInvoice");
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);
        webServiceTemplate.setDefaultUri("http://111.202.226.69:9026/zxkp/services/WKWebService?wsdl");
        DoServiceResponse response = (DoServiceResponse) webServiceTemplate.marshalSendAndReceive(request);

        System.out.println(response.getReturn().getValue());
    }

}
