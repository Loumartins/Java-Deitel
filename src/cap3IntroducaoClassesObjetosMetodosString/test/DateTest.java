package cap3IntroducaoClassesObjetosMetodosString.test;

import cap3IntroducaoClassesObjetosMetodosString.domain.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date();

        date1.setDia(8);
        date1.setMes(4);
        date1.setAno(1996);

        date1.dataFormatada();
    }
}
