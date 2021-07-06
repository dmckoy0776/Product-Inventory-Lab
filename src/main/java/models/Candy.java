package models;

public class Candy {
    private int id;
    private String brand;
    private String name;
    private String type;
    private String size;
    private int qty;
    private float price;


    public Candy() {
    }


    public Candy(int id, String brand, String name, String type, String size, int qty, float price) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.type = type;
        this.size = size;
        this.qty = qty;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String candyName) {
        this.name = candyName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
