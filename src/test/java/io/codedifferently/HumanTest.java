package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class HumanTest {
    
    @Test
    public void constructorTest() {
        // Given
        String firstName = "Fred";
        String lastName = "Flintstone";
        int energy = 50;

        // When
        Human testHuman = new Human(firstName, lastName);
        String actualFirst = testHuman.getFirstName();
        String actualLast = testHuman.getLastName();
        int actualEnergy = testHuman.getEnergy();

        // Then
        Assert.assertEquals(firstName, actualFirst);
        Assert.assertEquals(lastName, actualLast);
        Assert.assertEquals(energy, actualEnergy);
    }

    @Test
    public void eatTest() {
        // Given
        Fruit pineapple = new Fruit("Pineapple", 10);
        int expectedEnergy = 60;
        Human testHuman = new Human("Barney", "Rubble");

        // When
        testHuman.eat(pineapple);
        int actualEnergy = testHuman.getEnergy();

        // Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void workTest() {
        // Given
        Human testHuman = new Human("Fred", "Flinstone");
        int expectedEnergy = 30;
        
        // When 
        testHuman.work(2);
        int actualEnergy = testHuman.getEnergy();

        // Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void energyMaxTest() {
        //given
        Human testHuman = new Human("Wilma", "Flinstone");
        Fruit testFruit1 = new Fruit("Dragon Fruit", 20);
        Fruit testFruit2 = new Fruit("Orange", 20);
        Fruit testFruit3 = new Fruit("Apple", 20);

        //when

        Human.maxEnergy = 100;
        testHuman.eat(testFruit1);
        testHuman.eat(testFruit2);
        testHuman.eat(testFruit3);
        int actualEnergy = testHuman.getEnergy();
        
        //then
        Assert.assertEquals(100, actualEnergy);
    }

    @Test
    public void workMin() {
        //given
        Human testHuman = new Human("Chiquar", "Wanda");

        //when
        testHuman.work(6);
        int actualEnergy = testHuman.getEnergy();

        //then
        Assert.assertEquals(50, actualEnergy);

    }

    @Test
    public void maxEnergyChangeTest() {
        Human h1 = new Human("John", "Doe");
        Fruit testFruit1 = new Fruit("Dragon Fruit", 20);
        Fruit testFruit2 = new Fruit("Orange", 20);
        Fruit testFruit3 = new Fruit("Apple", 20);

        Human.maxEnergy = 150;

        h1.eat(testFruit1);
        h1.eat(testFruit2);
        h1.eat(testFruit3);

        int actualEnergy = h1.getEnergy();

        Assert.assertEquals(110, actualEnergy);
    }
}