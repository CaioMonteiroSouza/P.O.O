package br.edu.fatecfranca.ex2;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private String sigla;
    private int id;
    private List<Aluno> alunos;
    private Professor professor;

    public Disciplina(String nome, String sigla, int id, Professor professor) {
        this.nome = nome;
        this.id = id;
        this.professor = professor;
        this.sigla = sigla;
        this.alunos = new ArrayList<Aluno>();
    }

    public Disciplina() {
        this.alunos = new ArrayList<Aluno>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addAluno (Aluno aluno){
        this.alunos.add(aluno);
    }
}
