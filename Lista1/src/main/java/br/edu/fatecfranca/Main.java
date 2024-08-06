package br.edu.fatecfranca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro obj1 = new Carro("GM", "Onix", "Branca",2022);
        Carro obj2 =new Carro("Fiat", "Palio", "Prata", 2012);

        obj1.acelerar();
        obj2.frear();
    }
}