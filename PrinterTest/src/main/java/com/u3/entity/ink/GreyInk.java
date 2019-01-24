package com.u3.entity.ink;

import com.u3.api.Ink;

import java.awt.*;

public class GreyInk implements Ink {
    //灰色墨水
    @Override
    public String getColor(int r, int g, int b) {
        //rgb值相等就是灰色
        int c = (r+g+b)/3;
        Color color = new Color(c, c, c);
        return "#" + Integer.toHexString(color.getRGB()).substring(2);
    }
}
