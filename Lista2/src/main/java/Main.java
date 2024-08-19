import br.edu.fatecfranca.exe0.Aluno;

public class Main {
    public static void main(String[] args) {
        try {
            Aluno obj1 = new Aluno("Pedro", 123, 8.4f);

            Aluno obj2 = new Aluno();
            obj2.setNome("Lucas");
            obj2.setRa(23456752);
            obj2.setMedia(6.0f);

            System.out.println("Ra " + obj2.getRa());

            Aluno obj3 = new Aluno();
            obj3.setNome("Rogerio");
            obj3.setRa(234);
            obj3.setMedia(32.0f);
            System.out.println(obj3);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}