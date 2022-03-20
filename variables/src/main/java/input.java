import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("введите что-нибудь");
        String b = a.nextLine();    //nextInt for numbers
        System.out.println("вы ввели "+b);
    }
}
