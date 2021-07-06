package models;

public class IceCream {
    private int id;
    private String brand;
    private String flavor;
    private String dairyType;
    private float price;
    private int qty;

    public IceCream() {

    }

    public IceCream(int id, String brand, String flavor, String dairyType, float price, int qty) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.dairyType = dairyType;
        this.price = price;
        this.qty = qty;
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFlavor(String iceCreamName) {
        this.flavor = iceCreamName;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getDairyType() {
        return dairyType;
    }

    public void setDairyType(String dairyType) {
        this.dairyType = dairyType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
