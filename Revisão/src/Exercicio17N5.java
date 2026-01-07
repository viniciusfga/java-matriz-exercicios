public class Exercicio17N5 {

    public static void main(String[] args) {

        System.out.println("Somar os elementos de cada linha e exibir a soma.");

        int[][] matriz = {
                {1,2,3},
                {2,4,6},
                {1,1,1}
        };

        final int T = matriz.length;
        int[] linha = new int[T];

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                linha[i] += matriz[i][j];
            }
        }

        for (int i = 0; i < T; i++) {
            System.out.println("Soma linha " + i + " = " + linha[i]);
        }

    }
}
