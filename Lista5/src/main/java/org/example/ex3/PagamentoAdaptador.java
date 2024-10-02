package org.example.ex3;

class PagamentoAdaptador implements PagamentoAtual {
    private PagamentoLegado pagamentoLegado;

    public PagamentoAdaptador(PagamentoLegado pagamentoLegado) {
        this.pagamentoLegado = pagamentoLegado;
    }

    @Override
    public void processarPagamento(double valor) {
        // Converte o valor para o formato esperado pelo sistema legado, se necessário
        pagamentoLegado.efetuarPagamento(valor);
    }
}