package oop.polymorphism.methodoverloading;

public class Calculator {


    // Method Overloading:

    String name="James";
    String name1="Rois";

    public void doSummation(int num1, int num2){
        int total=num1+num2;
        System.out.println("Summation value is "+total);
    }

    public void doSummation(int num1, int num2, int num3){
        int total=num1+num2+num3;
        System.out.println("Summation value is "+total);
    }
    public void doSummation(int num1, int num2, int num3, int num4){
        int total=num1+num2+num3+num4;
        System.out.println("Summation value is "+total);
    }
    public void doSummation(int num1, int num2, int num3, int num4, String price){
        int total=num1+num2+num3+num4;
        System.out.println("Summation value is "+total+" Price is "+price);
    }



    public static void main(String[] args) {

        Calculator obj=new Calculator();
        obj.doSummation(20,30);
        obj.doSummation(11,22,33);
        obj.doSummation(12,22,32,42);
        obj.doSummation(22,11,500,1000);
        obj.doSummation(400,500,23,56,"In Dollar");



    }











}
