package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner num=new Scanner(System.in);
//Here we don't want to use Scanner method twice or more. It can only use num for all the variables
        System.out.println("Enter the 1st number");
        int n1=num.nextInt();
        System.out.println("\n");

        System.out.println("Enter the 2nd number");
        int n2= num.nextInt();

        int ans;

        ans=n1+n2;


        System.out.println("\nAnswer is "+ ans);
    }
}
