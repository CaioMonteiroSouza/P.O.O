package br.edu.fatecfranca.exe0;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void calculaFolhaPgto(List<Funcionario> funcionarios) {
        float total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calcularSalario();
        }
        System.out.println(total);
    }
    public static void polimorfismo(Funcionario funcionario) {
        System.out.println(funcionario.toString());
    }

    public static void main(String[] args) {

        Assistente ass1 = new Assistente("Pedro", "Franca", "123.456.789-0", 3000, 8);

        polimorfismo(ass1);

        Gerente ger1 = new Gerente("Paulo", "Cristais", "123.456.789-01", 5000, 3000);
        polimorfismo(ger1);

        Diretor dir1 = new Diretor("Marcos", "Pedregulho", "021.431", 8000, 1000);
        polimorfismo(dir1);

        List<Funcionario> funcs = new ArrayList<Funcionario>();

        funcs.add(ger1);
        funcs.add(dir1);
        funcs.add(ass1);

        calculaFolhaPgto(funcs);
    }
}