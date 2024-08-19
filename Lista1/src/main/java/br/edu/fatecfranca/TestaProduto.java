package br.edu.fatecfranca;

public class TestaProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.comprar(10);
        produto1.subir(5.0f);
        produto1.mostra();

        Produto produto2 = new Produto(1,"Mouse", 20, 50.0f);
        produto2.vender(5);
        produto2.descer(10.0f);
        produto2.mostra();
    }
}