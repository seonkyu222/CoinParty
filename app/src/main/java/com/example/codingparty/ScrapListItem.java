package com.example.codingparty;

public class ScrapListItem {
    private String subStr;
    private String titleStr;

    public void setTitle(String title){
        titleStr=title;
    }

    public void setSub(String sub){
        subStr=sub;
    }

    public String getTitle(){
        return this.titleStr;
    }

    public String getSub(){
        return this.subStr;
    }

}
