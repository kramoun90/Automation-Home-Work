package oop.abstraction;

public class GeneralMotor extends ModernCar implements Car {
    // Concrete class

    // year 2022
    // implemented methods you can modify by your way
    // can we create return/ nonReturn method in concrete class? yes

    // Variable
    String carModel="M22";
    String modelYear="2022";
    static double price=700000;
    // Method
    public static void carInfo(){
        System.out.println("This is GeneralMotor car information");
    }

    public boolean willBeAvailable(boolean availability){
        boolean releaseMonth=availability;
        return releaseMonth;
    }

    public void startCar() {
        System.out.println("GeneralMotor car has start Feature");
    }

    public void stopCar() {
        System.out.println("GeneralMotor car has stop Feature");
    }

    public void carWheel() {
        System.out.println("GeneralMotor car has wheel");
    }

    public void carEngine() {
        System.out.println("GeneralMotor car has Engine");
    }

    public void carBreak() {
        System.out.println("GeneralMotor car has break Feature");
    }

    public void steering() {
        System.out.println("GeneralMotor car has steering");
    }

    public void acceleration() {
        System.out.println("GeneralMotor car has acceleration Feature");
    }


    public void navigation() {
        System.out.println("GeneralMotor car has navigation Feature");
    }

    public void autoLaneControl() {
        System.out.println("GeneralMotor car has autoLaneControl Feature");
    }

    public void display() {
        System.out.println("GeneralMotor car has display Feature");
    }

    public void cameras() {
        System.out.println("GeneralMotor car has cameras Feature");
    }

    public void selfDriven() {
        System.out.println("GeneralMotor car has selfDriven Feature");
    }

    public void emergencyBreak() {
        System.out.println("GeneralMotor car has emergencyBreak Feature");
    }

    public void autoGear() {
        System.out.println("GeneralMotor car has autoGear Feature");
    }
}
