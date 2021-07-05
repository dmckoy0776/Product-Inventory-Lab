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
}
