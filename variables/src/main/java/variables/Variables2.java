package variables;

public class Variables2 {
    public static void main(String[] args) {
        float f = 123.2F;

        int i1 = 123;
        long l = i1;            //неявное приведение типов данных
        int i2 = (int) l;     //явное приведение

        int i3 = 200;
        double d = i3;
        int i4 = (int) d;
        System.out.println(i4);

    }
}
