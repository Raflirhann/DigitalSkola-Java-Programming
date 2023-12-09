package com.javaprogram;

public class BreakContinueReturn {
    public static void main(String[] args) {

        int a=0;
        while (true){
            a++;
            if (a == 9){
                break;
            } else if (a == 4) {
                continue;

            } else if (a==8) {
                return;

            }
            System.out.println("looping ke = "+a);
        }
    }
}
