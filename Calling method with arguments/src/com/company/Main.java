package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        show();

    }
    public static void show(){

        System.out.println("What is your name");
        Scanner str= new Scanner(System.in);
        String name= str.nextLine();
        System.out.println("Hello "+ name);
    }

}

