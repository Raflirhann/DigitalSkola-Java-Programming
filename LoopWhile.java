package com.javaprogram;

public class LoopWhile {
    public static void main(String[] args) {

        int a = 0;
        boolean kondisi = true;

        while (kondisi){
            System.out.println("while loop ke-"+a);
            a++; // nilai a + 1 = 1
            if (a==20){
                kondisi=false;
            }
        }

    }
}
