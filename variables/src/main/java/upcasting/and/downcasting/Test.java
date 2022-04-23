package upcasting.and.downcasting;

public class Test {
    public static void main(String[] args) {

        //Upcasting - восходящее преобразование
        Animal animal = new Dog();

        //Downcasting - нисходящее преобразование
        Dog dog2 = (Dog) animal;
        dog2.bark();
    }
}
