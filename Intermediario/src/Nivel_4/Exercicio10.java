package Nivel_4;

public class Exercicio10 {
    public static void main(String[] args) {

        System.out.println("Criar uma matriz de String com nomes e contar quantos começam com 'A'");

        String[][] matriz = {
                {"Arthur", "Bruno"},
                {"Deivid", "Emily"}
        };

        int qtd = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].charAt(0) == 'A') {
                    qtd++;
                }
            }
        }
        System.out.print(qtd);

    }
}
