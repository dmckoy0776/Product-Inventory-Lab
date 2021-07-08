package services;

import models.Candy;
import models.IceCream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IceCreamServiceTest {

    @Test
    public void createIceCreamTest() {

        //Given
        String brand = "Hershey";
        String flavor = "Cookies-n-Creme";
        String dairyType = "dairy";
        float price = 5.99F;
        int qty = 23;

        IceCreamService testService = new IceCreamService();
        IceCream testCream = IceCreamService.create(brand, flavor, dairyType, price, qty);

        //When
        int actualId = testCream.getId();
        String actualBrand = testCream.getBrand();
        String actualFlavor = testCream.getFlavor();
        String actualType = testCream.getDairyType();
        int actualQty = testCream.getQty();
        float actualPrice = testCream.getPrice();

        //Then
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(flavor, actualFlavor);
        Assertions.assertEquals(brand, actualBrand);
        Assertions.assertEquals(dairyType, actualType);
        Assertions.assertEquals(qty, actualQty);
        Assertions.assertEquals(price, actualPrice);

    }
}
