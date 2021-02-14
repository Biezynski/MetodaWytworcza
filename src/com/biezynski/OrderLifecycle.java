package com.biezynski;

public class OrderLifecycle {

    public static void main(String[] args) {
        ICarFactory carFactory = new CarFactory();
        var mazda1 = carFactory.makeCar("Mazda");
        System.out.println(mazda1.getDescription());
        var opel1 = carFactory.makeCar("Opel");
        System.out.println(opel1.getDescription());
    }
}


