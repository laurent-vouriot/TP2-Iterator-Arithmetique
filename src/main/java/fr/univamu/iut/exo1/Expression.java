package fr.univamu.iut.exo1;


import java.util.Collection;

/**
 * @author Laurent Vouriot
 */
public abstract class Expression {
    private NoeudInterne premiereOperande;
    private NoeudInterne deuxiemeOperande;

    public Expression() {}
    public abstract void calculerValeur();
}
