public class ClassesAndObjects {
    public static void main(String[] args) {
        person person1 = new person();
        person1.name = "Buch";
        person1.age = 7;

        System.out.println("My name is " + person1.name + " and I'm " + person1.age + " years old");

        person person2 = new person();
        person2.name = "Timmy";
        person2.age = 4;

        System.out.println("My name is " + person2.name + " and I'm " + person2.age + " years old");
    }

}

class Person {
    String name;
    int age;

}

