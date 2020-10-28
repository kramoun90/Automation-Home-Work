package oop.abstraction;

public interface Car {


    public interface NewCar{
        // Nested Interface
        public void carRoop();


    }

    // Interface: Guideline for future
    // Interface is 100% abstract

    // Variable
    String brand = "Mercedes";
    int carQuantity = 200;
    String seat = "2";
    String headlight = "4";
    boolean gasTank = true;


    // Method: able to declare method on without body
    public void startCar(); // abstract method

    public void stopCar();

    public void carWheel();

    public void carEngine();

    public void carBreak();

    public void steering();

    public void acceleration();


    public static int carDoor(int doorNumber) {
        int totalDoor = 1 * doorNumber;
        return totalDoor;
    }


}
