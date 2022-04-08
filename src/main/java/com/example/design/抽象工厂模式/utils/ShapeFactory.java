package com.example.design.抽象工厂模式.utils;

import com.example.design.工厂模式.service.Shape;
import com.example.design.工厂模式.service.impl.Circle;
import com.example.design.工厂模式.service.impl.Rectangle;
import com.example.design.工厂模式.service.impl.Square;
import com.example.design.抽象工厂模式.service.color.Color;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/23 15:45
 */
public class ShapeFactory extends AbstractFactory  {
    @Override
    public Color getColor(String color) {
        return null;
    }

    //使用 getShape 方法获取形状类型的对象
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
