package com.javaprogram;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        String input;

        Scanner inputUser = new Scanner(System.in);

        System.out.println("Panggil nama : ");
        input = inputUser.next();

        switch (input){
            case "Luffy":
                System.out.println("Hadir");
                break;
            case "Zoro":
                System.out.println("Hadir ");
                break;
            default:
                System.out.println("Tidak Hadir");
        }
        System.out.println("ini akhir dari program");
    }
}
