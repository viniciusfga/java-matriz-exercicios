public class Exercicio06 {

    public static void main(String[] args) {

        System.out.println("Imprimir todos os índices (i, j) de uma matriz 3x3.");

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Índice (" + i + "," + j + ") ");
            }
        }



    }
}
