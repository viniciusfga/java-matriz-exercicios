public class Exercicio09 {

    public static void main(String[] args) {

        System.out.println("Criar uma matriz 3x3 em que os valores são iguais à soma dos índices (i + j).");

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j;
                System.out.printf("%2d", matriz[i][j]);
            }
            System.out.println();
        }

    }

}
