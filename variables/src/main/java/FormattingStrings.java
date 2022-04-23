public class FormattingStrings {
    public static void main(String[] args) {
        System.out.printf("This is a string, %s","NICE");
        System.out.printf("This is a string, %d",10);

        System.out.printf("String %10d \n", 532);
        System.out.printf("String %10d \n", 5);
        System.out.printf("String %10d \n", 532324);
        System.out.printf("String %10d \n", 1000000);

        System.out.printf("String %-10d \n", 532);
        System.out.printf("String %-10d \n", 5);
        System.out.printf("String %-10d \n", 532324);
        System.out.printf("String %-10d \n", 1000000);
    }
}
