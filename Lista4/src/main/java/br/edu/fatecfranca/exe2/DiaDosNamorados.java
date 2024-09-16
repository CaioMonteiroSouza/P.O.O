package br.edu.fatecfranca.exe2;

public class DiaDosNamorados extends CartaoWeb{

    public DiaDosNamorados(String Destinatario) {
        this.destinatario = Destinatario;
    }

    @Override
    public void showMessage() {
        System.out.println(this.destinatario + " Feliz dia dos namorados!");
    }
}
