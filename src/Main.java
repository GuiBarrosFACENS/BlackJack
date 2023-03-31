import ClassePrincipal.Jogo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {

            Jogo jogo = new Jogo();
            jogo.jogar();

            System.out.println("\nDeseja jogar novamente? (S/N)\n");

        } while (scanner.next().equalsIgnoreCase("S"));

        scanner.close();
        System.out.println("Obrigado por jogar!");

    }
}