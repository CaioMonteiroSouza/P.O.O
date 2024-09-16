package br.edu.fatecfranca.exe3;

import java.util.Random;

public class Produto {
    protected int serial;
    protected int volume;
    protected String teste;
    private boolean jaFoiExecutado = false;

    public Produto() {
        this.serial = 0;
        this.volume = 0;
        this.teste = "Nao testado";
    }

    public Produto(int serial, int volume) {
        this.serial = serial;
        this.volume = volume;
        this.teste = "Nao testado";
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getTeste() {
        return teste;
    }

    public boolean testaUnidade() {
        if (jaFoiExecutado) {
            System.out.println("Produto ja testado");
            return false;
        }
            Random random = new Random();
            int numero = random.nextInt(100);

            if (numero < 90){
                this.teste = "aprovado";
                this.jaFoiExecutado = true;
                return true;
            }else{
                this.teste = "reprovado";
                this.jaFoiExecutado = true;
                return false;
            }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "serial=" + serial +
                ", volume=" + volume +
                ", teste='" + teste + '\'' +
                '}';
    }
}
