package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Time {
    private int hours;
    private int min;
    private int sec;
   // public int h,m,s;

/*public static int List<object>input(){

    Scanner inOb= new Scanner(System.in);
    int h=inOb.nextInt();
    int m=inOb.nextInt();
    int s=inOb.nextInt();
   // int arr[]= {h,m,s};

    System.out.println("Hour "+h+"\tMin "+m+"\tSec "+s);

return Arrays.asList(h,m,s);


}*/


 public void set(int h,int m,int s){

     hours=((h<24 && h>0) ? h:0);
     min=((m<60 && m>0) ? m:0);
     sec=((s<60 && s>0) ? s:0);


 }

 public String showTime(){

     return String.format("%02d:%02d:%02d",hours,min,sec);
 }

}
