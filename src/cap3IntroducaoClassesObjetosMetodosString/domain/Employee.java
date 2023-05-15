package cap3IntroducaoClassesObjetosMetodosString.domain;

public class Employee {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Employee(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (salarioMensal>0.0){
           this.salarioMensal = salarioMensal;
       }
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

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double salarioAnual(){
        return this.salarioMensal * 12;
    }
    public double aumentoSalarial(){
        return this.salarioMensal+=this.salarioMensal * 0.10;
    }
}
