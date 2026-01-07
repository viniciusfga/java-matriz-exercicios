public class Exercicio04 {

    public static void main(String[] args) {

        System.out.println("Imprimir a matriz com os elementos separados por |.");

        int[][] matriz = {
                {1,2},
                {3,4}
        };

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                if (j < matriz[i].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }


    }
}
