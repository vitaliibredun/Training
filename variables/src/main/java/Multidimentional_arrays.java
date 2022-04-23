public class Multidimentional_arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        int[][] matrice = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};
        System.out.println(matrice[1][2]);
        System.out.println(matrice[2][1]);

        String[][] string = new String[2][3];
        System.out.println(string[1][2]);
        string[0][1] = "Hey";
        System.out.println(string[0][1]);

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");


            }
            System.out.println();
        }

    }

}
