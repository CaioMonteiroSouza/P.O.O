package br.edu.fatecfranca;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente fulano = new Cliente(12345, 6789, "Fulano", 500.0f);

        fulano.realizarDeposito(200.0f);
        fulano.realizarSaque(100.0f);
        System.out.println(fulano.obterDetalhesCliente());

        Cliente beltrano = new Cliente(54321, 9876, "Beltrano", 1000.0f);

        beltrano.realizarDeposito(500.0f);
        beltrano.realizarSaque(300.0f);
        System.out.println(beltrano.obterDetalhesCliente());
    }
}