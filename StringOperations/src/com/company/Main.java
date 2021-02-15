package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        //String[] myString = new String[9];
        String[] myString = {"Computer", "Plate", "Chair", "Girl", "Boy", "Cat", "Dog", "Shirt", "Determination",
                "Echo"}; //added Echo to check uppercase
        System.out.println("There are " + countStartC(myString) + " elements starting with C");
        System.out.println(); // empty row
        System.out.println(); // empty row
        System.out.println(); // empty row
        System.out.println("There are " + countEndE(myString) + " elements ending with e");
        System.out.println(); // empty row
        System.out.println(); // empty row
        System.out.println(); // empty row
        System.out.println("There are " + countFive(myString) + " elements with length of 5");
        System.out.println(); // empty row
        System.out.println(); // empty row
        System.out.println(); // empty row
        System.out.println("There are " + countContainE(myString) + " elements containing E or e");
        System.out.println(); // empty row
        System.out.println(); // empty row
        System.out.println(); // empty row
        ifContainsTe(myString);



    }

    public static int countStartC(String[] a) {
        int count = 0;
        for (int i=0; i< a.length;i++) {
            Pattern pattern = Pattern.compile("(^[C])");
            Matcher matcher = pattern.matcher(a[i]);
            if (matcher.find()) {
                System.out.println(a[i]);
                count++;
            }
        }
        return count;
    }

    public static int countEndE(String[] a) {
        int count = 0;
        for (int i=0; i< a.length;i++) {
            Pattern pattern = Pattern.compile("([e]$)");
            Matcher matcher = pattern.matcher(a[i]);
            if (matcher.find()) {
                System.out.println(a[i]);
                count++;
            }
        }
        return count;
    }

    public static int countFive(String[] a) {
        int count = 0;
        for (int i=0; i< a.length;i++) {
            if (a[i].length()==5) {
                System.out.println(a[i]);
                count++;
            }
        }
        return count;
    }

    public static int countContainE(String[] a) {
        int count = 0;
        for (int i=0; i< a.length;i++) {
            Pattern pattern = Pattern.compile("([eE])");
            Matcher matcher = pattern.matcher(a[i]);
            if (matcher.find()) {
                System.out.println(a[i]);
                count++;
            }
        }
        return count;
    }

    public static void ifContainsTe(String[] a) {
        int count =0;
        for (int i=0; i< a.length;i++) {
            boolean b = a[i].matches("(?i).*te.*");
            if (b) {
                System.out.println(a[i]);
                count++;
            }
        }
        if(count!=0) {
            System.out.println("Yes, there are elements containing TE");
        }
    }

}
