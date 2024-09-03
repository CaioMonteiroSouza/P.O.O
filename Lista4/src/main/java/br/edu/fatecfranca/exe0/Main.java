package br.edu.fatecfranca.exe0;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Assistente ass1 = new Assistente("Pedro", "Franca", "123.456.789-0", 3000, 8);

        System.out.println(ass1);
        System.out.println(ass1.calcularSalario());
    }
}