package estruturas_controle.enquanto.analise;

import java.util.Scanner;

public class Analise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aprovados = 0;
        int reprovados = 0;
        int totalEstudantes = 0;
        while (totalEstudantes < 10) {
            System.out.print("Digite um valor 0 para reprovar, 1 para aprovar: ");
            short valorDigitado = scanner.nextShort();
            if (valorDigitado < 0 || valorDigitado > 1) {
                System.out.println("Digite um valor válido entre 0 a 1: ");
            } else {
                if (valorDigitado == 1) {
                    aprovados++;
                } else {
                    reprovados++;
                }
                totalEstudantes ++;
            }
        }
        System.out.printf("Total de alunos aprovados: %d\nTotal de alunos reprovados: %d\n", aprovados, reprovados);
        if (aprovados > 8) {
            System.out.println("Bonus para o professor !");
        }
        scanner.close();
    }
}
