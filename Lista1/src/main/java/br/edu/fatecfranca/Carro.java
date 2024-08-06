package br.edu.fatecfranca;

public class Carro {
    public String marca, modelo, cor;
    public int ano;

    public Carro(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void acelerar(){
        System.out.println("Carro acelerando ...");
    }

    public void frear(){
        System.out.println("Carro freando ...");
    }
}
