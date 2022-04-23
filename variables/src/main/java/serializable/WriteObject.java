package serializable;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
//        Person person1 = new Person(7, "Buch");       //запись отдельныъ объектов
//        Person person2 = new Person(4, "Timmy");
        Person[] people = {new Person(7, "Buch"), new Person(4, "Timmy"), new Person(5, "Bob")}; //вариант с массивом


        try {
            FileOutputStream fos = new FileOutputStream("animals.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

//            oos.writeInt(people.length);

//            for (Person person : people) {
//                oos.writeObject(person);
//
//            }
            oos.writeObject(people);
//            oos.writeObject(person1);
//            oos.writeObject(person2);

            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {           //здесь достаточно даже только IOException чтобы обрабатывать и FileNotFoundException тоже
            e.printStackTrace();
        }
    }
}
