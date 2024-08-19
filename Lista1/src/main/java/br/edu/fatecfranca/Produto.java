package br.edu.fatecfranca;

public class Produto {
    private int id;
    private String descricao;
    private int qtde;
    private float preco;

    public Produto() {
        this.id = 0;
        this.descricao = "";
        this.qtde = 0;
        this.preco = 0.0f;
    }

    public Produto(int id, String descricao, int qtde, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    public void comprar(int x) {
        this.qtde += x;
    }

    public void vender(int x) {
        if (x <= this.qtde) {
            this.qtde -= x;
        } else {
            System.out.println("Quantidade insuficiente em estoque para realizar a venda.");
        }
    }

    public void subir(float x) {
        this.preco += x;
    }

    public void descer(float x) {
        if (x <= this.preco) {
            this.preco -= x;
        } else {
            System.out.println("O preço não pode ser negativo.");
        }
    }

    public void mostra() {
        System.out.println("ID: " + this.id);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Quantidade em estoque: " + this.qtde);
        System.out.println("Preço: " + this.preco);
    }
}