package oop.encapsulation;

public class TestPizza {

    public static void main(String[] args) {
        Pizza myPizza=new Pizza();
        System.out.println(myPizza.pizzaName="Mexican Pizza");

        // Setter method: to set value
        myPizza.setToppingName("Mushroom");
        // Getter method: to get value
        System.out.println(myPizza.getToppingName());

        myPizza.setAvailable(true);
        System.out.println(myPizza.isAvailable());
        myPizza.setTypeOfPizza("Grandmas");
        System.out.println("My Favourite pizza type is "+myPizza.getTypeOfPizza());

    }


}
