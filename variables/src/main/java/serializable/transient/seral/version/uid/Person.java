package serializableTransientSeralVersionUID;

import java.io.Serializable;

public class Person implements Serializable {
                                //serialVersionUID применяют чтобы сохранить данные первоначального состояния класса
    private int id;
    private String name;      //private transient String name; используем когда не ходим сериализовать определённые объекты

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " : " + name;
    }
}
