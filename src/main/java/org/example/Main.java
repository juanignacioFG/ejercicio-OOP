package org.example;

import OOP.Car;
import OOP.Motorbike;


public class Main {
    public static void main(String[] args) {

        Car car1= new Car(4,10,"ford");
        Motorbike moto1 = new Motorbike(2,10,"aprilia");



        System.out.println("car initially drives at "+ car1.getVelocity());
        System.out.println("motorbike initially drives at "+ moto1.getVelocity());

        car1.accelerate();
        System.out.println("car accelerate at " + car1.getVelocity());
        moto1.accelerate();
        System.out.println("motorbike accelerate at " + moto1.getVelocity());

    }
}