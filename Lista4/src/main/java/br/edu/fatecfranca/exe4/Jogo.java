package br.edu.fatecfranca.exe4;

import java.util.Random;

public class Jogo {
    private Random random = new Random();

    public Coisa escolheAleatoriamente() {
        int escolha = random.nextInt(3);
        switch (escolha) {
            case 0:
                return new Pedra();
            case 1:
                return new Papel();
            case 2:
                return new Tesoura();
            default:
                return null;
        }
    }

    public void jogar() {
        Coisa c1 = escolheAleatoriamente();
        Coisa c2 = escolheAleatoriamente();

        System.out.println(c1.getNome() + " vs " + c2.getNome());

        if (c1.vence(c2)) {
            System.out.println(c1.getNome() + " vence!");
        } else if (c2.vence(c1)) {
            System.out.println(c2.getNome() + " vence!");
        } else {
            System.out.println("Empate!");
        }
    }

    public void jogarContinuamente() {
        while (true) {
            jogar();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

