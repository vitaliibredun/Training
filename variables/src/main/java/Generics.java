import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        //так было до Java 5
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String animal = (String) animals.get(1);
        System.out.println(animal);
        //так стало с пявлением Generics
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        String animal2 = animals2.get(1);

        //после Java 7
        List<String> animals3 = new ArrayList<>();
    }
}
