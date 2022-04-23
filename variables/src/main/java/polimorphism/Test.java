package polimorphism;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);

//        animal.eat();
 //       animal.bark();//не может ссылаться т.к. через класс энимал

//        Dog dog = new Dog();
//        dog.eat();
//        animal.bark();
    }

    public static void test(Animal animal){
        animal.eat();

    }


}
