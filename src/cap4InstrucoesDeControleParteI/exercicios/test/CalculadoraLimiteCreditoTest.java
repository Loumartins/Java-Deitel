package cap4InstrucoesDeControleParteI.exercicios.test;

import cap4InstrucoesDeControleParteI.exercicios.domain.CalculadoraLimiteCredito;

public class CalculadoraLimiteCreditoTest {
    public static void main(String[] args) {
        CalculadoraLimiteCredito clc = new CalculadoraLimiteCredito();
        clc.numeroConta = 4353;
        clc.saldoMes = 3500;
        clc.totalItensCobrados = 250;
        clc.totalCreditos = 2100;
        clc.limiteCreditoAutorizado = 1500;

       int limiteDeCredito = clc.saldoMensal();
        System.out.println(limiteDeCredito);

        clc.limiteExcedido();
    }
}
