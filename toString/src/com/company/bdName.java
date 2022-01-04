package com.company;

public class bdName {

    private String name;
    private second birthday;

    public bdName(String nm,second bd){

        name= nm;
        birthday=bd;
    }

    public String toString(){

        return String.format("My name is %s ,and my birthday is %s",name,birthday);

    }

}
