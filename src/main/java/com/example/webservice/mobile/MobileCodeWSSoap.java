package com.example.webservice.mobile;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.11
 * 2022-03-29T09:50:46.194+08:00
 * Generated source version: 2.5.11
 * 
 */
@WebService(targetNamespace = "http://WebXml.com.cn/", name = "MobileCodeWSSoap")
@XmlSeeAlso({com.example.webservice.mobile.ObjectFactory.class})
public interface MobileCodeWSSoap {

    /**
     * <br /><h3>获得国内手机号码归属地省份、地区和手机卡类型信息</h3><p>输入参数：mobileCode = 字符串（手机号码，最少前7位数字），userID = 字符串（商业用户ID） 免费用户为空字符串；返回数据：字符串（手机号码：省份 城市 手机卡类型）。</p><br />
     */
    @WebMethod(action = "http://WebXml.com.cn/getMobileCodeInfo")
    @RequestWrapper(localName = "getMobileCodeInfo", targetNamespace = "http://WebXml.com.cn/", className = "com.example.webservice.mobile.GetMobileCodeInfo")
    @ResponseWrapper(localName = "getMobileCodeInfoResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.example.webservice.mobile.GetMobileCodeInfoResponse")
    @WebResult(name = "getMobileCodeInfoResult", targetNamespace = "http://WebXml.com.cn/")
    public String getMobileCodeInfo(
        @WebParam(name = "mobileCode", targetNamespace = "http://WebXml.com.cn/")
        String mobileCode,
        @WebParam(name = "userID", targetNamespace = "http://WebXml.com.cn/")
        String userID
    );

    /**
     * <br /><h3>获得国内手机号码归属地数据库信息</h3><p>输入参数：无；返回数据：一维字符串数组（省份 城市 记录数量）。</p><br />
     */
    @WebMethod(action = "http://WebXml.com.cn/getDatabaseInfo")
    @RequestWrapper(localName = "getDatabaseInfo", targetNamespace = "http://WebXml.com.cn/", className = "com.example.webservice.mobile.GetDatabaseInfo")
    @ResponseWrapper(localName = "getDatabaseInfoResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.example.webservice.mobile.GetDatabaseInfoResponse")
    @WebResult(name = "getDatabaseInfoResult", targetNamespace = "http://WebXml.com.cn/")
    public ArrayOfString getDatabaseInfo();
}
