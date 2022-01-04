package com.company;

public class Main {

    public static void main(String[] args) {
	int ab[]={1,2,3,4,5,6};

	System.out.print("Array is "+ total(ab));

    }

    public static int total(int a[]){

        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+i;//sum+=i;


        }

        return sum;

    }

}
