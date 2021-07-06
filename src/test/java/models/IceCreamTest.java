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
        Assertions.assertEquals(expectedBrand, actual);

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
        Assertions.assertEquals(expectedName, actual);

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
        Assertions.assertEquals(expectedType, actual);

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
        Assertions.assertEquals(expectedId, actual);

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
        Assertions.assertEquals(expectedPrice, actual);

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
        Assertions.assertEquals(expectedQty, actual);

    }

    @Test
    public void constructorTest(){
        //Given
        int id = 54 ;
        String brand = "Ben & Jerry";
        String flavor = "Phish Food";
        String dairyType = "non-dairy coconut";
        float price = 5.50F;
        int qty = 12;

        //When
        IceCream testIce = new IceCream(id, brand, flavor, dairyType, price, qty);

        //Then
        Assertions.assertEquals(id, testIce.getId());
        Assertions.assertEquals(brand, testIce.getBrand());
        Assertions.assertEquals(flavor, testIce.getFlavor());
        Assertions.assertEquals(dairyType, testIce.getDairyType());
        Assertions.assertEquals(price, testIce.getPrice());
        Assertions.assertEquals(qty, testIce.getQty());

    }


}
