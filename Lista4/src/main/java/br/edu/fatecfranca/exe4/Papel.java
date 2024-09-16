package br.edu.fatecfranca.exe4;

public class Papel extends Coisa {
    @Override
    public boolean vence(Coisa outraCoisa) {
        return (outraCoisa instanceof Pedra);
    }

    @Override
    public String getNome() {
        return "Papel";
    }
}

