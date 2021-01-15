package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("--Calculator Execute--");

        Calculator c = new Calculator();
        int addition = c.addition(3,2);
        System.out.println("c.addition(3,2) = "+addition);

        int substraction = c.subtraction(3,2);
        System.out.println("c.subtraction(3,2) = "+substraction);

        float division = c.division(3,2);
        System.out.println("c.division(3,2) = "+division);

        int multiplication = c.multiplication(3,2);
        System.out.println("c.multiplication(3,2) = "+multiplication);

    }
}

