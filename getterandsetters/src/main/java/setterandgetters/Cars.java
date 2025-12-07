package setterandgetters;

public class Cars {

    // Private fields (Encapsulation: cannot be accessed directly outside the class)
    private String model;
    private String brand;
    private String color;
    private int price;

    // Constructor to initialize car details
    Cars(String model, String brand, String color, int price) {
        this.model = model;   // "this" refers to current object
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    // Getter methods (to read the values of private variables)
    String getmodel() {
        return this.model;
    }

    String getbrand() {
        return this.brand;
    }

    String getcolor() {
        return this.color;
    }

    int getprice() {
        return this.price;
    }

    //  Setter methods (to update/modify the private variables)
    public void setPrice(int price) {
        this.price = price;   // update price
    }

    public void setcolor(String color) {
        this.color = color;   // update color
    }
}
