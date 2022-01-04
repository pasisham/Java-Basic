package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int arr[]= new int[5];
	int sum=0;


		for(int count=0;count<arr.length;count++){
			Scanner num= new Scanner(System.in);
			int n= num.nextInt();
			arr[count]=n;

		}
		for(int count=0;count<arr.length;count++){

			System.out.println("\t"+ arr[count]);

		}


	for(int count=0;count<arr.length;count++){

	    sum+=arr[count];
    }
	System.out.println("\nTotal is "+ sum);

    }
}
