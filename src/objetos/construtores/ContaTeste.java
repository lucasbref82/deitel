package objetos.construtores;

import objetos.conta.Conta;

import java.util.Locale;
import java.util.Scanner;

public class ContaTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do titular da primeira conta: ");
        String titular = scanner.nextLine();

        System.out.println("Digite o valor inicial a ser depositado na primeira conta: ");
        double valor = scanner.nextDouble();

        Conta conta1 = new Conta(titular, valor);

        scanner.nextLine();

        System.out.println("Digite o nome do titular da segunda conta: ");
        titular = scanner.nextLine();

        System.out.println("Digite o valor inicial a ser depositado na segunda conta: ");
        valor = scanner.nextDouble();

        Conta conta2 = new Conta(titular, valor);

        System.out.println();

        System.out.printf("O titular da conta1 é %s e o saldo é %.2f%n", conta1.getNome(), conta1.getSaldo());
        System.out.printf("O titular da conta2 é %s e o saldo é %.2f%n", conta2.getNome(), conta2.getSaldo());
        System.out.println();

        conta1.deposito(500.00);
        conta2.deposito(10045.79);

        System.out.printf("O titular da conta1 é %s e o novo saldo é %.2f%n", conta1.getNome(), conta1.getSaldo());
        System.out.printf("O titular da conta2 é %s e o novo saldo é %.2f%n", conta2.getNome(), conta2.getSaldo());
    }
}
