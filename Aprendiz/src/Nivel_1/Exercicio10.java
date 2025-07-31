package Nivel_1;

public class Exercicio10 {
    public static void main(String[] args) {

        System.out.println("Imprimir os elementos de uma matriz 2x2 de double com uma casa decimal.");

        double[][] matriz = {
                {1.5, 2.3},
                {3.7, 4.9}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }

    }
}
