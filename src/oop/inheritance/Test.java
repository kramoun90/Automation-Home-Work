package oop.inheritance;

public class Test {

    public static void main(String[] args) {
        //- Single level (ex: Class B inherits from Class A)
        // - Multi level (ex: Class C inherits from Class B, and Class B inherits from Class A)
        //- Hierarchical level (ex: Class B and C both inherit from Class A)


        // We have access on public properties only
        // We can not access on private property
        Father myFather = new Father();
        myFather.swim();
        myFather.hairColor();
        myFather.height();
        myFather.weight();

        Son rois = new Son();
        rois.hairStyle();
        rois.beard(); // father class
        rois.jump(); // GrandFather class

        Daughter sadia = new Daughter();
        sadia.musician();
        sadia.eyes(); // father class
        sadia.playGame(); // GrandFather class



        // Java does NOT support multiple inheritance
        // More then one extends is not possible in java








    }


}
