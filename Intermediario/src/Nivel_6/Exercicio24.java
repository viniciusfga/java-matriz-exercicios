package Nivel_6;

import javax.swing.*;
import java.util.Scanner;

public class Exercicio24 {
    /*
    Simular uma planilha de notas (matriz alunos × disciplinas), calcular médias e aprovações.
     */
    static String[][] aprovacao(String aluno, String disciplinas, double notas) {
        String[][] planilha = new String[2][4];

        String[] cabecalho = {"Aluno","Disciplinas","Nota","Situação"};

        for (int i = 0; i <= planilha[0].length - 1; i++) {
            planilha[0][i] = cabecalho[i];
        }

        // DADOS DO ALUNO
        planilha[1][0] = aluno;
        planilha[1][1] = disciplinas;
        planilha[1][2] = Double.toString(notas);
        planilha[1][3] = (notas >= 6) ? "Aprovado" : "Reprovado";

        return planilha;
    }

    static void mostrarPlanilha2(String[][] p) {
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

    static void mostrarPlanilha(String[][] planilha) {
        // JTable precisa do cabeçalho separado da primeira linha
        String[] cabecalho = planilha[0];
        String[][] dados = new String[planilha.length - 1][cabecalho.length];

        // Copia só os dados (sem o cabeçalho)
        for (int i = 1; i < planilha.length; i++) {
            dados[i - 1] = planilha[i];
        }

        JTable tabela = new JTable(dados, cabecalho);
        JScrollPane scrollPane = new JScrollPane(tabela);

        JFrame frame = new JFrame("Planilha de Notas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aluno / Disciplinas / Notas: ");
        String aluno = sc.nextLine();

        String disciplina = sc.nextLine();

        double notas = sc.nextDouble();

        String[][] planilha = aprovacao(aluno, disciplina, notas);
        mostrarPlanilha(planilha);

        sc.close();
    }
}
