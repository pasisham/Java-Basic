package com.company;

public class Main {

    public static void main(String[] args) {
        int ab[][] = {{1, 2}, {3, 4}};
        int cd[][]={{70,80},{90,95}};

        display(ab);
        System.out.print("\n");
        display(cd);


    }

    public static void display(int arr[][]) {

         //arr[][]=new int[10][10];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("\t" + arr[i][j]);
            }
            System.out.print("\n");

        }
    }
}

