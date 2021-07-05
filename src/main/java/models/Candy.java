package models;

public class Candy {
    private int id;
    private String brand;
    private String name;
    private String type;
    private String size;
    private int qty;
    private float price;

    public String getName() {
        return name;
    }

    public void setName(String candyName) {
        this.name = candyName;
    }
}
