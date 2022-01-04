package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner mn=new Scanner(System.in);
        int month=mn.nextInt();

        switch (month){
            case 1 :
                System.out.println("Your month is January");
                break;
            case 2 :
                System.out.println("Your month is February");
                break;

            default :
                    System.out.println("*****");
        }

    }
}
