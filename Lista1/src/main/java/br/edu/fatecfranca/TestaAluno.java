package br.edu.fatecfranca;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1017, "Caio", 19, 7, 8);

        aluno1.dadosAluno();
        aluno1.notaFinal();
        aluno1.passou();
    }
}
