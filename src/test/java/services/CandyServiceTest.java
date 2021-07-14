package services;

import models.Candy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CandyServiceTest {

    @Test
    public void createCandyTest(){

        //Given
        String brand = "Mars";
        String name = "Snickers";
        String type = "chocolate";
        String size = "full-size";
        int qty = 20;
        float price = 1.50F;

        CandyService testService = new CandyService();
        Candy testCandy = CandyService.create(brand, name, type, size, qty, price);

        //When
        int actualId = testCandy.getId();
        String actualBrand = testCandy.getBrand();
        String actualName = testCandy.getName();
        String actualType = testCandy.getType();
        String actualSize = testCandy.getSize();
        int actualQty = testCandy.getQty();
        float actualPrice = testCandy.getPrice();

        //Then
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(name, actualName);
        Assertions.assertEquals(brand, actualBrand);
        Assertions.assertEquals(type, actualType);
        Assertions.assertEquals(size, actualSize);
        Assertions.assertEquals(qty, actualQty);
        Assertions.assertEquals(price, actualPrice);


    }

    @Test
    public void findCandyTest(){
        //Given
        int expectedId = 1;
        String brand = "Mars";
        String name = "Skittles";
        String type = "fruity";
        String size = "family-size";
        int qty = 35;
        float price = 7.99F;

        //When
        Candy testSkittles = CandyService.create(brand, name, type, size, qty, price);
        Candy testFind = CandyService.findCandy(1);

        //Then
        Assertions.assertEquals(testFind, testSkittles);
        Assertions.assertEquals("Skittles", testFind.getName());

    }
    @Test
    public void findCandyTest2(){
        //Given
        int expectedId = 6;
        String brand = "Mars";
        String name = "Skittles";
        String type = "fruity";
        String size = "family-size";
        int qty = 35;
        float price = 7.99F;

        //When
        Candy testSkittles = CandyService.create(brand, name, type, size, qty, price);
        Candy testFind = CandyService.findCandy(1);

        //Then
        Assertions.assertEquals(testFind, testSkittles);

    }

    @Test
    public void findAllTest(){
        //Given

        Candy candy1 = CandyService.create("Hershey", "Reeses", "chocolate", "fun-size", 23, 2.00F);
        Candy candy2 = CandyService.create("Mars", "Starburst", "fruity", "full-size", 70, 2.00F);
        Candy[] expected = {candy1, candy2};

        //When
        Candy[] actual = CandyService.findAll();


        //Then
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void removeTest(){
        //Given

        Candy candy1 = CandyService.create("Hershey", "Reeses", "chocolate", "fun-size", 23, 2.00F);
        Candy candy2 = CandyService.create("Mars", "Starburst", "fruity", "full-size", 70, 2.00F);
        Candy candy3 = CandyService.create("Trolli", "GummiWorms", "gummy", "fun-size", 45, 5.00F);
        Candy[] expected = {candy1, candy2, candy3};

        //When
        boolean actual = CandyService.delete(2);



        //Then
        Assertions.assertTrue(actual);

    }


}
