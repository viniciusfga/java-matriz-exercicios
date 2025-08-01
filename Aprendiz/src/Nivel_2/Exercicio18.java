package Nivel_2;

public class Exercicio18 {
    public static void main(String[] args) {

        System.out.println("Criar uma matriz 3x3 com true se i == j, false caso contrário.");

        String[][] matriz = new String[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = "true";
                } else {
                    matriz[i][j] = "false";
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
