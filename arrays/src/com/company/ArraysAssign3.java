package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysAssign3 {

    public static void main(String[] args) {
        System.out.println("Please enter the list of grades");
        Scanner scan = new Scanner(System.in);
        byte[] grades = new byte[10];
        for (int i=0; i< grades.length; i++) {
            try {grades[i] = scan.nextByte();} catch (Exception e) {
                System.out.println("Invalid grade");
                return;
            }
            //System.out.println(grades[i]);
            if (grades[i] < 0 || grades[i] > 10) {
                System.out.println("Invalid grade");
                return;
            }
        }
        System.out.println(Arrays.toString(grades));
//        System.out.println("Fails: " + failCount(grades));
//        System.out.println(bestResultCount(grades) + " student(s) got an A");
        int[] hist = histogram(grades);
        System.out.println(Arrays.toString(hist));
        for (int i=0; i< hist.length; i++) {
            System.out.println(hist[i] + " students got " + i);
        }
    }

    public static int failCount(byte[] a) {
        int count = 0;
        for (int i=0; i<a.length; i++) {
            if (a[i]<4) {
                count++;
            }
        }
        return count;
    }

    public static int bestResultCount(byte[] a) {
        int count = 0;
        for (int i=0; i<a.length; i++) {
            if (a[i]==10) {
                count++;
            }
        }
        return count;
    }

    public static int[] histogram(byte[] a) {
       int[] result = new int[11];
       int c;
        for (int j=0; j<result.length; j++) {
            c = 0;
            for (int i=0; i<a.length; i++) {
                if (a[i]==j) {
                    c++;
                }
            }
            result[j] = c;
        }
//        System.out.println(Arrays.toString(result));
        return result;
    }
}
