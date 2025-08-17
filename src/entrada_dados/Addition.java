package entrada_dados;

import javax.swing.*;

public class Addition {
    public static void main(String[] args) {
        int n1, n2, soma;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro inteiro."));

        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo inteiro."));

        soma = n1 + n2;

        JOptionPane.showMessageDialog(null, String.format("A soma dos dois valores é: %d", soma));

    }
}
