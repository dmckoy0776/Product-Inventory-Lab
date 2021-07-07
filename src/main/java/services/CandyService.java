package services;

import models.Candy;

import java.util.ArrayList;

public class CandyService {
        private static int nextId = 1;
        private static ArrayList<Candy> inventory = new ArrayList<>();


        public static Candy create(String brand, String name, String type, String size, int qty, float price) {

                Candy createdCandy = new Candy(nextId++, brand, name, type, size, qty, price);

                inventory.add(createdCandy);

                return createdCandy;
        }
}
