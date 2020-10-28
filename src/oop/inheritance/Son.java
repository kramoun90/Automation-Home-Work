package oop.inheritance;

public class Son extends Father {

    // Variable
    public String favouriteDish="STEAK";
    public String favouriteSport="soccer";
    public String sonSSN="43534534545";

    private String sonAccountNumber;

    public Son(){

    }
    public Son(String favouriteDish){
        this.favouriteDish=favouriteDish;
        System.out.println("Son Favourite Dish is "+favouriteDish);
    }
    public Son(String favouriteDish, String favouriteSport){
        this.favouriteDish=favouriteDish;
        this.favouriteSport=favouriteSport;
        System.out.println("Son Favourite Dish is "+favouriteDish+" "+"Sports is "+favouriteSport);
    }

    public String getSonAccountNumber() {
        return sonAccountNumber;
    }

    public void setSonAccountNumber(String sonAccountNumber) {
        this.sonAccountNumber = sonAccountNumber;
    }

    // Methods
    public void student(){
        System.out.println("Son is a Quality Engineer Student");
    }

    public void player(){
        System.out.println("Son can play soccer");
    }

    public void hairStyle(){
        System.out.println("Son's hair style is Duck");
    }
    public void bodyBuilder(){
        System.out.println("Son's has Belly six pack");
    }





}
