package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Get input from the user
        System.out.println("Enter the number: ");
        Scanner keyboard = new Scanner(System.in);
        int counter = keyboard.nextInt();

        String var  = "String Value";
        var = "["+counter+"]";
        System.out.print("["+counter+"]");

        //The code in this loop will ALWAYS execute at least once

        while (counter<=5) {
            System.out.print("["+counter+"]");
            counter++;

        }
        //This will print values in '[]'
        System.out.println("["+counter+"]");


    }
}
