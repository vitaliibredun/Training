package read.from.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        File file = new File(separator+"Users"+separator+"vitaliibredun"+separator+"Desktop"+separator+"text.txt");

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        scanner.close();    //вконце программы закрываем сканнер чтобы освобождались ресурсы и поток не оставался открытым
    }
}
