package read.from.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test2");  //когда файл находится в корнекой папке проекта

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        scanner.close();    //вконце программы закрываем сканнер чтобы освобождались ресурсы и поток не оставался открытым
    }
}
