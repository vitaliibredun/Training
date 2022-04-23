package serializableTransientSeralVersionUID;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("animals.bin"))) {   //используем синтаксис try with resources
//            FileInputStream fis = new FileInputStream("animals.bin");
//            ObjectInputStream ois = new ObjectInputStream(fis);

            serializableTransientSeralVersionUID.Person person1 = (serializableTransientSeralVersionUID.Person) ois.readObject();

            System.out.println(person1);

//            ois.close();          //когда используем try with resources, поток закрывать не нужно
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
