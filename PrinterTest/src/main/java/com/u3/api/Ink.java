package com.u3.api;

public interface Ink {
    /**
     * 定义打印采用的颜色
     * @param r 红
     * @param g 绿
     * @param b 蓝
     * @return 颜色
     */
    String getColor(int r, int g, int b);
}
