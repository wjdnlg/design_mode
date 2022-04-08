package com.example.webservice.main;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/4/1 16:51
 */
public class test {
    public static void main(String[] args) {
        //test01();
        test02();

    }

    public static void test01() {
        StringBuffer buffer = new StringBuffer("<REQUEST_COMMON_YKPDDZTCX><FPQQLSH>");
        //流水号
        buffer.append("流水号")
                .append("</FPQQLSH><NSRSBH>")
                //纳税人识别号  开票方
                .append("纳税人识别号")
                //分机号固定为0<FJH>0</FJH>
                .append("</NSRSBH><FJH>0</FJH></REQUEST_COMMON_YKPDDZTCX>");
        String s = buffer.toString();
        System.out.println(s);
    }
    public static void test02() {
        String a = "1111";
        String s = a.toString();
        System.out.println(s);
    }
}
