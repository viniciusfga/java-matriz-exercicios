package Nivel_5;


/**
 * Exercício 16 - Nível 5
 * Objetivo: Verificar se uma matriz é simétrica (m[i][j] == m[j][i]).
 */
public class Exercicio16 {
    public static void main(String[] args) {

        

        int[][] matriz = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        boolean simetrica = true;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
            if (!simetrica) break;
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        if (simetrica) {
            
        } else {
                
        }

    }
}
