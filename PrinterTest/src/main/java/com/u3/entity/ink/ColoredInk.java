package com.u3.entity.ink;

import com.u3.api.Ink;

import java.awt.*;

public class ColoredInk implements Ink {

    @Override
    public String getColor(int r, int g, int b) {
        Color color = new Color(r, g, b);
        //toHexString方法: 返回的字符串表示的无符号整数参数所表示的值以十六进制
        return "#" + Integer.toHexString(color.getRGB()).substring(2);
    }
}
