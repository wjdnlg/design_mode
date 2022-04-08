package com.example.webservice.main;

import com.example.webservice.weather.ArrayOfString;
import com.example.webservice.weather.WeatherWS;
import com.example.webservice.weather.WeatherWSSoap;

import java.util.List;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/28 17:46
 */
public class testWeather {
    public static void main(String[] args) {
        WeatherWS factory = new WeatherWS();
        //根据工厂创建一个WeatherWSSoap对象
        WeatherWSSoap weatherWSSoap = factory.getWeatherWSSoap();
        //调用WebService提供的getWeather方法获取南宁市的天气预报情况
        ArrayOfString weatherInfo = weatherWSSoap.getWeather("合肥", null);
        List<String> lstWeatherInfo = weatherInfo.getString();
        //遍历天气预报信息
        for (String string : lstWeatherInfo) {
            System.out.println(string);
            System.out.println("------------------------");
        }
    }
}
