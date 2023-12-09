package com.javaprogram;

import java.util.Scanner;
public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("input nilai pertama :");
            int n1 = input.nextInt();
            System.out.print("input nilai kedua :");
            int n2 =input.nextInt();

            int sum=n1/n2;
            System.out.println("sum");
        }catch (Exception e){
            System.out.print("Kamu bisa");
        }

    }
}
