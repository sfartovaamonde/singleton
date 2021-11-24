package com.dam1;


public class Main {

    public static void main(String[] args) {
        //no hay que usar el new
        //Objeto obx1 = new Objeto();
    Singleton obx1= Singleton.getInstance();
    obx1.setNombre("Carlos");
    obx1.setEdad(19);


    Singleton obx2 = Singleton.getInstance();
    obx2.setNombre("Juan");
    obx2.setEdad(20);






    }
}
