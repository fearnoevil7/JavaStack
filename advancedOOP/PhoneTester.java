public class PhoneTester {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("s9", 99, "Verizon", "sensual seduction by snoop dogg");
        Iphone iphoneTen = new Iphone("X", 100, "AT&T", "treasure by bruno mars");

        s9.displayInfo();
        System.out.println(s9.ring());
        System.out.println(s9.unlock());

        iphoneTen.displayInfo();
        System.out.println(iphoneTen.ring());
        System.out.println(iphoneTen.unlock());
    }
}