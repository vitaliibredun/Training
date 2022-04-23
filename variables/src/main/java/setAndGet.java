public class setAndGet {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Какое-то имя");
        human1.setAge(10);
        System.out.println("Выыодим значение в main методе " + human1.getName());
        System.out.println("Выыодим значение в main методе " + human1.getAge());
    }
}

class Human{
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()){
            System.out.println("Ты ввёл пустое имя");
        }else {
            name = userName;}
    }
    public String getName() {
        return name;
    }
    public void setAge(int userAge) {
       if(userAge<0){
           System.out.println("Возраст должен быть положительным");

       }else {
           age = userAge;
       }
    }
    public int getAge(){
        return age;
    }
}
