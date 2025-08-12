package Nivel_5;

public class Exercicio11 {
    public static void main(String[] args) {

        System.out.println("Imprimir letras do alfabeto em uma matriz (ex: 5x5).");

        char[][] matriz = new char[5][5];

        char[] alfabeto = new char[26];
        for (int i = 0; i < 26; i++) {
            alfabeto[i] = (char) ('A' + i);
        }

        int k = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = alfabeto[k];
                k ++;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}

