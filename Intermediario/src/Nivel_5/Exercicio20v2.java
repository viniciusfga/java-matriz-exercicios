package Nivel_5;

public class Exercicio20v2 {

    public static void main(String[] args) {

        int[][] matriz = {
                {3, 3, 3},
                {3, 3, 3},
                {3, 3, 3}
        };

        boolean quadradoMagico = true;
        int somaReferencia = 0;

        // Soma da primeira linha como referência
        for (int j = 0; j < 3; j++) {
            somaReferencia += matriz[0][j];
        }

        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            for (int j = 0; j < 3; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }
            if (somaLinha != somaReferencia || somaColuna != somaReferencia) {
                quadradoMagico = false;
                break;
            }
            somaDiagonalPrincipal += matriz[i][i];
            somaDiagonalSecundaria += matriz[i][2 - i];
        }

        // Verifica diagonais
        if (somaDiagonalPrincipal != somaReferencia || somaDiagonalSecundaria != somaReferencia) {
            quadradoMagico = false;
        }

        if (quadradoMagico) {
            System.out.println("É um quadrado mágico!");
        } else {
            System.out.println("Não é um quadrado mágico.");
        }


    }
}
