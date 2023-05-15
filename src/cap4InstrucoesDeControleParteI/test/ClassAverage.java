package cap4InstrucoesDeControleParteI.test;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int contNotas =1;
        while (contNotas <=10){
            System.out.println("Entre com a nota do aluno");
            double nota = sc.nextDouble();
            total += nota;
            contNotas++;
        }
        double media = total / 10;
        System.out.printf("O valor da media entre 10 alunos é de: %.2f", media);
    }
}
