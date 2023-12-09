package com.javaprogram;

public class LoopingArray {
    public static void main(String[] args) {

        int[] angka = {11,12,13,14,15,16,17,18,19,20};
        System.out.println("Looping standard");
        for (int i=0; i<10; i++){
            System.out.println("Index ke "+i+" adalah = " +angka[i]);
        }

        System.out.println("Looping length");
        for (int i=0; i<angka.length; i++){
            System.out.println("Index ke "+i+" adalah = " +angka[i]);
        }

        System.out.println("looping dengan collection");
        for(int array : angka ){
            System.out.println("index ke "+array+" adalah =" + array);
        }
    }
}
