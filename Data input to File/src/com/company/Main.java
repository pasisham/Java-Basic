package com.company;
import java.io.FileWriter;
public class Main {

    public static void main(String[] args) {
        try{
	FileWriter fw = new FileWriter("E:\\Academy\\test.txt");

            fw.write("Hello, I am Sham");
	        fw.close();
	        System.out.println("Done");

    }
        catch (Exception e){

            System.out.println("Error"+ e);
        }


    }


}
