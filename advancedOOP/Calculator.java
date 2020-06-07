@SuppressWarnings("serial")
public class Calculator implements java.io.Serializable {
    private int operandOne = 0;
    private int operandTwo = 0;
    private char operation;
    private int results;
    
    public Calculator() {
        System.out.println("Calculator has been successfully created!!!!!!!!");
    }
    public void setOperandOne(int operand) {
        this.operandOne = operand;
        System.out.println("Operand has been set to       " + this.operandOne);
    }
    public void setOperandTwo(int operand) {
        this.operandTwo = operand;
        System.out.println("Operand has been set to       " + this.operandTwo);
    }
    public void setOperation(char operator) {
        this.operation = operator;
        System.out.println("Operation one has been set to       " + this.operation);
    }
    public void performOperation(){
        if (this.operation == '+') {
            results = operandOne += operandTwo;
        }
        if (this.operation == '-') {
            results = operandOne -= operandTwo;
        }
        System.out.println("Your calculation has been processed.");
    }
    public int getResults() {
        return results;
    }
}