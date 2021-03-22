package simpleCalculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        double firstNumber = 1;
        double secondNumber = 2;
        double calculationResult = 3;
        String calculationMethod = "+";
        String answer = " ";

        while (!answer.equals("quit")) {
            answer = simpleCalculator.getNumber("Please enter first number or quit to exit");
            if (!answer.equals("quit")) {
                firstNumber = Double.parseDouble(answer);
            }
            if (!answer.equals("quit")) {
                answer = simpleCalculator.getNumber("Please enter second number or quit to exit");
            }
            if (!answer.equals("quit")) {
                secondNumber = Double.parseDouble(answer);
            }
            if (!answer.equals("quit")) {
                answer = simpleCalculator.getCalculationMethod();
            }
            if (!answer.equals("quit")) {
                calculationMethod = answer;
                calculationResult = simpleCalculator.calculate(firstNumber, secondNumber, calculationMethod);
                System.out.println(firstNumber + " " + calculationMethod + " " + secondNumber + " = " + calculationResult);
            }
        }
    }

    public String getNumber(String message) {
        Scanner in = new Scanner(System.in);
        String input = " ";
        while (!isNumeric(input) && !input.equals("quit")) {
            System.out.println(message);
            input = in.nextLine();
            System.out.println("You entered " + input);
        }
        return input;
    }

    public String getCalculationMethod() {
        Scanner in = new Scanner(System.in);
        String input = " ";
        while (!input.equals("quit") &&
                !input.equals("+") &&
                !input.equals("-") &&
                !input.equals("*") &&
                !input.equals("/")) {
            System.out.println("Please enter calculation method ( + - / * or quit to exit) ");
            input = in.nextLine();
            System.out.println("You entered " + input);
        }
        return input;
    }

    public double calculate(double firstNumber, double secondNumber, String calculationMethod) {
        double calculationResult = 0;
        switch (calculationMethod) {
            case "+":
                calculationResult = firstNumber + secondNumber;
                break;
            case "-":
                calculationResult = firstNumber - secondNumber;
                break;
            case "*":
                calculationResult = firstNumber * secondNumber;
                break;
            case "/":
                //ToDo prevent division trough zero
                calculationResult = firstNumber / secondNumber;
                break;
        }
        return calculationResult;

    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
