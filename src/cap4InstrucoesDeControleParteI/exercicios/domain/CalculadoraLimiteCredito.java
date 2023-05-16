package cap4InstrucoesDeControleParteI.exercicios.domain;

public class CalculadoraLimiteCredito {
    public int numeroConta;
    public int saldoMes;
    public int totalItensCobrados;
    public int totalCreditos;
    public int limiteCreditoAutorizado;

    public int saldoMensal(){
        int saldoFinal = saldoMes + totalItensCobrados - totalCreditos;
        return saldoFinal;
    }
    public boolean limiteExcedido(){
        if (saldoMensal() <= this.limiteCreditoAutorizado){
            System.out.println("Limite de credito nao excedido");
            return false;
        } else
            System.out.println("Limite excedido");
            return true;
    }
}
