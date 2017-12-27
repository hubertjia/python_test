package com.clas;

public enum WeekEnum {

    MONDAY("周一"),
    TUESDAY("周二"),
    WENSDAY("周三"),
    THRUSDAY("周四"),
    FRIDAY("周五");
    private String date;
    private WeekEnum(String date){
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
