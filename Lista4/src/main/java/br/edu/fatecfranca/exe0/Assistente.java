package br.edu.fatecfranca.exe0;

public class Assistente extends Funcionario {
    private float horaExtra;

    public Assistente() {
        super();
    }

    public Assistente(String nome, String endereco, String cpf, float salario, float HoraExtra) {
        super(nome, endereco, cpf, salario);
        this.horaExtra = HoraExtra;
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHoraExtra: " + horaExtra;
    }

    @Override
    public float calcularSalario() {
        return this.salario + this.horaExtra * 40.0f;
    }
}
