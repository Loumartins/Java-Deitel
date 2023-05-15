package cap3IntroducaoClassesObjetosMetodosString.domain;

public class Nota {

    private double nota;

    public String getNota() {
        String conceito = "";
        if (this.nota >= 0 && this.nota <= 6){
            conceito = "C";
        } else if (this.nota >= 6 && this.nota <= 8){
            conceito = "B";
        } else if (this.nota > 8 && this.nota <=10){
            conceito = "A";
        }
        return conceito;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
