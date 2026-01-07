public class Exercicio02 {

    public static void main(String[] args) {

        System.out.println("Imprimir uma matriz linha por linha usando dois for.");

        int[][] matriz = {
                {1,2},
                {3,4}
        };

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
