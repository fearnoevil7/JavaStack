import java.util.ArrayList;
public class Samurai extends Human {
    int SamuraiHealth = this.health += 100;
    ArrayList<Samurai> allSamurais = new ArrayList<Samurai>();
    public void deathBlow(Human human) {
        human.health = 0;
        this.health /= 2;
        System.out.println("Death Blow dealt!!!!!!!       Samurai Health: " + this.health + "      Opponent Health: " + human.health);
    }
    public void meditate() {
        this.health *= 2;
        System.out.println("Samurai has healed!!!!!!!      Health: " + this.health);
    }
    public int howMany() {
        int numberOfSamurai = allSamurais.size();
        System.out.println("Number of samurai is        " + allSamurais.size());
        return numberOfSamurai;
    }
    public void enrollSamurai(Samurai samurai) {
        allSamurais.add(samurai);
        System.out.println("Successfully enrolled samurai to count");
    }
}