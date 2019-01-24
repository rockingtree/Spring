package com.u3.entity.paper;

import com.u3.api.Paper;

public class TextPaper implements Paper {
    private int charPerLine;   //每行字符数
    private int linePerPage;    //每页行数
    private String content = "";         //纸张内容
    private int posX = 0;   //当前横向位置, 从0到charPerLine-1
    private int posY = 0;   //当前行数, 从0到linePerPage-1
    private int posP = 1;   //当前页数

    @Override
    public void putAChar(char c) {
        content += c;
        ++posX;
        //判断是否换行
        if (posX == charPerLine) {
            content += Paper.newLine;
            posX = 0;
            ++posY;
        }
        //判断是否翻页
        if (posY == linePerPage) {
            content += "==第" + posP + "页==";
            content += Paper.newLine + Paper.newLine;
            posY = 0;
            ++posP;
        }
    }

    @Override
    public String getContent() {
        StringBuilder cont = new StringBuilder(this.content);
        //补齐本页空行, 并显示页码
        if (!(posX == 0 && posY == 0)) {
            int count = linePerPage - posY;
            for (int i = 0; i < count; i++) {
                cont.append(Paper.newLine);
            }
            cont.append("==第").append(posP).append("页==");
        }
        return String.valueOf(cont);
    }

    public void setCharPerLine(int charPerLine) {
        this.charPerLine = charPerLine;
    }

    public void setLinePerPage(int linePerPage) {
        this.linePerPage = linePerPage;
    }
}
