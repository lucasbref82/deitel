package objetos.conta;

public class Conta {

    private String nome;
    private double saldo;

    public Conta() {

    }

    public Conta(String nome, double saldo) {
        this.nome = nome;
        validaEhDepositaSaldo(saldo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valorDepositado) {
        validaEhDepositaSaldo(valorDepositado);
    }

    private void validaEhDepositaSaldo(double saldo) {
        if (saldo > 0.0) {
            this.saldo += saldo;
        }
    }
}
