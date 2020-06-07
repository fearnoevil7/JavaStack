public class PythagoreanResults {
    public static void main(String[] args) {
        CalculatePythagorean myHypotenuse = new CalculatePythagorean();
        double results = myHypotenuse.calculate(4, 3);
        System.out.println("The answer is... " + results);
    }
}