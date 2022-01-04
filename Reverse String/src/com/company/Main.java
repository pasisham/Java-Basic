package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Type your words");
        Scanner scn= new Scanner(System.in);

        String text= scn.nextLine();
        char arr[]=text.toCharArray();

        String str="";
for (int i=arr.length-1;i>=0;i--){

    str=str+arr[i];

}
        System.out.printf("Back word is %s",str);


    }
}
