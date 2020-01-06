package fr.univamu.iut.exo1;

/**
 * @author Laurent Vouriot
 */
public class NoeudInterne extends Expression {
    private char operateurBinaire;

    public NoeudInterne() {}


    @Override
    public void calculerValeur() {
        System.out.println(this.operateurBinaire);
    }
}
