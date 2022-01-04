package com.company;
import java.io.File;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	try{
	    File f=new File("C:\\Users\\Shamal\\Downloads\\Password 123.txt");
	    Scanner scn= new Scanner(f);//here we send the f object as a parameter to Scanner()

        while (scn.hasNextLine()){

            String show= scn.nextLine();

            System.out.println(show);
        }

    }catch (Exception e){

	    System.out.println("Error"+e);
    }
    }
}
