package oop.encapsulation;

public class Pizza {
    // Encapsulation: Data Hiding

    public String pizzaName;


    private String toppingName;
    private int price;
    private char size;
    private String typeOfPizza;
    private boolean isAvailable;

    // Getter and Setter method

    // Getter method
    public String getToppingName() {
        return toppingName;
    }

    // Setter Method
    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getTypeOfPizza() {
        return typeOfPizza;
    }

    public void setTypeOfPizza(String typeOfPizza) {
        this.typeOfPizza = typeOfPizza;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
