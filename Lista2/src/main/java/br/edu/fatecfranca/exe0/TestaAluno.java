package br.edu.fatecfranca.exe0;

public class TestaAluno {

    public static void main(String[] args) {
        // Instanciação da classe Aluno com valores específicos
        Aluno aluno1 = new Aluno(123456, "João da Silva", 20, 7.5f, 8.0f);
        aluno1.dadosAluno();
        System.out.println("Nota Final: " + aluno1.notaFinal());

        // Instanciação da classe Aluno com o construtor padrão
        Aluno aluno2 = new Aluno();
        aluno2.dadosAluno();
        System.out.println("Nota Final: " + aluno2.notaFinal());
    }
}