package com.example.myapplication;

import java.sql.SQLOutput;

public class TestRelational
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        String name = "Aisha";
        String nameCompare = "Aisha";

        System.out.println("I want to Negate my output~:" + !(name.equals(nameCompare)));
        System.out.println("a == b " + (a == b));
        System.out.println("a != b " + (a != b));
        System.out.println("a > b " + (a > b));
        System.out.println("a < b " + (a < b));
        System.out.println("b >= a " + (b >= a));
        System.out.println("b <= a " + (b <= a));

        //if statements are used to compare if a logic is true of false
        if(name.equals(nameCompare))
        {
            System.out.println("My name is correct!");
        }
        if (a == b)
        {
            System.out.println("My value is the same");
        }
        else{
            System.out.println("The value is different");
        }
    }

}
