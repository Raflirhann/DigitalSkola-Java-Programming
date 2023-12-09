package com.javaprogram;

public class TugasLoopStatement {

    public static void main(String[] args) {

        System.out.println("Segitiga Menggunakan Loop Statement");
        System.out.print("\n");

        // Looping dengan 1 For
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                System.out.print("* ");
                if(i==j){
                    break;
                } else if ((i+j)==9) {
                    break;
                }
            }
            System.out.print("\n");
        }
    }
}
