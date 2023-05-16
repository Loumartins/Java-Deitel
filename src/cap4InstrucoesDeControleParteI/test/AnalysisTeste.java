package cap4InstrucoesDeControleParteI.test;

import java.util.Scanner;

public class AnalysisTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprovados = 0;
        int reprovados = 0;
        int contAlunos = 1;

        while (contAlunos <= 10){
            System.out.println("Insira o resultado do proximo aluno ( 1 = aprovado , 2 = reprovado )");
            int resultado = sc.nextInt();

            if (resultado == 1){
                aprovados++;
            } else if (resultado == 2){
                reprovados++;
            }
            contAlunos++;
        }
        System.out.println("Numero de aprovados: " + aprovados);
        System.out.println("Numero de reprovados: " + reprovados);

        if (aprovados > 8){
            System.out.println("Bonus para o instrutor");
        } else {
            System.out.println("Instrutor nao receberá bônus");
        }
    }
}
