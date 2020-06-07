public class WizardTest {
    public static void main(String[] args) {
        Wizard mickyMouse = new Wizard();
        Human ansem = new Human();
        System.out.println(mickyMouse);
        System.out.println(ansem);
        mickyMouse.heal(ansem);
        mickyMouse.fireball(ansem);
    }
}