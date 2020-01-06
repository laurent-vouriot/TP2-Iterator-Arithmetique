package fr.univamu.iut.exo1;

import java.util.logging.LoggingPermission;

/**
 * @author Laurent Vouriot
 */
public class NoeudInterne extends Expression {
    private char operateurBinaire;

    private Expression premiereOperande;
    private Expression deuxiemeOperande;

    public NoeudInterne(char operateurBinaire, Expression op1, Expression op2) {
        this.operateurBinaire = operateurBinaire;
        this.premiereOperande = op1;
        this.deuxiemeOperande = op2;
    }

    @Override
    public double calculerValeur() {

        System.out.println("(" + premiereOperande.calculerValeur() + ")" + operateurBinaire + deuxiemeOperande.calculerValeur());
        switch (operateurBinaire) {
            case '+':
                return premiereOperande.calculerValeur() + deuxiemeOperande.calculerValeur();
                //break;
            case '-':
                return premiereOperande.calculerValeur() - deuxiemeOperande.calculerValeur();
                //break;
            case '*':
                return premiereOperande.calculerValeur() * deuxiemeOperande.calculerValeur();
                //break;
            case '/':
                return premiereOperande.calculerValeur() / deuxiemeOperande.calculerValeur();
                //break;
            default:
                System.out.println("erreur : usage operande +  - * /");
                return 0;
        }
    }
}
