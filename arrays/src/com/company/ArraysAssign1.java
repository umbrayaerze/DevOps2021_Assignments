package com.company;


public class ArraysAssign1 {
    static int[] myArray = {5, 3, 7, 6, 2, 8};

    public static void forPrintArr() {

        for (int i=0;i<myArray.length-1;i++) {
            System.out.println(myArray[i]);
        }
    }


    public static void forEachPrintArr() {
        for (int tempVar:myArray) {
            System.out.println(tempVar);
        }
    }

    public static void whilePrintArr() {
        int i = 0;
        while (i<= myArray.length-1) {
            System.out.println(myArray[i]);
            i++;
        }
    }

    public static void doWhilePrintArr() {
        int i = 0;
        do{
            System.out.println(myArray[i]);
            i++;
        } while (i<= myArray.length-1);
    }

    public static void main(String[] args) {
        forPrintArr();
        forEachPrintArr();
        whilePrintArr();
        doWhilePrintArr();

    }
}