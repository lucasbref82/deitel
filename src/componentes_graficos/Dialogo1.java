package componentes_graficos;

import javax.swing.*;

public class Dialogo1 {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Qual é seu nome ?");

        String mensagem = String.format("Bem vindo ao java %s", nome);

        JOptionPane.showMessageDialog(null, mensagem);

    }
}
