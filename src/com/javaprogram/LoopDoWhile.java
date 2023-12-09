package com.javaprogram;

public class LoopDoWhile {
    public static void main(String[] args) {

        System.out.println("ini adalah awal Program");

        int a=0;
        boolean kondisi=true;
        do {
            a++;
            System.out.println("do while ke-"+a);
            if (a==4){
                kondisi=false;
            }
        }while (kondisi);

        System.out.println("ini adalah akhir program");
    }
}
