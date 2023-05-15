package cap4InstrucoesDeControleParteI.test;

import java.util.Scanner;

public class ClassAverageSentinela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        int contador = 0;

        System.out.println("Entre com a primeira nota ou -1 para sair");
        double nota = sc.nextDouble();

        while (nota != -1){
            total += nota;
            contador++;
            System.out.println("Insira a próxima nota ou -1 para sair");
            nota = sc.nextDouble();
        }
        if (contador != 0){
            double media = total / contador;
            System.out.printf("A média do aluno foi de:%.2f ",media );
        } else {
            System.out.println("Nenhuma nota foi inserida");
        }
    }
}
