package Ristorante.Cibi;

public class Alimenti {

    private double prezzo;
    private String nome;

    Alimenti(double prezzo, String nome){
        this.prezzo = prezzo;
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getNome() {
        return nome;
    }
}
