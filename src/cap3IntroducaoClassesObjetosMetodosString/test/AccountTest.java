package cap3IntroducaoClassesObjetosMetodosString.test;

import cap3IntroducaoClassesObjetosMetodosString.domain.Account;

import java.util.Locale;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account1 = new Account("Jane Green",200.30);
        Account account2 = new Account("Johb Blue", 400.32);

        account1.deposit(60);

        System.out.println("Account1 balance: " + account1.getBalance());

        account1.withdraw(300);



    }
}
