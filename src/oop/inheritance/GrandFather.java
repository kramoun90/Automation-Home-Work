package oop.inheritance;

public class GrandFather {

    // Variable
    public String favouriteDish="Salmon";
    public String favouriteSport="football";
    public String grandFatherSSN="43534534543";

    private String grandFatherAccountNumber;

    public GrandFather(){

    }
    public GrandFather(String favouriteDish){
        this.favouriteDish=favouriteDish;
        System.out.println("Grand Father Favourite Dish is "+favouriteDish);
    }
    public GrandFather(String favouriteDish, String favouriteSport){
        this.favouriteDish=favouriteDish;
        this.favouriteSport=favouriteSport;
        System.out.println("Grand Father Favourite Dish is "+favouriteDish+" "+"Sports is "+favouriteSport);
    }

    public String getGrandFatherAccountNumber() {
        return grandFatherAccountNumber;
    }

    public void setGrandFatherAccountNumber(String grandFatherAccountNumber) {
        this.grandFatherAccountNumber = grandFatherAccountNumber;
    }

    // Methods
    public void height(){
        System.out.println("Grand Father Height is 6.2");
    }

    public void weight(){
        System.out.println("Grand Father weight is 160");
    }

    public void jump(){
        System.out.println("Grand Father can jump");
    }
    public void playGame(){
        System.out.println("Grand Father can play football");
    }





}
