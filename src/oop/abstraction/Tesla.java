package oop.abstraction;

public class Tesla implements Car, BoostEngine {
    // A class can implements multiple interface at a time

    public void teslaCarInfo(){
        System.out.println("Tesla car information");
    }

    public void startCar() {
        System.out.println("Tesla car has start Feature");
    }

    public void stopCar() {
        System.out.println("Tesla car has stop Feature");
    }

    public void carWheel() {
        System.out.println("Tesla car has wheel");
    }

    public void carEngine() {
        System.out.println("Tesla car has Engine");
    }

    public void carBreak() {
        System.out.println("Tesla car has break Feature");
    }

    public void steering() {
        System.out.println("Tesla car has steering Feature");
    }

    public void acceleration() {
        System.out.println("Tesla car has acceleration Feature");
    }


    public void boostEngine() {
        System.out.println("Tesla car has boostEngine Feature");
    }

    public void largeDisplay() {
        System.out.println("Tesla car has largeDisplay Feature");
    }

    public void autoPilot() {
        System.out.println("Tesla car has autoPilot Feature");
    }
}
