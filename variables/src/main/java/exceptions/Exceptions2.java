package exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions2 {
    public Exceptions2(String description) {
    }

    public static void main(String[] args) throws IOException {             //при варанте try/catch не применяем throws IOException
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

            if (x != 0) {
                throw new IOException();

//                catch(IOException ex){                                        вариант с try.catch
//                    System.out.println("Пользователь ввёл что-то кроме 0");

                //throw new ScannerException("Пользователь ввёл что-то кроме нуля")        //прив варианте создания своег оисключения
                }

            }
        }
    }
//}
