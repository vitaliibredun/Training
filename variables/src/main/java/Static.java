public class Static {
    public static void main(String[] args) {
        Guy g1 = new Guy("Timmy", 4);
        Guy g2 = new Guy("Buch", 7);
        Guy.description = "Nice";
        g1.getAllFields();
        g2.getAllFields();
        Guy.description = "Bad";
        g1.getAllFields();
        g2.getAllFields();



        System.out.println(Math.pow(2, 4));     //пример работы статического метода в классе
    }
}

class Guy{
    private String name;
    private int age;

    public static String description;

    public Guy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getAllFields(){
        System.out.println(name+","+age+","+description);
    }
}
