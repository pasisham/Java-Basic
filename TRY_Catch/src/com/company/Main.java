package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

    Scanner input=new Scanner(System.in);

    int x=1;

    do {


        try {
            System.out.println("Enter your number 1: ");
            int n1 = input.nextInt();

            System.out.println("Enter your number 2: ");
            int n2 = input.nextInt();

            int ans;
            ans = n1 / n2;
            x=2;

            System.out.printf("\nYour answer is %d", ans);
        } catch (Exception e) {

            System.out.println("Please check the value");
        }
    }while(x==1);// while true the above code 1. x==1


    }

}
