package com.example.webservice.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.utils.Base64Utils;
import com.example.webservice.hxInvoice.EiInterface;
import com.example.webservice.hxInvoice.EiInterfaceResponse;
import com.example.webservice.hxInvoice.entity.*;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/31 17:24
 */
public class testXml {

    public static void main(String[] args) throws Exception {


        HxInvoiceGoodsInfo hxInvoiceGoodsInfo = new HxInvoiceGoodsInfo();
        hxInvoiceGoodsInfo.setFPHXZ("0");
        hxInvoiceGoodsInfo.setXMMC("*经营租赁*停车费");
        hxInvoiceGoodsInfo.setXMDW("项目单位 可不填");
        hxInvoiceGoodsInfo.setGGXH("规格型号 可不填");
        hxInvoiceGoodsInfo.setXMSL("");
        hxInvoiceGoodsInfo.setHSBZ("0");
        hxInvoiceGoodsInfo.setXMDJ("");
        hxInvoiceGoodsInfo.setSPBM("3040502020200000000");
        hxInvoiceGoodsInfo.setZXBM("自行编码 可不填");
        hxInvoiceGoodsInfo.setYHZCBS("0");
        hxInvoiceGoodsInfo.setLSLBS("");
        hxInvoiceGoodsInfo.setZZSTSGL("");
        hxInvoiceGoodsInfo.setXMJE("5.00");
        hxInvoiceGoodsInfo.setSL("0.05");
        hxInvoiceGoodsInfo.setSE("0.25");

        List<HxInvoiceGoodsInfo> hxInvoiceGoodsInfos = new ArrayList<>();
        hxInvoiceGoodsInfos.add(hxInvoiceGoodsInfo);

        HxInvoiceBaseInfo hxInvoiceBlueAndReadCmd = new HxInvoiceBaseInfo();
        hxInvoiceBlueAndReadCmd.setFPQQLSH("202202222100100114590603608");
        hxInvoiceBlueAndReadCmd.setDDH("test001");
        hxInvoiceBlueAndReadCmd.setCPLX("0");
        hxInvoiceBlueAndReadCmd.setJFFS("0");
        hxInvoiceBlueAndReadCmd.setNSRMC("合肥城市泊车投资管理有限公司瑶海分公司");
        hxInvoiceBlueAndReadCmd.setNSRSBH("91340100MA2NA18K3L");
        hxInvoiceBlueAndReadCmd.setFJH("");
        hxInvoiceBlueAndReadCmd.setDKBZ("");
        hxInvoiceBlueAndReadCmd.setBMB_BBH("编码000001");
        hxInvoiceBlueAndReadCmd.setXHFMC("合肥城市泊车投资管理有限公司瑶海分公司");
        hxInvoiceBlueAndReadCmd.setXHF_NSRSBH("91340100MA2NA18K3L");
        hxInvoiceBlueAndReadCmd.setXHF_DZDH("合肥测试市瑶海区长江东路1052号3栋302室 055165111421");
        hxInvoiceBlueAndReadCmd.setXHF_YHZH("中国建设银行合肥濉溪路支行 34050146380800000251");
        hxInvoiceBlueAndReadCmd.setGHFQYLX("03");
        hxInvoiceBlueAndReadCmd.setGHFMC("张纪德");
        hxInvoiceBlueAndReadCmd.setGHF_NSRSBH("91320682MA1YNP7P2L");
        hxInvoiceBlueAndReadCmd.setGHF_DZDH("保安集团 15256257710");
        hxInvoiceBlueAndReadCmd.setGHF_YHZH("");
        hxInvoiceBlueAndReadCmd.setGHF_EMAIL("wjdnlg@163.com");
        hxInvoiceBlueAndReadCmd.setGHF_SJ("15256257710");
        hxInvoiceBlueAndReadCmd.setKPY("蔡阳test");
        hxInvoiceBlueAndReadCmd.setSKY("张雅倩test");
        hxInvoiceBlueAndReadCmd.setFHR("陶君test");
        hxInvoiceBlueAndReadCmd.setKPLX("1");
        hxInvoiceBlueAndReadCmd.setFPZL_DM("51");
        hxInvoiceBlueAndReadCmd.setYFP_DM("");
        hxInvoiceBlueAndReadCmd.setYFP_HM("");
        hxInvoiceBlueAndReadCmd.setQD_BZ("0");
        hxInvoiceBlueAndReadCmd.setKPHJJE("5.25");
        hxInvoiceBlueAndReadCmd.setHJBHSJE("5");
        hxInvoiceBlueAndReadCmd.setHJSE("0.25");
        hxInvoiceBlueAndReadCmd.setBZ("测试开票");


        HxInvoiceBaseAndGoodsCmd hxInvoiceBaseAndGoodsCmd = new HxInvoiceBaseAndGoodsCmd();
        hxInvoiceBaseAndGoodsCmd.setBaseInfo(hxInvoiceBlueAndReadCmd);
        hxInvoiceBaseAndGoodsCmd.setItems(hxInvoiceGoodsInfos);
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, false);
        String content = Base64Utils.encode(xmlMapper.writeValueAsString(hxInvoiceBaseAndGoodsCmd).getBytes());

        HxInvoiceRequest request = new HxInvoiceRequest();

        Data data = new Data();

        data.setDataDescription(new DataDescription());
        data.setContent(content);

        System.out.println("----------------------------content------------------------");
        System.out.println(content);


        GlobalInfo globalInfo = new GlobalInfo();
        globalInfo.setVersion("1.0");
        globalInfo.setInterfaceCode("YKPFPKJ");
        globalInfo.setTaxpayerId("91340100MA2NA18K3L");
        globalInfo.setAuthorizationCode("STBBWMXH5F");


        request.setGlobalInfo(globalInfo);
        request.setData(data);
        String requestStr = request.toXml();

        System.out.println("---------------------------requestStr----------------------------------");
        System.out.println(requestStr);


        EiInterface eiInterface = new EiInterface();

        eiInterface.setIn0(requestStr);

        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.example.webservice.hxInvoice");
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);
        webServiceTemplate.setDefaultUri("https://www.ahdzfp.com/services/eInvWS?wsdl");
        EiInterfaceResponse eiInterfaceResponse = (EiInterfaceResponse) webServiceTemplate.marshalSendAndReceive(eiInterface);
        String out = eiInterfaceResponse.getOut();


        System.out.println(out);
        XmlMapper xmlMapperReuset = new XmlMapper();

        Map responseMap = xmlMapperReuset.readValue(out, Map.class);


        System.out.println("****************************---------------responseMap---------------******************************");
        System.out.println(responseMap);


        System.out.println("****************************-------------returnMessage-----------------******************************");

        String returnCode = ((Map) responseMap.get("returnStateInfo")).get("returnCode").toString();

        String returnMessage = ((Map) responseMap.get("returnStateInfo")).get("returnMessage").toString();

        System.out.println(returnCode);
        System.out.println(returnMessage);

        String decodeReturnMessage = new String(Base64Utils.decode(returnMessage), "utf-8");

        System.out.println(decodeReturnMessage);

        System.out.println("****************************-------------content-----------------******************************");


    }
}
