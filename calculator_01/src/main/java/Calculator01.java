import java.util.Scanner;

public class Calculator01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Давай же: ");
        String userInput = scanner.nextLine();

        Calculator calculator = new Calculator();
        calculator.calc(userInput);

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
