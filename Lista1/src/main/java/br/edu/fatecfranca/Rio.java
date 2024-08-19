package br.edu.fatecfranca;

public class Rio {
    private String nome;
    private float nivel;
    private boolean poluido;

    public Rio() {
        this.nome = "";
        this.nivel = 0.0f;
        this.poluido = false;
    }

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void chover(float quantidade) {
        this.nivel += quantidade;
    }

    public void ensolarar(float quantidade) {
        if (quantidade <= this.nivel) {
            this.nivel -= quantidade;
        } else {
            System.out.println("Nível do rio não pode ser negativo.");
        }
    }

    public void limpar() {
        this.poluido = false;
    }

    public void sujar() {
        this.poluido = true;
    }

    public void mostra() {
        System.out.println("Nome do Rio: " + this.nome);
        System.out.println("Nível do Rio: " + this.nivel + " metros");
        System.out.println("Está Poluído? " + (this.poluido ? "Sim" : "Não"));
    }
}