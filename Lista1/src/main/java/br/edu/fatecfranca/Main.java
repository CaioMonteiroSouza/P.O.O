//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package br.edu.fatecfranca;

public class Main {

    public static void main(String[] args) {
        Carro obj1 = new Carro("GM", "Onix", "Branca", 2022, 0);
        Carro obj2 = new Carro("Fiat", "Palio", "Preta", 2012, 0);

        obj1.acelerar(50);
        obj1.frear(20);
        obj1.frear(20);
        obj1.frear(20);
        System.out.println(obj1);

        obj2.acelerar(50);
        obj2.frear(20);
        obj2.frear(20);
        obj2.frear(20);
        System.out.println(obj2);

        Carro obj3 = new Carro();
    }
}