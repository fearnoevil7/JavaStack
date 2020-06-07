public class HumanTest {
    public static void main(String[] args) {
        Human naoya = new Human();
        Human nonito = new Human();
        naoya.attack(nonito);
        System.out.println(nonito.health);
    }
}