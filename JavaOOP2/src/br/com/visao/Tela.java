package br.com.visao;

import br.com.controle.Calculo;
import javax.swing.JOptionPane;

public class Tela {
    public static void main(String[] args) {
        Calculo c = new Calculo();
        c.setValor((Integer.valueOf(JOptionPane.showInputDialog("Digite um valor:"))));
        JOptionPane.showMessageDialog(null,"Valor: "+c.getValor());
        JOptionPane.showMessageDialog(null,"Dobro: "+c.calculaDobro());
        
    }
}