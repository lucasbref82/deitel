package estruturas_controle.enquanto.media_classe;

import java.util.Locale;
import java.util.Scanner;

public class MediaClasseSentinela {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int contadorNotas = 0;
        System.out.print("Digite a nota ou -1 para sair: ");
        int nota = scanner.nextInt();
        while (nota != -1){
            if (nota < 0 || nota > 100) {
                System.out.println("Valor digitado inválido, digite um valor entre 0 e 100.");
            } else {
                total += nota;
                contadorNotas++;
            }
            System.out.print("Digite a nota ou -1 para sair: ");
            nota = scanner.nextInt();
        }
        if (contadorNotas > 0) {
            System.out.printf("\nValor total das %d notas digitadas é: %d\n", contadorNotas, total);
            System.out.printf("Média total das %d notas digitadas: %.2f\n", contadorNotas, (double) total / contadorNotas);
        } else {
            System.out.println("Nenhuma nota digitada.");
        }
        scanner.close();
    }
}
