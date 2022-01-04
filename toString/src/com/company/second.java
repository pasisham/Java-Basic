package com.company;
import java.util.Scanner;
public class second {

    private int year;
    private int month;
    private int day;

    public second(){

        System.out.println("Please fill following ");

        Scanner in= new Scanner(System.in);

        System.out.print("Enter your year ");
        int y= in.nextInt();

        System.out.print("Enter your month ");
        int m= in.nextInt();

        System.out.print("Enter your day ");
        int d= in.nextInt();



        year=y;
        month=m;
        day=d;

    System.out.printf("Your Birthday is %s",this+"\n");

    }

    public String toString(){


        return String.format("%d/%d/%d",day,month,year);
    }

}
