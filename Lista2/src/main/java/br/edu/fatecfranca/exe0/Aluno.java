package br.edu.fatecfranca.exe0;

public class Aluno {
    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;

    // Construtor com parâmetros
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    // Construtor sem parâmetros (valores default)
    public Aluno() {
        this.numeroAluno = 0;
        this.nome = "Desconhecido";
        this.idade = 0;
        this.p1 = 0.0f;
        this.p2 = 0.0f;
    }

    // Getters e Setters
    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        if (String.valueOf(numeroAluno).length() == 6) {
            this.numeroAluno = numeroAluno;
        } else {
            System.out.println("Erro: o número do aluno deve ter 6 dígitos.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;
        } else {
            System.out.println("Erro: o nome não pode ultrapassar 30 caracteres.");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Erro: a idade não pode ser negativa.");
        }
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if (p1 >= 0) {
            this.p1 = p1;
        } else {
            System.out.println("Erro: a nota P1 não pode ser negativa.");
        }
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if (p2 >= 0) {
            this.p2 = p2;
        } else {
            System.out.println("Erro: a nota P2 não pode ser negativa.");
        }
    }

    // b) Métodos notaFinal() e dadosAluno()
    public float notaFinal() {
        return (p1 + p2) / 2;
    }

    public void dadosAluno() {
        System.out.println("Número do Aluno: " + numeroAluno);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}