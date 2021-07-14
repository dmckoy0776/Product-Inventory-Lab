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

        public static Candy findCandy(int id) {
                for (Candy c: inventory) {
                        if (c.getId()== id){
                         return c;
                        }
                }
                return null;
        }

        public static Candy[] findAll() {

                Candy[] candyCopy = new Candy[inventory.size()];
                for (int i = 0; i < inventory.size(); i++) {
                  candyCopy[i] = inventory.get(i);
                }
           return candyCopy;
        }

        public static boolean delete(int id){
                for (Candy c: inventory) {
                        if (c.getId() == id) {
                         inventory.remove(c);
                         return true;
                        }
                }
                return false;
        }





        //returns null if candy Id not found
}
