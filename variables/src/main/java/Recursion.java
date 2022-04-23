public class Recursion {
    public static void main(String[] args) {
//рализуем факториал с помощью метода рекурсии, факториал это 5! = 5 * 4 * 3 * 2 * 1
        System.out.println(fac(4));

    }

    // fac(4)
    // 4 * fac(3)
    // 3 * fac(2)
    // 2 * fac(1)
    // fac(1) = return 1;

    private static int fac(int n) {
        if(n==1)
            return 1;

        return n * fac(n - 1);
    }






//        counter(3);
//    }
//
//    private static void counter(int n) {
//        if (n==0)           //чтобы не забивать стек памяти на методе, создаём условия выхода, после выполнения последнего вызова
//                            //доходим до условия выхода и поднимаемся по цепочке вверх
//            return;
//        System.out.println(n);
//
//        counter(n-1);
//    }



}
