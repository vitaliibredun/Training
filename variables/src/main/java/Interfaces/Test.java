package Interfaces;

public class Test {
    public static void main(String[] args) {
//        Animal animal1 = new Animal(4);
//        Person person1 = new Person("Timmy");
//        animal1.sleep();
//        person1.sayHello();
//        animal1.showInfo();
//        person1.showInfo();
        Info info1 = new Animal(4);
        Info info2 = new Person("Timmy");
        info1.showInfo();
        info2.showInfo();

    }
}
