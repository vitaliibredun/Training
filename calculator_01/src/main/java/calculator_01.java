import java.util.Scanner;

import static java.lang.invoke.DirectMethodHandle$Holder.getInt;
import static java.lang.reflect.Array.getInt;

public class calculator_01 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int number1 = getInt();
        int number2 = getInt();
        char operation = getOperation();
        int result = calc(number1, number2, operation);
        System.out.println(result);

    }

    public static int getInt(){
        System.out.println("Введите число");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        }else {
            System.out.println("т.к. строка не является математической операцией");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Таки что мы хотим узнать?");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().chartAt(0);
            else {
                System.out.println("т.к. строка не является математической операцией");
                scanner.next();
                operation = getOperation();
            }return operation;
        }


    }

    public static int calc(int number1, int number2, char operation){
        int result = 0;
        switch (operation){
            case '+' :
                result = number1 + number2;
                break;
            case '-' :
                result = number1 - number2;
                break;
            case '*' :
                result = number1 * number2;
                break;
            case '/' :
                result = number1 / number2;
                break;
            default:
                System.out.println("т.к. строка не является математической операцией");

        }

        return result;
    }
}



