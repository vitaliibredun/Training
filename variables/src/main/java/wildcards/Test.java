package wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimal);
        test(listOfDogs);                           //нужно использовать wildcard для работы с listOfDogs

        /*  Object
            Animal              при extends мы хотм видеть с list не только Animal но и потомки класса
            Dog                 при super вместо extends хотим видеть всех родителей класса Animal
         */
    }

    private static void test(List<? extends Animal> list) {   //если оставить List<Animal> list, не принимает объекты класса Dog.
                                                    //для этого ставя List<?> list это wildcard, сможешь передать лист любых объектов
        for (Animal animal : list) {
            animal.eat();
        }
    }
}
