package oop.polymorphism.methodoverriding;

public class Bmw extends ModernCar {
    // child class: Bmw
    // Parent class: ModernCar
    // @ Annotation: Override

    // Method Overriding
    @Override
    public void camera360() {
        System.out.println("Bmw car has Camera360");
        int num1 = 20;
        int num2 = 40;
        int salary = num1 + num2;
        System.out.println(salary);
    }

    // OverLoaded method
    public void doMultiply(int num1, int num2, int num3) {
        double multiplyValue = num1 * num2 * num3;
        System.out.println("Multiply value is " + multiplyValue);
    }

    @Override
    public void doMultiply(int num1, int num2) {
        double multiplyValue = num1 * num2;
        System.out.println("Multiply value is " + multiplyValue);
    }

    @Override
    public void doDivision(int num1, int num2) {
        double div = num1 / num2;
        System.out.println("Bmw Division value is " + div);
    }




}
