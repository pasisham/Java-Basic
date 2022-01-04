package com.company;

enum day{

    SUN,MON,TUE,WEN,THU,FRI,SAT;

}

public class Main {

    public static void main(String[] args) {

        day dd= day.FRI;

        switch (dd) {
            case SUN:
                System.out.println("Sunday");
                break;

            case MON:
                System.out.println("Monday");
                break;

            default:
            System.out.println("Error");


        }

    }
}
