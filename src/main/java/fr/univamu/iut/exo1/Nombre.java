package fr.univamu.iut.exo1;

/**
 * @auhtor Laurent Vouriot
 */
public class Nombre extends Expression{
    private int valeur;

    public Nombre() {}

    @Override
    public void calculerValeur() {
        System.out.println(this.valeur);
    }
}
