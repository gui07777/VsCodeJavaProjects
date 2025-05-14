package Exercicios;

import javax.swing.JOptionPane;

public class ValorNumerico {
    public static void main(String[] args) {

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));
        JOptionPane.showInputDialog(null,"Sua idade é:" +idade);
    }

}
