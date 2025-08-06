package Nivel_04;

public class Exercicio09 {
    public static void main(String[] args) {

        System.out.println("Criar uma matriz de char e exibir somente as vogais.");

        char[][] matriz = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'}
        };

        char[] vogais = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                char c = matriz[i][j];
                boolean isVogal = false;
                for (int k = 0; k < vogais.length; k++) {
                    if (c == vogais[k]) {
                        isVogal = true;
                        break;
                    }
                }

                if(isVogal) {
                    System.out.printf("%4c", c);
                }
            }
        }

    }
}
