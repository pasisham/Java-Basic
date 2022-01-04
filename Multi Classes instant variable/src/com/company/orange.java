package com.company;
import java.util.Scanner;

public class orange {
    private String friendName;

    public void getname(){
        String name=friendName;
        Scanner nm= new Scanner(System.in);
        System.out.println("What is your Friend's name?");


    }
    public String setname(){

        return(friendName);
    }
     public void say(){

        System.out.println("Your friend's name is "+ setname());
     }

}
