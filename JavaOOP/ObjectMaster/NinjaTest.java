public class NinjaTest {
    public static void main(String[] args) {
        Ninja itachi = new Ninja();
        Human donaldTrump = new Human();
        System.out.print(itachi);
        System.out.print(donaldTrump);
        itachi.steal(donaldTrump);
        itachi.runaway();
    }
}