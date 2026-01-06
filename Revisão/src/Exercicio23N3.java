public class Exercicio23N3 {

    static void main() {

        System.out.println("Criar uma matriz 3x3 com a letra 'X' em cada canto e espaços no centro.");

        String[][] matriz = new String[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = " ";
                if ((i == 0 || i == 2) && (j == 0 || j == 2)){
                    matriz[i][j] = "X";
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
