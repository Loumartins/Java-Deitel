package cap3IntroducaoClassesObjetosMetodosString.test;

import cap3IntroducaoClassesObjetosMetodosString.domain.Employee;

import java.util.Locale;

public class EmployeeTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Employee employee1 = new Employee("Luiz"," Henrique Martins", 3000.00);
        Employee employee2 = new Employee("Marcos"," Leonardo", 5000);

        double aumento = employee1.aumentoSalarial();


        System.out.println(aumento);
        aumento = employee2.aumentoSalarial();
        System.out.println(aumento);

        double salarioAnual = employee1.salarioAnual();

        System.out.println(salarioAnual);

        salarioAnual = employee2.salarioAnual();
        System.out.println(salarioAnual);
    }
}
