package br.edu.fatecfranca;


public class Cliente {
    private int numeroConta;
    private int numeroAgencia;
    private String nome;
    private float saldo;

    public Cliente() {
        this.numeroConta = 0;
        this.numeroAgencia = 0;
        this.nome = "";
        this.saldo = 0.0f;
    }

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldoInicial) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldoInicial;
    }

    public void realizarDeposito(float valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void realizarSaque(float valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    public String obterDetalhesCliente() {
        return "Número da Conta: " + this.numeroConta +
                ", Nome: " + this.nome +
                ", Saldo Atual: R$ " + this.saldo;
    }
}
