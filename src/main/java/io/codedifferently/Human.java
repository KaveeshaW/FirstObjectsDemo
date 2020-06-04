package io.codedifferently;

public class Human {
    private String firstName;
    private String lastName;
    private int energy;
    //every object has the same version
    //all references point to one variable
    static int maxEnergy = 100;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.energy = 50;
    }

    public void eat(Fruit fruit) {
        if(this.energy + fruit.getEnergy() <= maxEnergy) {
            this.energy = this.energy +  fruit.getEnergy();
        }
        else {
            this.energy = maxEnergy;
            System.out.println("We are full of energy!");
        }
    }

    public void work(int hours) {
        int energySpent = hours * 10;
        if(this.energy - energySpent < 0) {
           System.out.println("Cannot do the work, energy too low. Try to eat something and get this work done later.");
        }
        else {
            this.energy = this.energy - energySpent;
        }
    }

    public int getEnergy() {
        return this.energy;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}