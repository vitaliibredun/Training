import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value;
        do{
            System.out.println("введите 5");
            value = sc.nextInt();
        }   while (value!=5);
        System.out.println("вы ввели 5");


    }
}
