package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    int arr[]=new int[5];
	    Scanner in=new Scanner(System.in);


	    for(int i=0;i<arr.length;i++){
			int input=in.nextInt();

	    	arr[i]=input;
        }
		for(int i=0;i<arr.length;i++){

			System.out.printf("%d\t",arr[i]);

		}
		System.out.println("\n");
		for(int i=4;i>=0;i--){

			System.out.printf("%d\t",arr[i]);

		}


    }
}
