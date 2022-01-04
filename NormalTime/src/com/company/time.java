package com.company;

public class time {

    private int hour;
    private int min;
    private int sec;

    public void set(int h, int m, int s) {

        hour = ((h < 24 && h > 0) ? h : 0);
        min = ((m < 60 && m > 0) ? m : 0);
        sec = ((s < 60 && s > 0) ? s : 0);

    }

    public String showSTD() {

        return String.format("%02d:%02d:%02d", hour, min, sec);

    }

    public String showNrm() {

        return String.format("%02d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), min, sec, ((hour > 12) ? "PM" : "Am"));

    }
}
