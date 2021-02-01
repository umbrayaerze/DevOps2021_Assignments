package com.company;
import java.util.Scanner;


public class Main {

    static int dayInput () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day number");
        int day = input.nextInt();

        if (day <=0 || day >7) {
            System.out.println("Error. Please enter the valid day number");
            return 0;
        }
        return day;
    }


    static String dayOfTheWeek(int day) {

        switch (day)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return("It is a working day");
            //break;
            default:
                return("It is a holiday");

        }
    }

    static char gradeInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your grade");
        char inputValue = input.findInLine(".").charAt(0);
        inputValue = Character.toUpperCase(inputValue);
        if (inputValue != 'A' && inputValue != 'B' && inputValue != 'C' && inputValue != 'D' && inputValue != 'E' && inputValue != 'F') {
            System.out.println("Invalid grade");
            return ' ';
        }
        //System.out.println(grade);
        return inputValue;
    }

    static String gradeComment(char grade) {
        switch (grade) {
            case 'A':
            case 'B':
                return "Perfect! You are so clever!";
            case 'C':
                return "Good! But You can do better!";
            case 'D':
            case 'E':
                return "It is not good! You should study!";
            default:
                return "Fail! You need to repeat the exam!";
        }
    }


    static double numInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        double num = input.nextDouble();
        return num;
    }

    static char optInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose the option");
        System.out.println("Options: + - / * % p b s");
        char option = input.findInLine(".").charAt(0);
        if (option != '+' && option != '-' && option != '/' && option != '*' && option != '%' && option != 'p'
                && option != 'P' && option != 'b' && option != 'B' && option != 's' && option != 'S') {
            System.out.println("Invalid option");
            return ' ';
        }
        return option;
    }

    static String calculator(double num1, double num2, char calc) {
        switch (calc) {
            case '+':
                return num1 + " + " + num2 + " = " + (num1+num2);
            case '-':
                return num1 + " - " + num2 + " = " + (num1-num2);
            case '/':
                if (num2 == 0) {
                    return num1 + "/" + num2 + " is invalid. You can not divide by zero";
                }
                return num1 + "/" + num2 + " = " + (num1/num2);
            case '*':
                return num1 + "*" + num2 + " = " + (num1*num2);
            case '%':
                if (num2 == 0) {
                    return "The remainder from dividing " + num1 + " by " + num2 + " is undefined. You can not divide by zero";
                }
                return "The remainder from dividing " + num1 + " by " + num2 + " is " + (num1%num2);
            case 'b':
            case 'B':
                if (num1 == num2) {
                    return "The numbers are equal";
                }
                return "The bigger number is " + Math.max(num1,num2);
            case 's':
            case 'S':
                if (num1 == num2) {
                    return "The numbers are equal";
                }
                return "The bigger number is " + Math.min(num1,num2);
            default:
                return "Entered numbers are " + num1 + " and " + num2;

        }

    }


    public static void main(String[] args) {
        //Day of the week
        int day = dayInput();
        if (day == 0) {
        return;
        }
        System.out.println(dayOfTheWeek(day));

        //Grades
        char grade = gradeInput();
        if (grade == ' ') {
            return;
        }
        System.out.println("The grade is " + grade);
        System.out.println(gradeComment(grade));

        //Calculator
        double num1 = numInput();
        double num2 = numInput();
        char calc = optInput();
        if (calc == ' ') {
            return;
        }
        System.out.println(calculator(num1, num2, calc));
    }
}
