package com.company;

import java.io.File;
/*When creating and finding file, there is a class already created called File*/

public class Main {

    public static void main(String[] args) {
        File f= new File("E:\\Academy\\Test.ppt");

        try{

            if(f.createNewFile()){//createNewFile is a method that can create a file which has extension
//            if(f.mkdir()){//mkddir(make directory) is a method that can create a folder

                System.out.println("File created "+f.getName());
            }
            else
                System.out.println("File already created");

        }catch(Exception e){

            System.out.println("Error" + e);

        }


    }
}
