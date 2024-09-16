package br.edu.fatecfranca.exe4;

public class Pedra extends Coisa {
    @Override
    public boolean vence(Coisa outraCoisa) {
        return (outraCoisa instanceof Tesoura);
    }

    @Override
    public String getNome() {
        return "Pedra";
    }
}
