package Nivel_6;

import javax.swing.*;
import java.util.Scanner;


/**
 * Exercício 24 - Nível 6
 * Objetivo: Quantidade de Alunos: 
 */
public class Exercicio24 {
    /*
    Simular uma planilha de notas (matriz alunos × disciplinas), calcular médias e aprovações.
     */
    static String[][] aprovacao(String[] aluno, String disciplinas, double[] notas) {
        String[][] planilha = new String[2][4];

        String[] cabecalho = {"Aluno","Disciplinas","Nota","Situação"};

        for (int i = 0; i <= planilha[0].length - 1; i++) {
            planilha[0][i] = cabecalho[i];
        }

        // DADOS DO ALUNO
        for (int i = 1; i <= planilha[1].length - 1; i++) {
            planilha[i][0] = cabecalho[i - 1];
        }

        planilha[1][1] = disciplinas;

        for (int i = 1; i <= planilha[1].length - 1; i++) {
            planilha[i][0] = String.valueOf(notas[i]);
            planilha[1][3] = (notas[i] >= 6) ? "Aprovado" : "Reprovado";
        }


        return planilha;
    }

    static void mostrarPlanilha(String[][] p) {
        String[] cabecalho = {"Aluno","Disciplinas","Nota","Situação"};

        for (int i = 0; i <= p[0].length - 1; i++) {
            p[0][i] = cabecalho[i];
        }

        for (String[] linha : p) {
            for (String celula : linha) {
                if (celula == null) celula = "";
                System.out.printf("%-15s", celula);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        
        int N  = sc.nextInt();

        String[] aluno = new String[N];
        double[] notas = new double[N];

        
        String disciplina = sc.next();

        
        for (int i = 0; i < N; i++) {
            aluno[i] = sc.next();
            notas[i] = sc.nextDouble();
        }

        String[][] planilha = aprovacao(aluno, disciplina, notas);
        mostrarPlanilha(planilha);

        sc.close();
    }
}
