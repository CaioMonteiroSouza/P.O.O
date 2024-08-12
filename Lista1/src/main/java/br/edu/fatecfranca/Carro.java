//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package br.edu.fatecfranca;

public class Carro {
    public String marca;
    public String modelo;
    public String cor;
    public float velocidade;
    public int ano;

    public Carro() {
        this.marca = "Não definido";
        this.modelo = "Não definido";
        this.velocidade = 0;
    }

    public Carro(String marca, String modelo, String cor, int ano, float velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public void acelerar(float x) {
        this.velocidade = this.velocidade + x;
        System.out.println("Acelerando..." + this.marca + " " + this.modelo + " " + this.velocidade);
    }

    public void frear(float x) {
        if (this.velocidade > x) {
            this.velocidade = this.velocidade - x;
            System.out.println("Freando..." + this.marca + " " + this.modelo + " " + this.velocidade);
        } else {
            System.out.println("Carro não pode ter velocidade negativa");
        }
    }

    public String toString() {
        return "Marca: " + this.marca + " Modelo: " + this.modelo +
                " Cor: " + this.cor + " Ano: " + this.ano + " Velocidade: " + this.velocidade;
    }
}