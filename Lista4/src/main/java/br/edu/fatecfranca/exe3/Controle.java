package br.edu.fatecfranca.exe3;

public class Controle {
    public static void main(String[] args) {
        Radio prod1 = new Radio(01, 10, "91.1 FM", "Sleep Token");

        prod1.testaUnidade();

        System.out.println(prod1);
        prod1.trocaEstacao("94.4 FM");
        prod1.trocaBanda("Dance gavin Dance");
        System.out.println(prod1);

        TV prod2 = new TV(02,10,"Globo");

        prod2.testaUnidade();

        System.out.println(prod2);
        prod2.trocaCanal("SBT");
        System.out.println(prod2);
    }
}
