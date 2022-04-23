package read.from.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile2 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        File file = new File(separator+"Users"+separator+"vitaliibredun"+separator+"Desktop"+separator+"text.txt");

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");   //разделяет строку по проблеа
        int[] numbers = new int[3];
        int counter = 0;

        for(String number : numbersString){
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));

        scanner.close();    //вконце программы закрываем сканнер чтобы освобождались ресурсы и поток не оставался открытым
    }
}
