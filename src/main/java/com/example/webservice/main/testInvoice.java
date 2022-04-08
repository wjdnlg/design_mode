package com.example.webservice.main;

import com.example.utils.Base64Utils;
import com.example.webservice.hxInvoice.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/29 15:15
 */
public class testInvoice {
    //原发票代码
    public static String YFP_DM = "034012000211";
    //原发票号码
    public static String YFP_HM = "77086615";

    public static String BZ = "对应正数发票代码:" + YFP_DM + "号码:" + YFP_HM + "冲红";

    public static void main(String[] args) throws Exception {

        String lsh = "20203021147043901650284852";
        //开蓝票
        //test(1, "YKPFPKJ", lsh, 1);
        //开红票
        //test(1, "YKPFPKJ", lsh, 2);

        //
        //Thread.sleep(3000);
        //查询查询开票结果
        test(2, "YKPDDZTCX", lsh, 0);

        //查询剩余
        //test(3, "YKPFPKCCX", null, 0);


    }

    /**
     * @param type 1.开票   2.查询开票结果  3.查询剩余
     * @throws JsonProcessingException
     * @throws UnsupportedEncodingException
     */
    public static void test(int type, String method, String lsh, int redOrBlue) throws Exception {
        //平台密钥： NQ#RREOQJbmhgq*#VmCU@$3k
        //授权码： STBBWMXH5F
        //名 称:                合肥城市泊车投资管理有限公司瑶海分公司
        //纳税人识别号:         91340100MA2NA18K3L
        //地 址、电 话:         合肥市瑶海区长江东路1052号3栋302室 055165111421
        //开户行及账号:         中国建设银行合肥濉溪路支行 34050146380800000251
        String redBz = "测试蓝票";
        String redYFP_DM = "";
        String redYFP_HM = "";
        if (redOrBlue == 2) {
            redBz = BZ;
            redYFP_DM = YFP_DM;
            redYFP_HM = YFP_HM;
        }

        String KpContent =
                "<REQUEST_COMMON_YKPFPKJ class=\"REQUEST_COMMON_YKPFPKJ\">\n" +
                        "    <COMMON_YKPFPKJ_FPT class=\"COMMON_YKPFPKJ_FPT\">\n" +
                        "        <FPQQLSH>" + lsh + "</FPQQLSH>\n" +
                        "        <DDH>test001</DDH>\n" +
                        "        <CPLX>0</CPLX>\n" +
                        "        <JFFS>0</JFFS>\n" +
                        "        <NSRMC>合肥城市泊车投资管理有限公司瑶海分公司</NSRMC>\n" +
                        "        <NSRSBH>91340100MA2NA18K3L</NSRSBH>\n" +
                        "        <FJH></FJH>\n" +
                        "        <BMB_BBH>编码000001</BMB_BBH>\n" +
                        "        <XHFMC>合肥城市泊车投资管理有限公司瑶海分公司</XHFMC>\n" +
                        "        <XHF_NSRSBH>91340100MA2NA18K3L</XHF_NSRSBH>\n" +
                        "        <XHF_DZDH>合肥测试市瑶海区长江东路1052号3栋302室 055165111421</XHF_DZDH>\n" +
                        "        <XHF_YHZH>中国建设银行合肥濉溪路支行 34050146380800000251</XHF_YHZH>\n" +
                        "        <GHFQYLX>03</GHFQYLX>\n" +
                        "        <GHFMC>江苏迅镭激光科技有限公司</GHFMC>\n" +
                        "        <GHF_NSRSBH>91320682MA1YNP7P2L</GHF_NSRSBH>\n" +
                        "        <GHF_DZDH>安徽省合肥市蜀山区xxxxxx 13578752969 15256257710</GHF_DZDH>\n" +
                        "        <GHF_YHZH>6021100008790654</GHF_YHZH>\n" +
                        "        <GHF_EMAIL>470554578@qq.com</GHF_EMAIL>\n" +
                        "        <GHF_SJ>13345678910</GHF_SJ>\n" +
                        "        <KPY>蔡阳test</KPY>\n" +
                        "        <SKY>张雅倩test</SKY>\n" +
                        "        <FHR>陶君test</FHR>\n" +
                        "        <KPLX>" + redOrBlue + "</KPLX>\n" +
                        "        <FPZL_DM>51</FPZL_DM>\n" +
                        "        <YFP_DM>" + redYFP_DM + "</YFP_DM>\n" +
                        "        <YFP_HM>" + redYFP_HM + "</YFP_HM>\n" +
                        "        <QD_BZ>0</QD_BZ>\n" +
                        "        <KPHJJE>-1.00</KPHJJE>\n" +
                        "        <HJBHSJE>-1.00</HJBHSJE>\n" +
                        "        <HJSE>0</HJSE>\n" +
                        "        <BZ>" + redBz + "</BZ>\n" +
                        "    </COMMON_YKPFPKJ_FPT>\n" +
                        "    <COMMON_YKPFPKJ_XMXXS class=\"COMMON_YKPFPKJ_XMXX\">\n" +
                        "        <COMMON_YKPFPKJ_XMXX>\n" +
                        "            <FPHXZ>0</FPHXZ>\n" +
                        "            <XMMC>*经营租赁*停车费</XMMC>\n" +
                        "            <XMDW>项目单位 可不填</XMDW>\n" +
                        "            <GGXH>规格型号 可不填</GGXH>\n" +
                        "            <XMSL></XMSL>\n" +
                        "            <HSBZ>0</HSBZ>\n" +
                        "            <XMDJ></XMDJ>\n" +
                        "            <SPBM>3040502020200000000</SPBM>\n" +
                        "            <ZXBM>自行编码 可不填</ZXBM>\n" +
                        "            <YHZCBS>0</YHZCBS>\n" +
                        "            <LSLBS>3</LSLBS>\n" +
                        "            <ZZSTSGL></ZZSTSGL>\n" +
                        "            <XMJE>-1.00</XMJE>\n" +
                        "            <SL>0</SL>\n" +
                        "            <SE>0</SE>\n" +
                        "            <KCE></KCE>\n" +
                        "        </COMMON_YKPFPKJ_XMXX>\n" +
                        //"        <COMMON_YKPFPKJ_XMXX>\n" +
                        //"            <FPHXZ>0</FPHXZ>\n" +
                        //"            <XMMC>*经营租赁*停车费 </XMMC>\n" +
                        //"            <XMDW>测试项目单位</XMDW>\n" +
                        //"            <GGXH>测试规格型号</GGXH>\n" +
                        //"            <XMSL></XMSL>\n" +
                        //"            <HSBZ>0</HSBZ>\n" +
                        //"            <XMDJ></XMDJ>\n" +
                        //"            <SPBM>3040502020200000000</SPBM>\n" +
                        //"            <ZXBM>自行编码 可不填</ZXBM>\n" +
                        //"            <YHZCBS>0</YHZCBS>\n" +
                        //"            <LSLBS>3</LSLBS>\n" +
                        //"            <ZZSTSGL></ZZSTSGL>\n" +
                        //"            <XMJE>2</XMJE>\n" +
                        //"            <SL>0</SL>\n" +
                        //"            <SE>0</SE>\n" +
                        //"            <KCE></KCE>\n" +
                        //"        </COMMON_YKPFPKJ_XMXX>\n" +
                        "    </COMMON_YKPFPKJ_XMXXS>\n" +
                        "</REQUEST_COMMON_YKPFPKJ>\n";


        String cxjgContent = "<REQUEST_COMMON_YKPDDZTCX>\n" +
                "\t\t<FPQQLSH>" + lsh + "</FPQQLSH>\n" +
                "\t\t<NSRSBH>91340100MA2NA18K3L</NSRSBH>\n" +
                "\t\t<FJH>0</FJH>\n" +
                "</REQUEST_COMMON_YKPDDZTCX>\n";

        String cxsyContent = "<REQUEST_COMMON_YKPFPKCCX> \n" +
                "\t\t<NSRSBH>91340100MA2NA18K3L</NSRSBH>\n" +
                "\t\t<FJH>0</FJH>\n" +
                "\t\t<FPZL_DM></FPZL_DM>\n" +
                "</REQUEST_COMMON_YKPFPKCCX>\n";


        String content = "";

        if (type == 1) {
            content = KpContent;
        }
        if (type == 2) {
            content = cxjgContent;
        }
        if (type == 3) {
            content = cxsyContent;
        }

        //String encodeContent = EncryptUtils.encode(content);

        String encodeContent = Base64Utils.encode(content.getBytes());

        System.out.println("--------------------------------------encodeContent----------------------------");

        System.out.println(encodeContent);

        String requestStr =
                "<?xml version=\"1.0\" encoding=\"utf-8\" ?>" +
                        "<interface xmlns=\"\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                        "  <globalInfo>\n" +
                        "    <version>1.0</version>\n" +
                        "    <interfaceCode>" + method + "</interfaceCode>\n" +
                        "    <taxpayerId>91340100MA2NA18K3L</taxpayerId>\n" +
                        "    <authorizationCode>STBBWMXH5F</authorizationCode>\n" +
                        "  </globalInfo>\n" +
                        "  <Data>\n" +
                        "    <dataDescription>\n" +
                        "      <zipCode>0</zipCode> \n" +
                        "      <encryptCode>0</encryptCode >\n" +
                        "      <codeType>0</codeType>\n" +
                        "    </dataDescription>\n" +
                        "    <content>" +
                        content +
                        "    </content>\n" +
                        "  </Data>\n" +
                        "</interface>\n";

        String requestStrEncode =
                "<?xml version=\"1.0\" encoding=\"utf-8\" ?>" +
                        "<interface xmlns=\"\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                        "  <globalInfo>\n" +
                        "    <version>1.0</version>\n" +
                        "    <interfaceCode>" + method + "</interfaceCode>\n" +
                        "    <taxpayerId>91340100MA2NA18K3L</taxpayerId>\n" +
                        "    <authorizationCode>STBBWMXH5F</authorizationCode>\n" +
                        "  </globalInfo>\n" +
                        "  <Data>\n" +
                        "    <dataDescription>\n" +
                        "      <zipCode>0</zipCode> \n" +
                        "      <encryptCode>0</encryptCode >\n" +
                        "      <codeType>0</codeType>\n" +
                        "    </dataDescription>\n" +
                        "    <content>" +
                        encodeContent +
                        " </content>\n" +
                        "  </Data>\n" +
                        "</interface>\n";


        String testRequest = "<?xml version='1.0' encoding='UTF-8'?><interface><globalInfo><version>1" +
                ".0</version><interfaceCode>YKPFPKJ</interfaceCode><taxpayerId>91340100MA2NA18K3L</taxpayerId><authorizationCode>STBBWMXH5F</authorizationCode></globalInfo><returnStateInfo/><Data><dataDescription><zipCode>0</zipCode><encryptCode>0</encryptCode><codeType>0</codeType></dataDescription><content>PFJFUVVFU1RfQ09NTU9OX1lLUEZQS0o+PENPTU1PTl9ZS1BGUEtKX0ZQVD48RlBRUUxTSD4yMDIyMDQwNjExMTQzMjY0NTk4ODA8L0ZQUVFMU0g+PERESD4yMDIyMDQwNjExMTQzMjYzNjk0OTwvRERIPjxDUExYPjA8L0NQTFg+PEpGRlM+MDwvSkZGUz48TlNSTUM+5ZCI6IKl5Z+O5biC5rOK6L2m5oqV6LWE566h55CG5pyJ6ZmQ5YWs5Y+455G25rW35YiG5YWs5Y+4PC9OU1JNQz48TlNSU0JIPjkxMzQwMTAwTUEyTkExOEszTDwvTlNSU0JIPjxGSkg+MDwvRkpIPjxES0JaLz48Qk1CX0JCSD7nvJbnoIHooajniYjmnKzlj7c8L0JNQl9CQkg+PFhIRk1DPuWQiOiCpeWfjuW4guaziui9puaKlei1hOeuoeeQhuaciemZkOWFrOWPuOeRtua1t+WIhuWFrOWPuDwvWEhGTUM+PFhIRl9OU1JTQkg+OTEzNDAxMDBNQTJOQTE4SzNMPC9YSEZfTlNSU0JIPjxYSEZfRFpESD7lkIjogqXluILnkbbmtbfljLrplb/msZ/kuJzot68xMDUy5Y+3M+agizMwMuWupDwvWEhGX0RaREg+PFhIRl9ZSFpIPuS4reWbveW7uuiuvumTtuihjOWQiOiCpea/iea6qui3r+aUr+ihjCAzNDA1MDE0NjM4MDgwMDAwMDI1MTwvWEhGX1lIWkg+PEdIRlFZTFg+MDE8L0dIRlFZTFg+PEdIRk1DPuaxn+iLj+i/hemVrea/gOWFieenkeaKgOaciemZkOWFrOWPuDwvR0hGTUM+PEdIRl9OU1JTQkg+OTEzMjA2ODJNQTFZTlA3UDJMPC9HSEZfTlNSU0JIPjxHSEZfRFpESD7lronlvr3nnIHlkIjogqXluILonIDlsbHljLp4eHh4eHggMTM1Nzg3NTI5Njk8L0dIRl9EWkRIPjxHSEZfWUhaSD42MDIxMTAwMDA4NzkwNjU0PC9HSEZfWUhaSD48R0hGX0VNQUlMPjQ3MDU1NDU3OEBxcS5jb208L0dIRl9FTUFJTD48R0hGX1NKPjEzMzQ1Njc4OTEwPC9HSEZfU0o+PEtQWT7olKHpmLM8L0tQWT48U0tZPuWRqOaloOaloDwvU0tZPjxGSFI+6Zm25ZCbPC9GSFI+PEtQTFg+MTwvS1BMWD48RlBaTF9ETT41MTwvRlBaTF9ETT48WUZQX0RNLz48WUZQX0hNLz48UURfQlo+MDwvUURfQlo+PEtQSEpKRT4xLjA8L0tQSEpKRT48SEpCSFNKRT4wLjk1PC9ISkJIU0pFPjxISlNFPjAuMDU8L0hKU0U+PEJaPnN0cmluZzwvQlo+PC9DT01NT05fWUtQRlBLSl9GUFQ+PENPTU1PTl9ZS1BGUEtKX1hNWFhTPjxDT01NT05fWUtQRlBLSl9YTVhYPjxGUEhYWj4wPC9GUEhYWj48WE1NQz4q57uP6JCl56ef6LWBKuWBnOi9pui0uTwvWE1NQz48WE1EVy8+PEdHWEgvPjxYTVNMLz48SFNCWj4wPC9IU0JaPjxYTURKLz48U1BCTT4zMDQwNTAyMDIwMjAwMDAwMDAwPC9TUEJNPjxaWEJNLz48WUhaQ0JTPjA8L1lIWkNCUz48TFNMQlMvPjxaWlNUU0dMLz48WE1KRT4wLjk1PC9YTUpFPjxTTD4wLjA1PC9TTD48U0U+MC4wNTwvU0U+PC9DT01NT05fWUtQRlBLSl9YTVhYPjwvQ09NTU9OX1lLUEZQS0pfWE1YWFM+PC9SRVFVRVNUX0NPTU1PTl9ZS1BGUEtKPg==</content></Data></interface>\n";

        //requestStrEncode=testRequest;
        System.out.println("----------requestStr:---------");

        System.out.println(requestStr);

        System.out.println("----------requestStrEncode:---------");

        System.out.println(requestStrEncode);


        EiInterface eiInterface = new EiInterface();

        eiInterface.setIn0(requestStrEncode);

        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.example.webservice.hxInvoice");
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);
        webServiceTemplate.setDefaultUri("https://www.ahdzfp.com/services/eInvWS?wsdl");
        EiInterfaceResponse eiInterfaceResponse = (EiInterfaceResponse) webServiceTemplate.marshalSendAndReceive(eiInterface);
        String out = eiInterfaceResponse.getOut();


        System.out.println(out);
        XmlMapper xmlMapper = new XmlMapper();

        Map responseMap = xmlMapper.readValue(out, Map.class);


        System.out.println("****************************---------------responseMap---------------******************************");
        System.out.println(responseMap);


        System.out.println("****************************-------------returnMessage-----------------******************************");

        String returnMessage = ((Map) responseMap.get("returnStateInfo")).get("returnMessage").toString();

        //String encode = Base64Utils.encode(returnMessage.getBytes());
        System.out.println(returnMessage);

        String decodeReturnMessage = new String(Base64Utils.decode(returnMessage), "utf-8");

        System.out.println(decodeReturnMessage);

        System.out.println("****************************-------------content-----------------******************************");

        if (type != 1) {
            String contentBase64 = ((Map) responseMap.get("Data")).get("content").toString();


            String ecodeContent = new String(Base64Utils.decode(contentBase64), "utf-8");
            System.out.println(ecodeContent);
        }


    }


}
