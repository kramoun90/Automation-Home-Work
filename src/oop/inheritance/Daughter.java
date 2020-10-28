package oop.inheritance;

public class Daughter extends Father {

    // Variable
    public String favouriteDish="Fish";
    public String favouriteSport="basketball";
    public String daughterSSN="43534534546";

    private String daughterAccountNumber;

    public Daughter(){

    }
    public Daughter(String favouriteDish){
        this.favouriteDish=favouriteDish;
        System.out.println("Daughter Favourite Dish is "+favouriteDish);
    }
    public Daughter(String favouriteDish, String favouriteSport){
        this.favouriteDish=favouriteDish;
        this.favouriteSport=favouriteSport;
        System.out.println("Daughter Favourite Dish is "+favouriteDish+" "+"Sports is "+favouriteSport);
    }

    public String getDaughterAccountNumber() {
        return daughterAccountNumber;
    }

    public void setDaughterAccountNumber(String daughterAccountNumber) {
        this.daughterAccountNumber = daughterAccountNumber;
    }

    // Methods
    public void musician(){
        System.out.println("Daughter learn music");
    }

    public void honest(){
        System.out.println("Daughter is honest");
    }

    public void model(){
        System.out.println("Daughter is beautiful");
    }
    public void gym(){
        System.out.println("Daughter do yoga");
    }





}
