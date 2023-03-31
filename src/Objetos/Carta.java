package Objetos;

public class Carta {

    private int valor;
    private String naipe;

    public Carta(String naipe, int valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }


    @Override
    public String toString() {
        return valor + " do " + naipe;
    }

}
