package br.edu.fatecfranca.exe0;

public class Aluno {
    private String nome;
    private long ra;
    private float media;

    public Aluno() {
        this.nome = "";
        this.ra = 0L;
        this.media = 0.0f;
    }

    public Aluno(String nome, long ra, float media) {
        this.setNome(nome);
        this.setRa(ra);
        this.setMedia(media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRa(long ra) {
        String auxiliar = String.valueOf(ra);
        if (ra > 0L && auxiliar.length() == 8) {
            this.ra = ra;
        }
        else {
            throw new IllegalArgumentException("Ra deve ser maior que 8 digitos");
        }

    }

    public void setMedia(float media) {
        if (media >= 0.0f && media <= 10.0f) {
            this.media = media;
        }
        else {
            throw new IllegalArgumentException("Media deve ser entre 0 e 10");
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", ra=" + ra +
                ", media=" + media +
                '}';
    }

    public Long getRa(){
        return this.ra;
    }

    public String getNome() {
        return this.nome;
    }

    public float getMedia() {
        return this.media;
    }

}
