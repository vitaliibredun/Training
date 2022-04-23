package exceptions;

public class Exceptions3CheckedUnchecked {
    public static void main(String[] args) {
        // Checked Exception(Compile time exception)    исключительный случай
        // Unchecked Exception (Runtime exception)      ошибка в работе программы

        int z = 1 / 0;      // стоит убрать из программы

        String name = null;
        name.length();

        int[] arr = new int[2];
        System.out.println(arr[2]);
    }



}
