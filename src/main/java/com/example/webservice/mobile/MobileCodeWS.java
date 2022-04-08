package com.example.webservice.mobile;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a> <strong>国内手机号码归属地查询WEB服务</strong>，提供最新的国内手机号码段归属地数据，每月更新。<br />使用本站 WEB 服务请注明或链接本站：<a href="http://www.webxml.com.cn/" target="_blank">http://www.webxml.com.cn/</a> 感谢大家的支持！<br />&nbsp;
 *
 * This class was generated by Apache CXF 2.5.11
 * 2022-03-29T09:50:46.222+08:00
 * Generated source version: 2.5.11
 * 
 */
@WebServiceClient(name = "MobileCodeWS", 
                  wsdlLocation = "http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl",
                  targetNamespace = "http://WebXml.com.cn/") 
public class MobileCodeWS extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://WebXml.com.cn/", "MobileCodeWS");
    public final static QName MobileCodeWSSoap = new QName("http://WebXml.com.cn/", "MobileCodeWSSoap");
    public final static QName MobileCodeWSSoap12 = new QName("http://WebXml.com.cn/", "MobileCodeWSSoap12");
    public final static QName MobileCodeWSHttpPost = new QName("http://WebXml.com.cn/", "MobileCodeWSHttpPost");
    public final static QName MobileCodeWSHttpGet = new QName("http://WebXml.com.cn/", "MobileCodeWSHttpGet");
    static {
        URL url = null;
        try {
            url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MobileCodeWS.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MobileCodeWS(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MobileCodeWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MobileCodeWS() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MobileCodeWS(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MobileCodeWS(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MobileCodeWS(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns MobileCodeWSSoap
     */
    @WebEndpoint(name = "MobileCodeWSSoap")
    public MobileCodeWSSoap getMobileCodeWSSoap() {
        return super.getPort(MobileCodeWSSoap, MobileCodeWSSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MobileCodeWSSoap
     */
    @WebEndpoint(name = "MobileCodeWSSoap")
    public MobileCodeWSSoap getMobileCodeWSSoap(WebServiceFeature... features) {
        return super.getPort(MobileCodeWSSoap, MobileCodeWSSoap.class, features);
    }
    /**
     *
     * @return
     *     returns MobileCodeWSSoap
     */
    @WebEndpoint(name = "MobileCodeWSSoap12")
    public MobileCodeWSSoap getMobileCodeWSSoap12() {
        return super.getPort(MobileCodeWSSoap12, MobileCodeWSSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MobileCodeWSSoap
     */
    @WebEndpoint(name = "MobileCodeWSSoap12")
    public MobileCodeWSSoap getMobileCodeWSSoap12(WebServiceFeature... features) {
        return super.getPort(MobileCodeWSSoap12, MobileCodeWSSoap.class, features);
    }
    /**
     *
     * @return
     *     returns MobileCodeWSHttpPost
     */
    @WebEndpoint(name = "MobileCodeWSHttpPost")
    public MobileCodeWSHttpPost getMobileCodeWSHttpPost() {
        return super.getPort(MobileCodeWSHttpPost, MobileCodeWSHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MobileCodeWSHttpPost
     */
    @WebEndpoint(name = "MobileCodeWSHttpPost")
    public MobileCodeWSHttpPost getMobileCodeWSHttpPost(WebServiceFeature... features) {
        return super.getPort(MobileCodeWSHttpPost, MobileCodeWSHttpPost.class, features);
    }
    /**
     *
     * @return
     *     returns MobileCodeWSHttpGet
     */
    @WebEndpoint(name = "MobileCodeWSHttpGet")
    public MobileCodeWSHttpGet getMobileCodeWSHttpGet() {
        return super.getPort(MobileCodeWSHttpGet, MobileCodeWSHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MobileCodeWSHttpGet
     */
    @WebEndpoint(name = "MobileCodeWSHttpGet")
    public MobileCodeWSHttpGet getMobileCodeWSHttpGet(WebServiceFeature... features) {
        return super.getPort(MobileCodeWSHttpGet, MobileCodeWSHttpGet.class, features);
    }

}
