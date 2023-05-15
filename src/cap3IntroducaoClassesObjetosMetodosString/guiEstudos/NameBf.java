package cap3IntroducaoClassesObjetosMetodosString.guiEstudos;

import javax.swing.*;

public class NameBf {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");

        String message = String.format("Olá, seu nome é %s e voce é minha esposa", nome);

        JOptionPane.showMessageDialog(null, message);
    }
}
