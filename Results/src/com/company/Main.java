package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner res = new Scanner(System.in);
        System.out.println("Results of Maths ");
        int m = res.nextInt();

        System.out.println("Results of Chemistry ");
        int c = res.nextInt();

        System.out.println("Results of Physics ");
        int p = res.nextInt();

        int avg;

        avg = (m + c + p) / 3;

        if (avg>=75) {
            System.out.println("Your grade is A\nResult is " + avg);
        }
        else if(75>avg && avg>=55){
            System.out.println("Your grade is B\nResult is " + avg);
        }
        else if(55>avg && avg>=35){
            System.out.println("Your grade is C\nResult is " + avg);
        }
        else if (35>avg){
            System.out.println("Your grade is F\nResult is " + avg);
        }
        else{
            System.out.println("Error);

        }
    }
}