public class CalculatorBrain {
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; // Not a Number
        }
    }

    public double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public double powerOf(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
