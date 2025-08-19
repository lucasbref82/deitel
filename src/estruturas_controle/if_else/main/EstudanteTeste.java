package estruturas_controle.if_else.main;

import estruturas_controle.if_else.objetos.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Lucas Brenner", 90.75);
        Estudante estudante2 = new Estudante("Larissa Eduarda", 79.99);

        System.out.printf("%s tirou a média anual de: %s%n", estudante1.getNome(), estudante1.getNotaFinal());
        System.out.printf("%s tirou a média anual de: %s%n", estudante2.getNome(), estudante2.getNotaFinal());
    }
}
