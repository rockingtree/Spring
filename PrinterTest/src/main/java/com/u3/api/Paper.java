package com.u3.api;

public interface Paper {
    String newLine = "\r\n";

    void putAChar(char c);  //输出一个字符到纸张

    String getContent();    //得到输出纸张上的内容
}
