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


    static String dayOfTheWeek(int param1) {

            switch (param1)
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
        char input2 = input.findInLine(".").charAt(0);
        char grade = Character.toUpperCase(input2);
        if (grade != 'A' && grade != 'B' && grade != 'C' && grade != 'D' && grade != 'E' && grade != 'F') {
            System.out.println("Invalid grade");
            return ' ';
        }
        System.out.println(grade);
        return grade;
    }







    public static void main(String[] args) {
        //int day = dayInput();
        //if (day == 0) {
            //return;
        //}
        //System.out.println(dayOfTheWeek(day));
        gradeInput();
    }
}
