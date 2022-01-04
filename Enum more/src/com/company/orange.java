package com.company;

public enum orange {

SHAMAL("rusl",25),
AMAL("SLIIT",28),
KAMAL("UOM",33),
SALINDU("Cinec",26);

private final String DETAILS;//CAN BE CREATE CONSTANT VARIABLE INSIDE THE ENUM
private final int AGE;//CAN BE CREATE CONSTANT VARIABLE INSIDE THE ENUM

    orange(String camp,int year){

        DETAILS=camp;
        AGE=year;



    }

    public String getDetails(){
        return DETAILS;

    }

    public int getAge(){
        return AGE;

    }


}
