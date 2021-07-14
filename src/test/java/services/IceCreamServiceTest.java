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
    @Test
    public void findCreamTest(){
        //Given
        int expected = 1;
        String brand = "Hershey";
        String flavor = "Cookies-n-Creme";
        String dairyType = "dairy";
        float price = 5.99F;
        int qty = 23;

        //when
        IceCream testCream = IceCreamService.create(brand, flavor, dairyType, price, qty);
        IceCream testFind = IceCreamService.findCream(1);

        //then
        Assertions.assertEquals(brand, testFind.getBrand());

    }

    @Test
    public void findAllTest(){
        //Given

        IceCream cream1 = IceCreamService.create("Hershey", "Chocolate", "dairy", 3.99F, 30);
        IceCream cream2 = IceCreamService.create("Talenti", "Mocha Chip", "dairy", 5.00F, 50);
        IceCream[] expected = {cream1, cream2};

        //When
        IceCream[] actual = IceCreamService.findAll();


        //Then
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void removeTest() {
        //Given

        IceCream cream1 = IceCreamService.create("Hershey", "Chocolate", "dairy", 3.99F, 30);
        IceCream cream2 = IceCreamService.create("Talenti", "Mocha Chip", "dairy", 5.00F, 50);
        IceCream cream3 = IceCreamService.create("Ben & Jerry", "Cannoli", "dairy", 4.50F, 15);
        IceCream[] expected = {cream2, cream3};

        //When
        boolean actual = IceCreamService.delete(1);
        IceCream[] actualInventory = IceCreamService.findAll();


        //Then
        Assertions.assertTrue(actual);
        Assertions.assertArrayEquals(expected,  actualInventory);
    }
}
