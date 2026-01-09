public class Exercicio21N6 {

    public static void main(String[] args) {

        System.out.println("Criar duas matrizes e somá-las elemento por elemento.");

        int[][] matrizA = {
                {3, 3, 3},
                {3, 3, 3},
                {3, 3, 3}
        };
        int[][] matrizB = {
                {3, 3, 3},
                {3, 3, 3},
                {3, 3, 3}
        };

        int[][] matrizC = new int[3][3];

        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[i].length; j++) {
                matrizC[i][j] =  matrizA[i][j] +  matrizB[i][j];
            }
        }

        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[i].length; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }

    }
}
