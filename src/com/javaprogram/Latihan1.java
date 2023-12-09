package com.javaprogram;

public class Latihan1 {
    public static void main(String[] args) {
//        System.out.println("Hello world");
//
//        String kata1 = "Helo World";
//        System.out.printf(kata1);
//
//        int a = 2;
//        int b = 3;
//        int c = a+b;
//
//        double angkaBerkoma = 3.567;
//        System.out.printf("penambahan dari a + b = "+c);
//        System.out.println(c+angkaBerkoma);
//
//        String kataBaru = "Nama Saya";
//        String namaSaya = "Rafli";
//        String gabungKata = kataBaru+namaSaya;
//        System.out.println(gabungKata);

        String url = "https://bukugambar.com";
        Boolean isThisTrue = url.startsWith("http");
        System.out.println(isThisTrue);
        Boolean isThisTrue2 = url.endsWith("com");
        System.out.println(isThisTrue2);

        String textRegex = "DigitalSkola203";
        System.out.println(textRegex.replaceAll("[A-Z0-9]",""));

        String textRegex2 = "Saya mendapatkan mobil GTR Rp 13000000";
        System.out.println(textRegex2.replaceAll("[A-Za-z]",""));

        String namaMakanan = "Burger,Pecel,Sate,Cumi Goreng";
        String [] arrayMakanan = namaMakanan.split(",");
        System.out.println(arrayMakanan[0]);
        System.out.println(arrayMakanan[2]);

    }
}
