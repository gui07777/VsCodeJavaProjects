package Exercicios;

import javax.swing.JOptionPane;

public class Nome {
    public static void main (String[]args) {

        String nome = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null, "Seu nome é:" +nome);
    }
}