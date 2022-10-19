package ie.atu;

public class Calculator {
    public int calcValue;

    public Calculator() {
        calcValue = 0;
    }

    public int add() {
        int firstNum = 4;
        int secondNum = 2;
        calcValue = firstNum + secondNum;
        return calcValue;
    }

    public Calculator(int startValue) {
        if (startValue > 5) {
            calcValue = startValue;
        } else {
            throw new IllegalArgumentException("This is not a valid number");
        }
    }
}
