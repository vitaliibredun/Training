public class Calculator {

    public void calc(String userInput) {
        char operator = '?';
        int operatorIndex = 0;
        int operatorCounter = 0;
        for (int i = 0; i < userInput.length(); i++) {
            char nextChar = userInput.charAt(i);
            if (nextChar == '+' || nextChar == '-' || nextChar == '/' || nextChar == '*') {
                operatorCounter++;
                if (operatorCounter > 1) {
                    throw new IllegalArgumentException("Несколько операторов не поддерживаются");
                }
                operator = nextChar;
                operatorIndex = i;
            }
        }

        try {
            String firstNumber = userInput.substring(0, operatorIndex);
            String secondNumber = userInput.substring(operatorIndex + 1);

            int firstNum = parseNumber(firstNumber);
            int secondNum = parseNumber(secondNumber);

            switch (operator) {
                case '+':
                    System.out.println("Input: " + userInput + ". Result: " + (firstNum + secondNum));
                    break;
                case '-':
                    System.out.println("Input: " + userInput + ". Result: " + (firstNum - secondNum));
                    break;
                case '/':
                    System.out.println("Input: " + userInput + ". Result: " + (firstNum / secondNum));
                    break;
                case '*':
                    System.out.println("Input: " + userInput + ". Result: " + (firstNum * secondNum));
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + operator);
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException("Что-то не так с цифорками: " + e.getMessage());
        }
    }

    private int parseNumber(String numberAsString) {
        int num;
        try {
            num = Integer.parseInt(numberAsString);
            if (num < 1 || num > 10) {
                throw new IllegalArgumentException("Нельзя числа меньше 1 и больше 10");
            }
        } catch (NumberFormatException e) {
            num = toArabic(numberAsString);
        }

        return num;
    }

    private int toArabic(String rome) {
        switch (rome) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                throw new IllegalArgumentException("Значение [" + rome + "] не допустимо");
        }
    }
}
