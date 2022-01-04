package com.company;



public class Main {

    public static void main(String[] args) {

        subject("Maths");
        argu(1,2,3,4,5);

    }

    public static void subject(String sub){

        System.out.println(sub);


    }

    public static void argu(int ... num){

        for(int i=0;i<num[i];i++){

            System.out.print(num[i]);

        }

    }
}
