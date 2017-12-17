package com.design.patterns.abstr;

public class XiAnRouJiaMoStore extends  RouJiaMoStore{

    @Override
    public RouJiaMo createFactory(String type) {
        RouJiaMo mo = null ;
        if("suan".equals(type)) {

        }
        return mo;
    }
}
