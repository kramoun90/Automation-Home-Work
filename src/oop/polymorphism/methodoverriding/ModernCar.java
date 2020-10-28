package oop.polymorphism.methodoverriding;

public class ModernCar {

    public void camera360(){
        System.out.println("Modern car has Camera360");
    }


    public void doMultiply(int num1, int num2){
        double multiplyValue=num1*num2;
        System.out.println("Multiply value is "+multiplyValue);
    }


    /**
     * This method is for do division purpose.
     * @param num1
     * @param num2
     * Author: Mahmud
     */
    public void doDivision(int num1, int num2){
        double div=num1/num2;
        System.out.println("Division value is "+div);
    }





}
