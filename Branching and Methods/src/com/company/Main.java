package com.company;

import java.util.Scanner;

public class Main {
    public static void assign1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1");
        short num1 = input.nextShort();
        System.out.println("Enter number 2");
        short num2 = input.nextShort();
        //short num1 = -4;
        //short num2 = 7641;
        //Verify which variable is the largest. Print out information in the console
        //Verify which variable is the smallest. Print out information in the console
        if (num1 > num2) {
            System.out.println("The largest number is " + num1 + ", the smallest number is " + num2);
        } else {
            System.out.println("The largest number is " + num2 + ", the smallest number is " + num1);
        }
        //Verify if both variables are equals. Print out information in the console
        if (num1 != num2) {
            System.out.println(num1 + " does not equal " + num2);
        } else {
            System.out.println(num1 + " equals " + num2);
        }
        //Verify if there are any variables which are odd (uneven). Print out information in the console
        //Verify if there are any variables which are even. Print out information in the console.
        // Not sure if I needed to print actual numbers but did it just in case...
        int x = num1 % 2;
        int y = num2 % 2;
        if (x == 0 && y == 0) {
            System.out.println("There are no odd numbers");
        } else {
            System.out.println("There are odd numbers");
            if (x != 0) {
                System.out.println(num1 + " is odd");
            } else {
                System.out.println(num1 + " is even");
            }
            if (y != 0) {
                System.out.println(num2 + " is odd");
            } else {
                System.out.println(num2 + " is even");
            }
        }
        //Verify if there are any variables which are negative. Print out information in the console
        //Verify if there are any variables which are positive. Print out information in the console
        if (num1 < 0 || num2 < 0) {
            System.out.println("There are negative numbers");
        }
        if (num1 > 0 || num2 > 0) {
            System.out.println("There are positive numbers");
        }
        //Verify if there are any variables which are less than 100. Print out information in the console
        if (num1 < 100 || num2 < 100) {
            System.out.println("There are numbers which are less than 100");
        } else {
            System.out.println("There are no numbers which are less than 100");
        }
    }
    public static void assign2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter time");
        int time = input.nextInt();
        // If the value is smaller than 12, then the greeting message “Good Morning Sunshine!” will be printed out in the console.
        // If the value is between 13 and 19, then the greeting message “Good Afternoon. Work Hard!” will be printed out in the console.
        //If the value is between 20 and 24, then the greeting message “Good Evening. Get some rest!” will be printed out in the console.
        if (time < 0 || time > 24) {
            System.out.println("Error");
            return;
        }
        if (time <= 12) {
            System.out.println("Good Morning, Sunshine!");
        } else {
            if (time <= 19) {
                System.out.println("Good Afternoon. Work Hard!");
            } else {
                System.out.println("Good Evening. Get some rest!");
            }
        }
    }
    //Change the time variable value to 20 and look at the console. Which greeting message is printed out in the console?
    //Change the time variable value to -2 and look at the console. Please add correct verification in the code!
    //Change the time variable value to 100 and look at the console. Please add correct verification in the code!


    public static void assign3() {
        // Write a program to format and print out the value of the date.
        // Create variables day, month and year.
        // Initialize the variables with the values as You want.
        // Verify if day, month and year are correct. For example, day can not be -10, or month can not be 34, year can not be -2032.
        // If the variables are incorrect, please inform the user.
        // If all variables are in the correct range, please print out the date in the following format: YYYY/MM/DD
        // Please ask the user to write the day, month and year values in the console.
        // Read them and store in the day, month and year variables.
        // Please ask the user in what format he/she wants to print out the date in the console: 1 - YYYY/MM/DD, 2- YYYY.MM.DD.
        // Read the answer and do a branching in the code related to the user answer.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year");
        int y = input.nextInt();
        System.out.println("Enter the month");
        int m = input.nextInt();
        System.out.println("Enter the day");
        int d = input.nextInt();
        System.out.println("Choose the date separator");
        String sep = input.next();
        if (m <= 0 || d <= 0 || y < 0 || m >= 13 || d > 31) {
            System.out.println("Incorrect date");
            return;
        }
        //now I'll assume there are no leap years
        if (m == 2 && d > 28) {
            System.out.println("Incorrect date");
            return;
        }
        if ((m == 4 || m == 6 || m == 9 || m == 11) && d == 31) {
            System.out.println("Incorrect date");
            return;
        }
        if (!sep.equals(".") && !sep.equals("/")) {
            System.out.println("Incorrect separator");
            return;
        }
        String ystr, mstr, dstr;
        if (y < 10) {
            ystr = ("000" + y);
        } else {
            if (y < 100) {
                ystr = ("00" + y);
            } else {
                if (y < 1000) {
                    ystr = ("0" + y);
                } else {
                    ystr = ("" + y);
                }
            }
        }
        if (m < 10) {
            mstr = ("0" + m);
        } else {
            mstr = ("" + m);
        }
        if (d < 10) {
            dstr = ("0" + d);
        } else {
            dstr = ("" + d);
        }
        System.out.println("Your date is " + ystr + sep + mstr + sep + dstr);
    }

    public static void main(String[] args) {
       //assign1();
       //assign2();
        assign3();
    }
}


