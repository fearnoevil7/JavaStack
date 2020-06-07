public class Calculate {
    public static void main(String[]args) {
        Calculator calculator1 = new Calculator();
        System.out.println(calculator1);
        calculator1.setOperandOne(7);
        calculator1.setOperandTwo(9);
        calculator1.setOperation('+');
        calculator1.performOperation();
        System.out.println("The result to your calculation is....      " + calculator1.getResults());

        calculator1.setOperandOne(16);
        calculator1.setOperandTwo(9);
        calculator1.setOperation('-');
        calculator1.performOperation();
        System.out.println("The result to your calculation is.......       " + calculator1.getResults());
    }
}