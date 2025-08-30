package componentes_graficos.desenhar_componente;

import javax.swing.*;

public class DesenharPainelTeste {
    public static void main(String[] args) {
        DesenharPainel desenharPainel = new DesenharPainel();

        // Cria um quadro para armzenar o painel
        JFrame aplicacao = new JFrame();

        // Configura o quadro para ser encerrado quando é fechado
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        aplicacao.add(desenharPainel); // Adiciona o painel ao quadro
        aplicacao.setSize(250, 250); // torna o quadro visível
        aplicacao.setVisible(true);

    }
}
