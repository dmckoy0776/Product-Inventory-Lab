package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IceCreamTest {

    @Test
    public void setBrandTest (){
        //Given
        String expectedBrand = "Turkey Hill";

        //When
        IceCream iceCream = new IceCream();
        iceCream.setBrand(expectedBrand);

        //Then
        String actual = iceCream.getBrand();
        Assertions.assertEquals(actual, expectedBrand);

    }

    @Test
    public void setFlavorTest (){
        //Given
        String expectedName = "Rocky Road";

        //When
        IceCream iceCream = new IceCream();
        iceCream.setFlavor(expectedName);

        //Then
        String actual = iceCream.getFlavor();
        Assertions.assertEquals(actual, expectedName);

    }

    @Test
    public void seDairyTypeTest (){
        //Given
        String expectedType = "non-dairy soy";

        //When
        IceCream iceCream = new IceCream();
        iceCream.setDairyType(expectedType);

        //Then
        String actual = iceCream.getDairyType();
        Assertions.assertEquals(actual, expectedType);

    }

    @Test
    public void setIdTest (){
        //Given
        int expectedId = 2112;

        //When
        IceCream iceCream = new IceCream();
        iceCream.setId(expectedId);

        //Then
        int actual = iceCream.getId();
        Assertions.assertEquals(actual, expectedId);

    }

    @Test
    public void setPriceTest (){
        //Given
        float expectedPrice = 4.50F;

        //When
        IceCream iceCream = new IceCream();
        iceCream.setPrice(expectedPrice);

        //Then
        float actual = iceCream.getPrice();
        Assertions.assertEquals(actual, expectedPrice);

    }

    @Test
    public void setQtyTest (){
        //Given
        int expectedQty = 32;

        //When
        IceCream iceCream = new IceCream();
        iceCream.setQty(expectedQty);

        //Then
        int actual = iceCream.getQty();
        Assertions.assertEquals(actual, expectedQty);

    }


}
