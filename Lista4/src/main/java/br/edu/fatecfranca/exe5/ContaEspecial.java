package br.edu.fatecfranca.exe5;

public class ContaEspecial extends Conta {

    public ContaEspecial(Cliente cliente, int numeroConta, double saldoInicial, double limite) {
        super(cliente, numeroConta, saldoInicial, limite);

        double limiteMaximo = cliente.getSalario() * 3;
        if (limite > limiteMaximo) {
            this.limite = limiteMaximo;
        }
    }
}