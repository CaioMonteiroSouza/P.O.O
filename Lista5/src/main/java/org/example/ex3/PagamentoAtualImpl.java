package org.example.ex3;

class PagamentoAtualImpl implements PagamentoAtual {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " processado no sistema atual.");
    }
}
