package br.edu.fatecfranca.exe4;

public class Tesoura extends Coisa {
    @Override
    public boolean vence(Coisa outraCoisa) {
        return (outraCoisa instanceof Papel);
    }

    @Override
    public String getNome() {
        return "Tesoura";
    }
}

