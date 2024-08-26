package br.edu.fatecfranca.exe0;

public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;

    // Construtor com parâmetros
    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    // Construtor sem argumentos (default)
    public Cliente() {
        this.numeroConta = "00000000-0";
        this.numeroAgencia = "0000-0";
        this.nome = "Nome Default";
        this.saldo = 0.0f;
    }

    // Getters
    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    // Setters
    public void setNumeroConta(String numeroConta) {
        if (numeroConta.matches("\\d{7}-\\d")) {
            this.numeroConta = numeroConta;
        } else {
            throw new IllegalArgumentException("Número da conta deve ter 8 caracteres (incluindo o traço do dígito verificador).");
        }
    }

    public void setNumeroAgencia(String numeroAgencia) {
        if (numeroAgencia.matches("\\d{4}-\\d")) {
            this.numeroAgencia = numeroAgencia;
        } else {
            throw new IllegalArgumentException("Número da agência deve ter 6 caracteres (incluindo o traço do dígito verificador).");
        }
    }

    public void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome não pode ultrapassar 30 caracteres.");
        }
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            throw new IllegalArgumentException("O saldo não pode ser negativo.");
        }
    }

    // Método para realizar depósito
    public void realizarDeposito(float valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo.");
        }
    }

    // Método para realizar saque
    public void realizarSaque(float valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            throw new IllegalArgumentException("O valor do saque deve ser positivo e o saldo deve ser suficiente.");
        }
    }

    // Método para imprimir informações do cliente
    public void imprimirInformacoes() {
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println("Número da Agência: " + this.numeroAgencia);
        System.out.println("Nome do Cliente: " + this.nome);
        System.out.println("Saldo Atual: R$ " + this.saldo);
    }
}