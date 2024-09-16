package br.edu.fatecfranca.exe5;

public class Cartao {
    private Conta conta;
    private String senha;

    public Cartao(Conta conta, String senha) {
        this.conta = conta;
        this.senha = senha;
    }

    public boolean retirada(double valor, String senha) {
        if (this.senha.equals(senha)) {
            return conta.retira(valor);
        } else {
            System.out.println("Senha incorreta.");
            return false;
        }
    }

    public double saldo(String senha) {
        if (this.senha.equals(senha)) {
            return conta.getSaldo();
        } else {
            System.out.println("Senha incorreta.");
            return -1;
        }
    }

    public boolean alterarSenha(String senhaAntiga, String novaSenha) {
        if (this.senha.equals(senhaAntiga)) {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso.");
            return true;
        } else {
            System.out.println("Senha antiga incorreta.");
            return false;
        }
    }
}