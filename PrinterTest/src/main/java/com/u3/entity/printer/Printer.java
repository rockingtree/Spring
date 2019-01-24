package com.u3.entity.printer;

import com.u3.api.Ink;
import com.u3.api.Paper;

public class Printer {
    //面向接口编程, 而不是具体的实现类
    private Ink ink = null;
    //
    private Paper paper = null;

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void print(String string) {
        //输出颜色标记
        System.out.println("使用" + ink.getColor(255, 200, 0));
        //逐字符输出到纸张
        for (int i = 0; i < string.length(); i++) {
            paper.putAChar(string.charAt(i));
        }
        //将纸张的内容输出
        System.out.println(paper.getContent());
    }
}
