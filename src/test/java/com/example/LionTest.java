package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
    public class LionTest{
    private final String sex;
    private final boolean expected;

    public LionTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getLionData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeLionReturnCorrectSexValue() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        assertEquals(expected, lion.doesHaveMane());
    }

    @Test
    public void lionGetKittensShouldBeOneKitten() throws Exception{
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void loinFoodShouldBeList() throws Exception{
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
    @Test
    public void lionAsexualShouldBeException() {
        try {
            Feline feline = new Feline();
            new Lion("Бесполый", feline);
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка",
                    e.getMessage());
        }
    }
    }




