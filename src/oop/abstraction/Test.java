package oop.abstraction;

public class Test {

    public static void main(String[] args) {

        GeneralMotor gm=new GeneralMotor();
        gm.startCar();
        gm.acceleration();
        gm.carEngine();
        gm.steering();
        gm.stopCar();
       // gm.carDoor();

        //GeneralMotor.carDoor();

       Car.carDoor(4);
       gm.willBeAvailable(true);
       GeneralMotor.carInfo();
       gm.navigation();
       gm.cameras();
       gm.selfDriven();

        System.out.println("**************************");

       Tesla runa=new Tesla();
       runa.startCar();
       runa.largeDisplay();
       runa.boostEngine();
       runa.teslaCarInfo();

        System.out.println("**************************");

        // How to create object?
        // className objectName = new constructorOfClass();
        Tesla souhila=new Tesla();

        Car rois =new Tesla();
       // rois.teslaCarInfo();
        // why we are not able to call tesla class methods?
        // All the methods coming from Car interface only
        rois.startCar();


        AutoPilot nahida=new Tesla();
        nahida.autoPilot();
        nahida.largeDisplay();

        ModernCar ala=new GeneralMotor();
        //ala.willBeAvailable();
        //ala.startCar();
        ala.emergencyBreak();
        ala.dualClimateControl();
        ala.autoLaneControl();

        // Alternative Approach: Method Casting
        ((GeneralMotor) ala).startCar();
        (    (GeneralMotor)      ala   ).startCar();


        //Car myCar=new Car();










    }




}
