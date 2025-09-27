package Nivel_6;

import java.util.Scanner;

public class Exercicio24 {
    /*
    Simular uma planilha de notas (matriz alunos × disciplinas), calcular médias e aprovações.
     */
    static String[][] aprovacao(String aluno, String matricula, double notas) {
        String[][] planilha = new String[3][3];


        return planilha;
    }

    static void imprimirPlanilha() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aluno / Disciplinas / Notas: ");
        String aluno = sc.nextLine();

        String disciplina = sc.nextLine();

        double notas = sc.nextDouble();

        aprovacao(aluno, disciplina, notas);
        imprimirPlanilha();

        sc.close();
    }
}
