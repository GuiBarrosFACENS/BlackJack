package Objetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private final List<Carta> cartas;

    public Baralho() {
        this.cartas = new ArrayList<>();
        String[] naipes = {"Paus", "Ouros", "Copas", "Espadas"};
        for (String naipe : naipes) {
            for (int valor = 1; valor <= 13; valor++) {
                this.cartas.add(new Carta(naipe, valor));
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(this.cartas);
    }

    public Carta puxarCarta() {
        return this.cartas.remove(0);
    }

}