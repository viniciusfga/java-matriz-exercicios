package Nivel_3;

public class Exercicio22 {
    public static void main(String[] args) {

        System.out.println("Verificar se todos os elementos de uma matriz 2x2 são iguais.");

        int[][] matriz = {
                {2, 2},
                {2, 3}
        };
        int iguais = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[0][0] == matriz[i][j]) {
                    iguais++;
                }
            }
        }
        if (iguais == 4){
            System.out.print("TRUE");
        } else {
            System.out.print("FALSE");
        }

    }
}
