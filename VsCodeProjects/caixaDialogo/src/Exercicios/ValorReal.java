package Exercicios;

import javax.swing.JOptionPane;

public class ValorReal {
    public static void main(String[] args) {

        float x = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor:"));
        JOptionPane.showInputDialog(null,"O valor de x é:" +x);
    }
}
