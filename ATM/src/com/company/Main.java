package com.company;
import java.util.Scanner;

public class Main {
    //static void mainMenu() {
        //Scanner input = new Scanner(System.in);
        //System.out.println("Please choose an option");
        //System.out.println("Options: Balance Take money Add money Exit");
        //String option = input.nextLine();
        //if (!option.equals("Balance") && !option.equals("Take money") && !option.equals("Add money") && !option.equals("Exit")) {
            //System.out.println("Please choose the correct option");
            //return;
        //} else {
            //System.out.println("The option is " + option);
        //}
    //}


    static void balance () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount");
        double amount = input.nextDouble();
        if (amount < 0) {
            System.out.println("Invalid amount");
            return;
        } else {
            System.out.println("Your current balance is " + amount);
        }
    }

    static void withdraw () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the current amount");
        double amount = input.nextDouble();
        if (amount < 0) {
            System.out.println("Invalid amount");
            return;
        } else {
            System.out.println("How much would you like to take?");
            double amount2 = input.nextDouble();
            if (amount2 > amount) {
                System.out.println("Error. Please choose different amount");
                return;
            } else {
                double amount3 = (amount - amount2);
                System.out.println("Your current balance is " + amount3);
            }
        }
    }

    static void adding() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the current amount");
        double amount = input.nextDouble();
        if (amount < 0) {
            System.out.println("Invalid amount");
            return;
        } else {
            System.out.println("How much would you like to add?");
            double amount2 = input.nextDouble();
            double amount3 = (amount + amount2);
            System.out.println("Your current balance is " + amount3);
        }
    }

    static void language() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a language. 1 - English. 2 - Latvian. 3 - Russian");
        int lang = input.nextInt();
        if (lang != 1 && lang != 2 && lang != 3) {
            System.out.println("Please choose a correct language option");
            return;
        } else {
            if (lang == 1) {
                System.out.println("The language is English");
            } else {
                if (lang == 2) {
                    System.out.println("The language is Latvian");
                } else {
                    System.out.println("The language is Russian");
                }
            }
        }
    }

    static void currency() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a currency. 1 - EUR  2 - USD");
        int cur = input.nextInt();
        if (cur != 1 && cur != 2) {
            System.out.println("Please choose a correct language option");
            return;
        } else {
            if (cur ==1) {
                System.out.println("The currency is EUR");
            } else {
                System.out.println("The currency is USD");
            }
        }
    }


    public static void main(String[] args) {
        //mainMenu();
        language();
        currency();
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose an option");
        System.out.println("Options: Balance Take money Add money Exit");
        String option = input.nextLine();
        if (!option.equals("Balance") && !option.equals("Take money") && !option.equals("Add money") && !option.equals("Exit")) {
            System.out.println("Please choose the correct option");
            return;
        } else {
            System.out.println("The option is " + option);
        }
        if (option.equals("Balance")){
            balance();
        }
        if (option.equals("Take money")) {
            withdraw();
        }
        if (option.equals("Add money")) {
            adding();
        }
        if (option.equals("Exit")) {
            System.out.println("Bye");
            return;
        }

        //balance();
        //withdraw();
        //adding();
    }
}
