package br.edu.fatecfranca.exe2;

public class Natal extends CartaoWeb{

    public Natal(String Destinatario) {
        this.destinatario = Destinatario;
    }

    @Override
    public void showMessage() {
        System.out.println(this.destinatario + " Feliz natal!");
    }
}
