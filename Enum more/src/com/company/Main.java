package com.company;
import java.util.EnumSet;
public class Main {

    public static void main(String[] args) {

        /* orange Orange1= orange.AMAL; //one by one
        System.out.println(Orange1);
        Orange1.getDetails();

        System.out.println(Orange1.getDetails());*/

       /* for(orange Orange1:orange.values()){//enhance for loop

            System.out.printf("%s\t%s\t%d\n",Orange1,Orange1.getDetails(),Orange1.getAge());*/


        for(orange Orange1:EnumSet.range(orange.AMAL,orange.KAMAL)){//All value nathuwa apita ona gana print karanna

            System.out.printf("%s\t%s\t%d\n",Orange1,Orange1.getDetails(),Orange1.getAge());
        }


    }
}
