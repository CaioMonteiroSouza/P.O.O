package br.edu.fatecfranca;

public class Aluno {
    public int numeroAluno;
    public String nome;
    public int idade;
    public float p1;
    public float p2;
    public boolean passou;
    public float notaFinal;

    public Aluno(){
        this.numeroAluno = 0;
        this.nome = "";
        this.idade = 0;
        this.p1 = 0;
        this.p2 = 0;
        this.passou = false;
    }

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
        this.passou = false;
    }

    public void notaFinal(){
        this.notaFinal = (this.p1 + this.p2) / 2;
        if (this.notaFinal > 6.0){
            this.passou = true;
        }
        System.out.println("Nota final do aluno " + this.nome + " foi " + this.notaFinal);
    }

    public void dadosAluno(){
        System.out.println("Nome: " + this.nome + " Idade: " + this.idade + " Aluno: " + this.numeroAluno);
    }

    public void passou(){
        if (this.passou){
            System.out.println("O aluno " + this.nome + " foi aprovado com uma media de: " + this.notaFinal);
        }
        else {
            System.out.println("O aluno " + this.nome + " foi reprovado com uma nota media de: " + this.notaFinal);
        }
    }
}
