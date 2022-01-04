package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int age;
        Scanner ag= new Scanner(System.in);
        age=ag.nextInt();
        System.out.println(age<30 ? "You are Young":"You are elder");


    }
}
