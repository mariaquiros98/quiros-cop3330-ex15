/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/
import java.util.Scanner;

/*Specifying class*/
public class App {
    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Initializing variables*/
        String promptUsername;
        String promptPassword;


        /* Prompting for the username*/
        System.out.println("What is the username?");
        promptUsername = scan.nextLine();

        /*Prompting for the password*/
        System.out.println("What is the password?");
        promptPassword = scan.nextLine();

        /*Creating if/else statement to verify login information*/
        if (promptUsername.equals("cat") && promptPassword.equals("abc$123"))
        {
            System.out.println("Welcome!");
        } else
        {
            System.out.println("I don't know you.");
        }
    }
}