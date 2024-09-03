package br.edu.fatecfranca.ex2;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int id;
    private String name;
    private String area;
    private List<Disciplina> disciplinaList;

    public Curso() {
        this.disciplinaList = new ArrayList<Disciplina>();
    }

    public Curso(int id, String name, String area) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.disciplinaList = new ArrayList<Disciplina>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public List<Disciplina> getDisciplinaList() {
        return disciplinaList;
    }

    public void addDisciplina(int id, String nome, String sigla, Professor professor) {
        this.disciplinaList.add(new Disciplina(nome, sigla, id, professor));
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", disciplinaList=" + disciplinaList +
                '}';
    }
}
