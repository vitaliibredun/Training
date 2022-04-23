package nested.classes;

public class Electrocar {
    private int id;

    //вложенный нестатический класс, получаем доступ ко всем полям и методам
    private class Motor {
        public void startMotor(){
            System.out.println("Motor" + id + "starting");
        }
    }

    //статический вложенный класс нужны для использования из вне и обычно используются с модификатором public,
    //получаем доступ только к static полям
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        final int x = 1;

        //вложенный клас в методе, мы получаем доступ к полям класса и к константам метода
        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);

            }
        }

        System.out.println("Electrocar " + id + " is starting");
    }
}
