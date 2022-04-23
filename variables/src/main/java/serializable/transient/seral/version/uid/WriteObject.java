package serializableTransientSeralVersionUID;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        serializableTransientSeralVersionUID.Person person1 = new serializableTransientSeralVersionUID.Person(7, "Buch");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("animals.bin"))) {    //try with resources
//            FileOutputStream fos = new FileOutputStream("animals.bin");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);

//            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {           //здесь достаточно даже только IOException чтобы обрабатывать и FileNotFoundException тоже
            e.printStackTrace();
        }
    }
}
