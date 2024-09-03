package br.edu.fatecfranca.exe0;

public class Funcionario {
    protected String nome;
    protected String endereco;
    protected String cpf;
    protected float salario;

    public Funcionario(String nome, String endereco, String cpf, float salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.salario = salario;
    }

    public Funcionario(){
        this.nome = "";
        this.endereco = "";
        this.cpf = "";
        this.salario = 0;
    }

    public float calcularSalario() {
        return this.salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                '}';
    }
}
