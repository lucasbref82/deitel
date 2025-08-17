package objetos.conta;

import java.util.Scanner;

public class ContaTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta conta = new Conta();

        System.out.printf("O nome inicial da conta é: %s\n\n", conta.getNome());

        System.out.println("Digite um nome para a conta: ");
        conta.setNome(scanner.nextLine());
        System.out.println();

        System.out.printf("Nome do objeto conta é: \n%s\n", conta.getNome());

    }
}
