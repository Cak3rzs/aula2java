package br.com.visao;

import br.com.controle.Calculo;
import javax.swing.JOptionPane;

public class Tela {
    public static void main(String[] args) {
        Calculo c = new Calculo();
        c.setValor(120310231);
        JOptionPane.showMessageDialog(null,c.getValor());
    }
}
