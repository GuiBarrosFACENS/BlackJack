package ClassePrincipal;

import Objetos.Baralho;
import Objetos.Jogador;

import java.util.Scanner;

public class Jogo {
    private Baralho baralho;
    private Jogador jogador;
    private Jogador cassino;

    public Jogo() {
        this.baralho = new Baralho();
        this.jogador = new Jogador();
        this.cassino = new Jogador();
    }

    public void jogar() {
        baralho.embaralhar();
        jogador.adicionarCarta(baralho.puxarCarta());
        cassino.adicionarCarta(baralho.puxarCarta());
        jogador.adicionarCarta(baralho.puxarCarta());
        cassino.adicionarCarta(baralho.puxarCarta());

        System.out.println("---INICIANDO JOGO BLACK JACK---\n");


        System.out.println("Suas cartas: " + jogador.getCartas().toString());
        System.out.println("Sua pontuação: " + jogador.getPontos());
        System.out.println("Carta do Cassino: " + cassino.getCartas().get(0).toString());

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Deseja puxar mais uma carta? (S/N)");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("S")) {
                jogador.adicionarCarta(baralho.puxarCarta());
                System.out.println("Suas cartas: " + jogador.getCartas().toString());
                System.out.println("Sua pontuação: " + jogador.getPontos());

                if (jogador.estourou()) {
                    System.out.println("Você estourou. Pontuação: " + jogador.getPontos());
                    System.out.println("O cassino ganhou!");
                    return;
                } else {
                    break;
                }
            } else if (resposta.equalsIgnoreCase("N")) {
                break;
            } else {
                System.out.println("Resposta inválida. Digite S ou N.");
            }
        }

        while (cassino.getPontos() < 17) {
            cassino.adicionarCarta(baralho.puxarCarta());
        }

        System.out.println("Cartas do cassino: " + cassino.getCartas().toString());
        System.out.println("Pontuação do cassino: " + cassino.getPontos());

        if (cassino.estourou()) {
            System.out.println("Cassino estourou! Pontuação: " + cassino.getPontos());
            System.out.println("VocÊ ganhou!");
            return;
        }

        if (jogador.getPontos() > cassino.getPontos()) {
            System.out.println("VocÊ ganhou Parabens!");
        } else if (jogador.getPontos() == cassino.getPontos()) {
            System.out.println("Empate!");
        } else {
            System.out.println("Cassino ganhou!");
        }
    }
}
