import java.util.Scanner;

public class switch_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = sc.nextInt();
        switch(age){
            case 0 :
                System.out.println("ты вылупился");
                break;
            case 7 :
                System.out.println("ты пшёл в школу");
                break;
            case 18 :
                System.out.println("ты пшёл в универ");
                break;
            default:
                System.out.println("не в попад");
        }
    }
}
