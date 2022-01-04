package com.company;

public class Main {

    public static void main(String[] args) {

        int ab[]={10,20,30,40,50};
        change(ab);//change array value

        for(int i=0;i<ab.length;i++){

            System.out.println(ab[i]);

        }


    }
    public static void change(int ch[]){//change ab array to ch after changing

        for(int i=0;i<ch.length;i++){

        ch[i] +=10;


        }

    }
}
