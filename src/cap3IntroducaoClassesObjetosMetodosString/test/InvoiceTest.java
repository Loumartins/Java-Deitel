package cap3IntroducaoClassesObjetosMetodosString.test;

import cap3IntroducaoClassesObjetosMetodosString.domain.Invoice;

import java.util.Locale;

public class InvoiceTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Invoice invoice1 = new Invoice("4565", "Computador Pentium", 4, 3.50);

        double invoiceAmount = invoice1.getInvoiceAmount();

        System.out.printf("O valor da fatura é de R$:%s%n", invoiceAmount);

        Invoice invoice2 = new Invoice("322", "Carregaor de celular", -1, 4);

        invoiceAmount = invoice2.getInvoiceAmount();

        System.out.printf("O valor da fatura é de R$:%s", invoiceAmount);

    }
}
