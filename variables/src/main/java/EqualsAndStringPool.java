public class EqualsAndStringPool {
    public static void main(String[] args) {
//        int x = 1;
//        int y = 1;
//        System.out.println(x == y);   сравнение примитивов
        Animall animall1 = new Animall(1);
        Animall animall2 = new Animall(1);

        System.out.println(animall1.equals(animall2));

//        System.out.println(animall1 == animall2); // для ссылочных типов данных не работает

//        Object object = new Object();
//        object.equals();              //команда equals находится в проролителе классов object
//
//
//        String string1 = "Hello";
//        String string2 = "Hello";
//
//        System.out.println(string1.equals(string2));      //сравнение строк
    }
}

class Animall {
    private int id;

    public Animall(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {      //перелпределяем метод equals
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }


}

