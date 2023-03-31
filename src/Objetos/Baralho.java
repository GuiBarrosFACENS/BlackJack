package Objetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
        String[] naipes = {"Paus", "Copas", "Espadas", "Ouros"};
        String[] tipos = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};

        for (String naipe : naipes) {
            for (String tipo : tipos) {
                int valor = 0;
                if (tipo.equals("Ás")) {
                    valor = 11;
                } else if (tipo.equals("Rei") || tipo.equals("Dama") || tipo.equals("Valete")) {
                    valor = 10;
                } else {
                    valor = Integer.parseInt(tipo);
                }
                Carta carta = new Carta(naipe, tipo, valor);
                cartas.add(carta);
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public Carta puxarCarta() {
        if (cartas.size() > 0) {
            return cartas.remove(0);
        } else {
            System.out.println("Baralho vazio.");
            return null;
        }
    }

}