package br.edu.fatecfranca.ex2;

public class Aluno {
    private int ra;
    private String name;

    public Aluno() {
        this.ra = 0;
        this.name = "";
    }

    public Aluno(int ra, String name) {
        this.ra = ra;
        this.name = name;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", name='" + name + '\'' +
                '}';
    }
}
