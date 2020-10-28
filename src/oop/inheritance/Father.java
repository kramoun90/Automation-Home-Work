package oop.inheritance;

public class Father extends GrandFather {

    // Variable
    public String favouriteDish="Beef";
    public String favouriteSport="Cricket";
    public String grandFatherSSN="43534534544";

    private String fatherAccountNumber;

    public Father(){

    }
    public Father(String favouriteDish){
        this.favouriteDish=favouriteDish;
        System.out.println("Father Favourite Dish is "+favouriteDish);
    }
    public Father(String favouriteDish, String favouriteSport){
        this.favouriteDish=favouriteDish;
        this.favouriteSport=favouriteSport;
        System.out.println("Father Favourite Dish is "+favouriteDish+" "+"Sports is "+favouriteSport);
    }

    public String getFatherAccountNumber() {
        return fatherAccountNumber;
    }

    public void setFatherAccountNumber(String fatherAccountNumber) {
        this.fatherAccountNumber = fatherAccountNumber;
    }

    // Methods
    public void swim(){
        System.out.println("Father can swim");
    }

    public void beard(){
        System.out.println("Father has beard");
    }

    public void hairColor(){
        System.out.println("Father's hair color is black");
    }
    public void eyes(){
        System.out.println("Father's  eyes color is blue");
    }



}
