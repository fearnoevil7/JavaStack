public class Wizard extends Human {
    int wizardHealth = this.health -= 50;
    int wizardIntelligence = this.intelligence += 5;
    public void heal(Human human) {
        human.health += this.intelligence;
        System.out.println("Wizard has healed someone.....    other person health: " + human.health);
    }
    public void fireball(Human human) {
        human.health -= this.intelligence * 3;
        System.out.println("Wizard has shot a fireball at someone.....     Opponent health: " + human.health + "       Wizard Health: " + this.health);
    }
}