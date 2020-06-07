

public class CalculatePythagorean {
    public double calculate(int legA, int legB) {
        int rightAngle = (legA *= legA) + (legB *= legB);
        double hypotenuse = Math.sqrt(rightAngle);
        return hypotenuse;
    }
}