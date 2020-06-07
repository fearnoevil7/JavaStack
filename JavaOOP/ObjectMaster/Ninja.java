public class Ninja extends Human {
    int ninjaHealth = this.stealth += 7;
    public void steal(Human human) {
        this.health += this.stealth;
        human.health -= this.stealth;
        System.out.println("Ninja has stolen someones health.....      Ninja health: " + this.health + "      Opponent Health: " + human.health);
    }
    public void runaway() {
        this.health -= 10;
        System.out.println("Ninja is running away......      " + this.health);
    }
}