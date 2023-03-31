package Objetos;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private List<Carta> cartas;
    private int pontos;

    public Jogador() {
        this.cartas = new ArrayList<>();
        this.pontos = 0;
    }

    public void adicionarCarta(Carta carta) {
        this.cartas.add(carta);
        this.pontos += carta.getValor();
    }

    public int getPontos() {
        return this.pontos;
    }

    public boolean estourou() {
        return this.pontos > 21;
    }

    public List<Carta> getCartas() {
        return this.cartas;
    }
}
