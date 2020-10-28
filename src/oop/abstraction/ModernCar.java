package oop.abstraction;

public abstract class ModernCar {
    // abstract class: which is not fully Abstract.
    //

    // Variable
    String modernCarBrand="Tesla";
    double modernCarSuggestedPrice=65000;

    // Abstract method
    public abstract void navigation();
    public abstract void autoLaneControl();
    public abstract void display();
    public abstract void cameras();
    public abstract void selfDriven();
    public abstract void emergencyBreak();
    public abstract void autoGear();

    // static and non static methods are allowed here
    public void dualClimateControl(){
        System.out.println("Modern Car has Dual Climate Control Feature");
    }








}
