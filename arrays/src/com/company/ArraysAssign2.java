package com.company;

public class ArraysAssign2 {
    static int[] myArr = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};

    public static void main(String[] args) {
//        negative();
//        odd();
//        oddAmount();
//        ifSame();
//        printSecond();
//        System.out.println("The average amount is " + avgValue());
        System.out.println("There are "+countSmall()+" elements smaller than " + avgValue());

    }

    public static void negative() {
        for (int i = 0; i<= myArr.length-1;i++) {
            if (myArr[i] < 0) {
                System.out.println(myArr[i]);
            }
        }
    }

    public static void odd() {
        for (int i = 0; i<= myArr.length-1;i++) {
            if (myArr[i] % 2 != 0) {
                System.out.println(myArr[i]);
            }
        }
    }

    public static void oddAmount() {
        int i = 0;
        int o = 0;
        while (i<= myArr.length-1) {
            if (myArr[i] % 2 != 0) {
                o = o+1;
            }
            i++;
        }
        System.out.println("there are " + o + " odd numbers");
    }
    public static void ifSame() {
        for (int j : myArr) {
            for (int k : myArr) {
                if (j == k) {
                }
            }
        }
        System.out.println("Yes, there are duplicate entities in the array");
    }

    public static void printSecond() {
        for (int i = 0; i< myArr.length;i=i+2) {
            System.out.println(myArr[i]);
        }
    }

    public static double avgValue() {
        double sum = 0;
        double avg;
        for (int j : myArr) {
            sum = sum + j;
        }
        avg = sum / myArr.length;
        return avg;
    }

    public static int countSmall() {
        int amount = 0;
        for (int i=0; i<myArr.length; i++) {
            if (myArr[i]<avgValue()) {
                System.out.println(myArr[i]+ " is less than average value");
                amount++;
            }
        }
        return amount;
    }
}
