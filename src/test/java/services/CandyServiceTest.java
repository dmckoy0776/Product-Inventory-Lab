package services;

import models.Candy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

}
