public class ToString {
    public static void main(String[] args) {
        Dude d1 = new Dude("Taka", 4);
        System.out.println(d1);

    }
}

class Dude{
    private String name;
    private int age;

    public Dude(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + "," + age;
    }


}
