package com.example.webservice.main;

import com.example.webservice.mobile.MobileCodeWS;
import com.example.webservice.mobile.MobileCodeWSSoap;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/29 10:14
 */
public class testMobile {

    public static void main(String[] args) {

        //创建一个MobileCodeWS工厂
        MobileCodeWS factory = new MobileCodeWS();
        //根据工厂创建一个MobileCodeWSSoap对象
        MobileCodeWSSoap mobileCodeWSSoap = factory.getMobileCodeWSSoap();
        ////调用WebService提供的getMobileCodeInfo方法查询手机号码的归属地
        String searchResult = mobileCodeWSSoap.getMobileCodeInfo("18715156634", null);
        System.out.println(searchResult);

    }
}
