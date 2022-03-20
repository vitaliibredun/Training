import java.util.Scanner;

public class Calculator01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Давай же: ");
        String userInput = scanner.nextLine();

        int operatorCounter = 0;
        for (int i = 0; i < userInput.length(); i++) {
            char nextChar = userInput.charAt(i);
            if (nextChar == '+' || nextChar == '-' || nextChar == '/' || nextChar == '*') {
                operatorCounter++;
            }
        }

        if (operatorCounter != 1) {
            throw new IllegalArgumentException("Несколько операторов не поддерживаются");
        }

        char operator = '?';
        int operatorIndex;
        operatorIndex = userInput.indexOf('+');
        if (operatorIndex != -1) {
            operator = '+';
        }

        if (operator == '?') {
            operatorIndex = userInput.indexOf('-');
            if (operatorIndex != -1) {
                operator = '-';
            }
        }

        if (operator == '?') {
            operatorIndex = userInput.indexOf('/');
            if (operatorIndex != -1) {
                operator = '/';
            }
        }

        if (operator == '?') {
            operatorIndex = userInput.indexOf('*');
            if (operatorIndex != -1) {
                operator = '*';
                operatorCounter++;
            }
        }

        if (operatorCounter != 1) {
            throw new IllegalArgumentException("Криво. Пример: 6+1");
        }

        try {
            String firstNumber = userInput.substring(0, operatorIndex);
            String secondNumber = userInput.substring(operatorIndex + 1);

            int firstNum = Integer.parseInt(firstNumber);
            int secondNum = Integer.parseInt(secondNumber);

            // || - или
            // && - и
            if (firstNum < 1 || firstNum > 10 || secondNum < 1 || secondNum > 10) {
                throw new IllegalArgumentException("Нельзя числа меньше 1 и больше 10");
            }

            //1 - I
            //2 - II
            //3 - III
            //4 - IV
            //5 - V
            //6 - VI
            //7 - VII
            //8 - VIII
            //9 - IX
            //10 - X
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


//        Pattern pattern = Pattern.compile("\\d+|[\\+\\-\\/\\*]");
//        Matcher matcher = pattern.matcher(userInput);
//        if (matcher.find()) {
//            String group = matcher.group();
//            System.out.println(group);
//        }
//
//        if (matcher.find()) {
//            String group = matcher.group();
//            System.out.println(group);
//        }
//
//        if (matcher.find()) {
//            String group = matcher.group();
//            System.out.println(group);
//        }
    }
}
