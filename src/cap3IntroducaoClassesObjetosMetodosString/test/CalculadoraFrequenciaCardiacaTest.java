package cap3IntroducaoClassesObjetosMetodosString.test;

import cap3IntroducaoClassesObjetosMetodosString.domain.CalculadoraFrequenciaCardiaca;

import java.util.Scanner;

public class CalculadoraFrequenciaCardiacaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        String nome = sc.nextLine();
        System.out.println("Digite o seu sobrenome");
        String sobrenome = sc.nextLine();
        System.out.println("Digite seu ano de nascimento");
        int anoNascimento = sc.nextInt();
        System.out.println("Digite seu mes de nascimento");
        int mesNascimento = sc.nextInt();
        System.out.println("Digite o dia do seu nascimento");
        int diaNascimento = sc.nextInt();

        CalculadoraFrequenciaCardiaca calc = new CalculadoraFrequenciaCardiaca(nome, sobrenome, anoNascimento, mesNascimento, diaNascimento);

        int idade = calc.calcularAnos();

        System.out.println("Sua idade é de: " + idade);

        int frequenciaCardiacaMaxima = calc.frequenciaCardiacaMaxima();

        System.out.println("Sua frequencia cardiaca máxima deve ser de: " +frequenciaCardiacaMaxima);

        System.out.println("Sua frequencia cardiaca alvo deve variar entre:");
        calc.frequenciaCardiacaAlvo();

    }
}
