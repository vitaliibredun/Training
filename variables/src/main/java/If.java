public class If {
    public static void main(String[] args) {
        int myInt = 15;
        if (myInt < 10) {
            System.out.println("да, верно");
        } else if (myInt > 20){
            System.out.println("нет, не верно");
        } else{
            System.out.println("ни в одном из предыдущих случаев");
        }
    }
}
