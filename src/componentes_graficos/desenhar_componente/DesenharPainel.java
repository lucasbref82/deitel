package componentes_graficos.desenhar_componente;

import javax.swing.*;
import java.awt.*;

public class DesenharPainel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int largura = super.getWidth();
        int altura = super.getHeight();

        g.drawLine(0, 0, largura, altura);
        g.drawLine(0, altura, largura, 0);
    }
}
