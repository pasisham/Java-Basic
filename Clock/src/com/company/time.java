package com.company;

public class time {

    private int hour;
    private int min;
    private int sec;

    public void setStd(int h,int m,int s){

       hour=((h<24 && h>0) ? h:0);
       min=((m<60 && m>0) ? m:0);
       sec=((s<60 && s>0) ? s:0);

    }

    public String showStd(){


        return String.format("%2d:%02d:%02d",hour, min, sec);
    }
    public String showNm() {

    if(hour==0 || hour==12){

        hour=12;
    }
    else{

        hour=hour%12;
    }

        return String.format("%2d:%02d:%02 S%",/*((hour==0 || hour=12) ? hour=12:hour%12),*/hour, min, sec,(hour < 12 ? "PM" : "AM"));
    }
}
