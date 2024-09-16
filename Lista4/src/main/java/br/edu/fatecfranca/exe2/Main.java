package br.edu.fatecfranca.exe2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void mostraMensagem(List<CartaoWeb> cartoes){
        for (CartaoWeb cartao : cartoes) {
            cartao.showMessage();
        }
    }

    public static void main(String[] args) {
        List<CartaoWeb> cartoes = new ArrayList<CartaoWeb>();

        Aniversario cartaoani = new Aniversario("Caio");
        DiaDosNamorados cartaonam = new DiaDosNamorados("Rogiscleudo");
        Natal cartaonatal = new Natal("Esturfeldo");

        cartoes.add(cartaoani);
        cartoes.add(cartaonam);
        cartoes.add(cartaonatal);

        mostraMensagem(cartoes);
    }
}
