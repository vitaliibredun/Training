public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] strings = new String[3];
        strings[0] = "привет";
        strings[1] = "пока";
        strings[2] = "джава";
        System.out.println(strings[0]);
        System.out.println(strings[2]);

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        for (String string : strings) {
            System.out.println(string);
        }
        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for (int numberseach : numbers1) {
            sum = sum + numberseach;
            System.out.println(sum);
        }
        int value = 0;
        String s = null;
        System.out.println(s);



    }
}
