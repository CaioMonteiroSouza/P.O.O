package br.edu.fatecfranca.exe0;

import java.util.Scanner;

public class TestaCliente {
    public static void main(String[] args) {
        // Instanciando a classe Cliente
        Cliente fulano = new Cliente("1234567-8", "1234-5", "Fulano da Silva", 1000.0f);

        // Realizando depósito
        fulano.realizarDeposito(500.0f);

        // Realizando saque
        fulano.realizarSaque(300.0f);

        // Imprimindo informações do cliente
        fulano.imprimirInformacoes();

        // Tente acessar as variáveis de instância da classe Cliente sem os métodos get e set.
        // fulano.numeroConta = "1234567-9"; // Isso gerará um erro de compilação, pois numeroConta é private
    }
}