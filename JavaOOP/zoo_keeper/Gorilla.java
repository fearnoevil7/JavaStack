public class Gorilla extends Mammal{
    public void throwSomething() {
        this.energyLevel -= 5;
        System.out.println("Gorilla has went bananas and started throwing shit        Energy Level: " + this.energyLevel);
    }
    public void eatBananas() {
        this.energyLevel += 10;
        System.out.println("Gorilla is satisfied after eating a banana and has an energy level of       " + this.energyLevel);
    }
    public void climb() {
        this.energyLevel -= 10;
        System.out.println("Gorilla has climbed a tree       Energy Level: " + this.energyLevel);
    }
}