package br.edu.fatecfranca;

public class TestaRio {
    public static void main(String[] args) {
        Rio rio1 = new Rio();
        rio1.chover(3.0f);
        rio1.sujar();
        rio1.mostra();

        Rio rio2 = new Rio("Rio Amazonas", 10.5f, false);
        rio2.ensolarar(2.5f);
        rio2.limpar();
        rio2.mostra();
    }
}