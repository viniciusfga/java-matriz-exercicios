package Nivel_1;


/**
 * Exercício 09 - Nível 1
 * Objetivo: Criar uma matriz 1x5 com os dias úteis da semana como String.
 */
public class Exercicio09 {
    public static void main(String[] args) {

        

        String[][] dias = new String[1][5];

        dias[0][0] = "Segunda";
        dias[0][1] = "Terça";
        dias[0][2] = "Quarta";
        dias[0][3] = "Quinta";
        dias[0][4] = "Sexta";

        for (int i = 0; i < dias[0].length; i++) {
            System.out.print("[" + dias[0][i] + "] ");
        };

    }
}
