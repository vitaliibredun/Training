public class ClassesAndObjectsContinue {
    public static void main(String[] args) {
        person person1 = new person();
        person1.name = "Buch";
        person1.age = 7;
        person1.speak();
        person person2 = new person();
        person2.name = "Timmy";
        person2.age = 4;
        person2.sayHello();
        int year1 = person1.YearsofRetirement();
        int year2 = person2.YearsofRetirement();

//        person person1 = new Person();        //вариант метода
//        person1.setNameAndAge("Buch",7);
//        String s1 = "Timmy";
//        person2 person2 = new Person();
//        person2.setNameAndAge(s1, 4);
//        person1.speak();
//        person2.speak();


    }
}

class person {
    String name;
    int age;

    void setNameAndAge(String username, int userage) {  // вариант метода
        name = username;
        age = userage;
    }

    void speak(){
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + " and I'm " + age + " years old");
        }
    }

    void sayHello() {
        System.out.println("Привет");

    }

    int YearsofRetirement(){
        int years = 65 - age;
        return years;
    }

}
