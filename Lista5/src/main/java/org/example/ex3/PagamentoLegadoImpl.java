package org.example.ex3;

class PagamentoLegadoImpl implements PagamentoLegado {
    @Override
    public void efetuarPagamento(double valorAntigo) {
        System.out.println("Pagamento de R$ " + valorAntigo + " processado no sistema legado.");
    }
}