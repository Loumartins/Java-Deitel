package cap3IntroducaoClassesObjetosMetodosString.guiEstudos;

import javax.swing.*;

public class NameDialog {
    public static void main(String[] args) {

        //pede ao usuário que coloque seu nome
        String name = JOptionPane.showInputDialog("Whats your name");

        //cria a mensagem
        String message = String.format("Welcome, %s, to Java Programming", name);

        //exibindo a mensagem
        JOptionPane.showMessageDialog(null, message);
    }
}
