package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = num.nextInt();

        if (age <= 18) {
            System.out.println("You are a child\nYour age is " + age);
        }
        else{
            System.out.println("You are an elder\nYour age is "+ age);
        }
    }
}