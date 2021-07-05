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
        Assertions.assertEquals(actualName, expectedName);

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
        Assertions.assertEquals(actual, expectedBrand);

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
        Assertions.assertEquals(actual, expectedType);

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
        Assertions.assertEquals(actual, expectedSize);

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
        Assertions.assertEquals(actual, expectedPrice);

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
        Assertions.assertEquals(actual, expectedQty);

    }

    @Test
    public void setIdTest (){
        //Given
        int expectedId = 242;

        //When
        Candy candy = new Candy();
        candy.setId(expectedId);

        //Then
        int actual = candy.getId();
        Assertions.assertEquals(actual, expectedId);

    }
}
