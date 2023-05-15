package cap4InstrucoesDeControleParteI.test;

import cap4InstrucoesDeControleParteI.domain.Student;

import java.util.Locale;

public class StudentTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Student student = new Student("Luiz Henrique", 78.40);

        System.out.println(student.getAverage());

        String studentGrade = student.letterGrade();

        System.out.println("Studente: " + student.getName() + " grade is: " + studentGrade);
    }
}
