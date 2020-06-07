public class SamuraiTest {
    public static void main(String[] args) {
        Samurai jack = new Samurai();
        Human akoo = new Human();
        System.out.println(akoo);
        System.out.println(jack);
        jack.meditate();
        jack.deathBlow(akoo);
        System.out.println(jack.health);
        jack.enrollSamurai(jack);
        jack.howMany();
    }
}