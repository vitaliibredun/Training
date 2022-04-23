public class Constructor {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
    }

}

class Animals{
    private String name;
    private int age;

    public Animals(){
        System.out.println("Привет из первого конструктора");
    }

    public Animals(String name){
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }

    public Animals(String name, int age){
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;}
    public void setAge(int age){
        this.age = age;
    }
}
