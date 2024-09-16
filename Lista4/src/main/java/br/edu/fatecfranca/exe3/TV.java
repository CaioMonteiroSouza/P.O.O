package br.edu.fatecfranca.exe3;

public class TV  extends Produto{
    private String canal;

    public TV(int serial, int volume, String canal){
        super(serial, volume);
        this.canal = canal;
    }

    public String Assistir() {
        return this.canal + " Assistido";
    }

    public void trocaCanal(String canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return super.toString() + this.canal;
    }
}
