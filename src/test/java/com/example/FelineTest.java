package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {

    @Test
    public void felineFoodShouldBeList() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals( List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void felineFamilyShouldBeFeline() {
        Feline feline = new Feline();
        Assert.assertEquals( "Кошачьи", feline.getFamily());
    }

    @Test
    public void felineGetKittensShouldBeOneKitten() {
        Feline feline = new Feline();
        Assert.assertEquals( 1, feline.getKittens());
    }

}
