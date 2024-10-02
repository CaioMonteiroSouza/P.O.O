package org.example.ex3;

public class Main {
    public static void main(String[] args) {
        // Uso direto do sistema atual
        PagamentoAtual pagamentoAtual = new PagamentoAtualImpl();
        pagamentoAtual.processarPagamento(100.0);

        // Uso do sistema legado através do adaptador
        PagamentoLegado sistemaLegado = new PagamentoLegadoImpl();
        PagamentoAtual adaptador = new PagamentoAdaptador(sistemaLegado);
        adaptador.processarPagamento(200.0);
    }
}