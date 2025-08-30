package estruturas_controle.enquanto.media_classe;

import java.util.Scanner;

public class MediaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int contadorGrade = 0;
        System.out.print("Digite a quantidade de notas a serem lidas: \n");
        int quantidadeNotas = scanner.nextInt();
        while (contadorGrade < quantidadeNotas) {
            System.out.printf("Digite a nota %d: \n", contadorGrade + 1);
            int grade = scanner.nextInt();
            if(grade < 0 || grade > 100) {
                System.err.println("Digite um valor entre o intervalo de 0 à 100");
                continue;
            }
            total += grade;
            contadorGrade++;
        }
        System.out.printf("\nTotal de todas das %d notas é de : %d\n", quantidadeNotas, total);
        System.out.printf("A média da da classe é de: %d ", total / quantidadeNotas);
        scanner.close();
    }
}
