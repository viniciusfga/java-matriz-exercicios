public class Exercicio18N5 {

    public static void main(String[] args) {

        System.out.println("Transpor uma matriz (inverter linhas por colunas).");

        int[][] matriz = {
                {1, 1, 1},
                {1, 1, 2},
                {2, 1, 1}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[j][i]);
            }
            System.out.println();
        }

    }
}
