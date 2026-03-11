package Nivel_6;

import javax.swing.*;
import java.util.Scanner;


/**
 * Exercício 24 - Nível 6
 *     Simular uma planilha de notas (matriz alunos × disciplinas), calcular médias e aprovações.
 */
public class Exercicio24 {

    // Método para gerar a planilha
    static String[][] aprovacao(String[] alunos, String disciplina, double[] notas) {
        int N = alunos.length;
        String[][] planilha = new String[N + 1][4]; // +1 para cabeçalho

        // Cabeçalho
        planilha[0][0] = "Aluno";
        planilha[0][1] = "Disciplina";
        planilha[0][2] = "Nota";
        planilha[0][3] = "Situação";

        // Preencher dados dos alunos
        for (int i = 0; i < N; i++) {
            planilha[i + 1][0] = alunos[i];
            planilha[i + 1][1] = disciplina;
            planilha[i + 1][2] = String.valueOf(notas[i]);
            planilha[i + 1][3] = (notas[i] >= 6) ? "Aprovado" : "Reprovado";
        }

        return planilha;
    }

    // Método para mostrar a planilha
    static void mostrarPlanilha(String[][] planilha) {
        for (String[] linha : planilha) {
            for (String celula : linha) {
                if (celula == null) celula = "";
                System.out.printf("%-12s", celula);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int N = sc.nextInt();

        String[] alunos = new String[N];
        double[] notas = new double[N];

        System.out.print("Digite a disciplina: ");
        String disciplina = sc.next();

        for (int i = 0; i < N; i++) {
            System.out.println("Digite nome e nota do aluno:");
            alunos[i] = sc.next();
            notas[i] = sc.nextDouble();
        }

        String[][] planilha = aprovacao(alunos, disciplina, notas);
        mostrarPlanilha(planilha);

        sc.close();
    }
}
