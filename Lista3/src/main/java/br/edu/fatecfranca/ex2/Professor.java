package br.edu.fatecfranca.ex2;

public class Professor {
    private int id;
    private String name;

    public Professor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Professor() {
        this.id = 0;
        this.name = "";
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

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
