package cap3IntroducaoClassesObjetosMetodosString.domain;

public class CalculadoraFrequenciaCardiaca {
    private String nome;
    private String sobrenome;
    private int ano, mes, dia;

    public CalculadoraFrequenciaCardiaca() {
    }

    public CalculadoraFrequenciaCardiaca(String nome, String sobrenome, int ano, int mes, int dia) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int calcularAnos(){
        int anoAtual = 2023;
        return anoAtual - this.ano;
    }

    public int frequenciaCardiacaMaxima(){
        int numeroFinal = 220;
        return numeroFinal - calcularAnos();
    }

    public void frequenciaCardiacaAlvo(){
       double multiplicador = 0.5;
        System.out.println(frequenciaCardiacaMaxima() * multiplicador);
        multiplicador = 0.85;
        System.out.println(frequenciaCardiacaMaxima() * multiplicador);
    }
}
