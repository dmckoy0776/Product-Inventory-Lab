package services;

import models.Candy;
import models.IceCream;

import java.util.ArrayList;

public class IceCreamService {
    private static int nextId = 1;
    private static ArrayList<IceCream> inventory = new ArrayList<>();

    public static IceCream create(String brand, String flavor, String dairyType, float price, int qty) {

        IceCream createdIceCream = new IceCream(nextId++, brand, flavor, dairyType, price, qty);

        inventory.add(createdIceCream);

        return createdIceCream;
    }
}
