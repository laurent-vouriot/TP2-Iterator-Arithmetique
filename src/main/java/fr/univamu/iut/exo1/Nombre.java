package fr.univamu.iut.exo1;

/**
 * @auhtor Laurent Vouriot
 */
public class Nombre extends Expression{
    private int valeur;

    public Nombre(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public  double calculerValeur() {
        return valeur;
    }
}
