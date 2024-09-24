package org.example.ex1;

public class Pessoa extends Animal implements Cidadao, Contribuinte, Professor{
   @Override
    public void ensina(){
        System.out.println("Pessoa ensina");
    }

    @Override
    public void vota(){
        System.out.println("Pessoa vota");
    }

    @Override
    public void getRg(){
        System.out.println("12983712983712");
    }

    @Override
    public void trabalha(){
        System.out.println("Pessoa trabalha");
    }

    @Override
    public void pagaIR(){
        System.out.println("Pessoa paga IR");
    }

    @Override
    public void getCPF() {
        System.out.println("4544665456");
    }
}
