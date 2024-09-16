package br.edu.fatecfranca.exe2;

public class Aniversario extends CartaoWeb{

    public Aniversario(String Destinatario) {
        this.destinatario = Destinatario;
    }

    @Override
    public void showMessage() {
        System.out.println(this.destinatario + " Feliz aniversario!");
    }
}
