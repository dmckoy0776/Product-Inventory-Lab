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

    public static IceCream findCream(int id) {
        for (IceCream ice: inventory) {
            if (ice.getId()== id){
                return ice;
            }
        }
        return null;
    }

    public static IceCream[] findAll() {

        IceCream[] creamCopy = new IceCream[inventory.size()];
        for (int i = 0; i < inventory.size(); i++) {
            creamCopy[i] = inventory.get(i);
        }
        return creamCopy;
    }

    public static boolean delete(int id){
        for (IceCream ice: inventory) {
            if (ice.getId() == id) {
                inventory.remove(ice);
                return true;
            }
        }
        return false;
    }
}
