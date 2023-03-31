package Objetos;

public class Carta {
    private String naipe;
    private String tipo;
    private int valor;
    private int ponto;

    public Carta(String naipe, String tipo, int valor) {
        this.naipe = naipe;
        this.tipo = tipo;
        this.valor = valor;
        this.ponto = converterPonto(valor);
    }

    private int converterPonto(int valor) {
        if (valor == 11) {
            return 10;
        }
        return valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return tipo + " de " + naipe;
    }
}
