package com.javaprogram;

public class Runner {
    public static void main(String[] args) {

        Class1 class1 = new Class1(8,"Joni","Kongo");
//        class1.setName("Koni");
//        class1.setNumber(99);
//        class1.setClub("Arabian");

        System.out.println(class1.getName());
        System.out.println(class1.getNumber());
        System.out.println(class1.getClub());

        //ParentChild
        Child child = new Child();
        Parent parent = new Parent();

        //child bisa memanggil funct parent
        System.out.println(child.parentName());
        //child bisa memanggil func sendiri
        System.out.println(child.namaAnak());
        //parent bisa memanggil funct sendiri
        System.out.println(parent.umurAyah());

    }
}
