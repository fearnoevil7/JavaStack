public class Bat extends Mammal{
    int BatEnergyLevel = this.energyLevel += 200;
    public void fly() {
        this.energyLevel -= 50;
        System.out.println("Bats taking flight!!!!!!!       Energy Level: " + this.energyLevel);
    }
    public void eatHumans() {
        this.energyLevel += 25;
        System.out.println("Yummy!!!!!!!       EnergyLevel: " + this.energyLevel);
    }
    public void attackTown() {
        this.energyLevel -= 100;
        System.out.println("Bats are terrorizing the town!!!!!!!       EnergyLevel: " + this.energyLevel);
    }
}