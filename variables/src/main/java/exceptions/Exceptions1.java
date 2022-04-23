package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        File file = new File("some file, somewhere");

        try {                                              //вариант try/catch
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException ex1) {
            System.out.println("Файл не найден");        //по умолчанию обработка исключения этот ex1.printStackTrace();
        }

        System.out.println("После блока try catch");
    }

//    public static void main(String[] args) {
//        try {
//            readFile();
//        } catch (FileNotFoundException ex2) {
//            System.out.println("Обработка исключения в методе main, по иерархии вверх");
//        }
//    }
//
//    public void readFile() throws FileNotFoundException {   //вариант throws
//        File file1 = new File("some file, somewhere");
//        Scanner scanner1 = new Scanner(file1);
//    }
}
