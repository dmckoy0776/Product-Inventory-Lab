package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CandyTest {

    @Test
    public void setNameTest (){
        //Given
        String expectedName = "Kit Kat";

        //When
        Candy candy = new Candy();
        candy.setName(expectedName);

        //Then
        String actualName = candy.getName();
        Assertions.assertEquals(expectedName,actualName);

    }

    @Test
    public void setBrandTest (){
        //Given
        String expectedBrand = "Nestle";

        //When
        Candy candy = new Candy();
        candy.setBrand(expectedBrand);

        //Then
        String actual = candy.getBrand();
        Assertions.assertEquals(expectedBrand, actual);

    }

    @Test
    public void setTypeTest (){
        //Given
        String expectedType = "chocolate";

        //When
        Candy candy = new Candy();
        candy.setType(expectedType);

        //Then
        String actual = candy.getType();
        Assertions.assertEquals(expectedType, actual);

    }

    @Test
    public void setSizeTest (){
        //Given
        String expectedSize = "fun-size";

        //When
        Candy candy = new Candy();
        candy.setSize(expectedSize);

        //Then
        String actual = candy.getSize();
        Assertions.assertEquals(expectedSize, actual);

    }

    @Test
    public void setPriceTest (){
        //Given
        float expectedPrice = 2.50F;

        //When
        Candy candy = new Candy();
        candy.setPrice(expectedPrice);

        //Then
        float actual = candy.getPrice();
        Assertions.assertEquals(expectedPrice, actual);

    }

    @Test
    public void setQtyTest (){
        //Given
        int expectedQty = 30;

        //When
        Candy candy = new Candy();
        candy.setQty(expectedQty);

        //Then
        int actual = candy.getQty();
        Assertions.assertEquals(expectedQty, actual);

    }

//    @Test
//    public void setIdTest (){
//        //Given
//        int expectedId = 242;
//
//        //When
//        Candy candy = new Candy();
//        candy.setId(expectedId);
//
//        //Then
//        int actual = candy.getId();
//        Assertions.assertEquals(expectedId, actual);
//
//    }

    @Test
    public void constructorTest() {
        //Given
        int id = 32;
        String brand = "Hershey";
        String name = "Kisses";
        String type = "chocolate";
        String size = "family-size";
        int qty = 12;
        float price = 7.99F;

        //When
        Candy testCandy = new Candy(id, brand, name, type, size, qty, price);

        //Then
        Assertions.assertEquals(id, testCandy.getId());
        Assertions.assertEquals(brand, testCandy.getBrand());
        Assertions.assertEquals(name, testCandy.getName());
        Assertions.assertEquals(type, testCandy.getType());
        Assertions.assertEquals(size, testCandy.getSize());
        Assertions.assertEquals(qty, testCandy.getQty());
        Assertions.assertEquals(price, testCandy.getPrice());



    }
}
