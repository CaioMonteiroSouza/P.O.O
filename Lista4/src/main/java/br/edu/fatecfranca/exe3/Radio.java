package br.edu.fatecfranca.exe3;

public class Radio extends Produto {
    private String estacao;
    private String Banda;

    public Radio(int serial, int volume, String estacao, String banda) {
        super(serial, volume);
        this.estacao = estacao;
        Banda = banda;
    }

    public void escutar(){
        System.out.println(estacao + "//" + Banda);
    }

    public void trocaEstacao(String estacao){
        this.estacao = estacao;
    }

    public void trocaBanda(String banda){
        Banda = banda;
    }

    @Override
    public String toString() {
        return "Radio{" + "estacao=" + estacao + ", Banda=" + Banda + '}' + super.toString();
    }
}
