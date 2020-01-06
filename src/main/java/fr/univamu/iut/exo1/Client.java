package fr.univamu.iut.exo1;


/**
 * @author Laurent Vouriot
 */
public class Client {
    public static void main(String[] args) {
        Nombre nb1 = new Nombre(1);
        Nombre nb2 = new Nombre(2);
        Nombre nb3 = new Nombre(3);
        Nombre nb4 = new Nombre(4);

        NoeudInterne noeud1 = new NoeudInterne('+',nb2,nb1);
        System.out.println('(' + noeud1.calculerValeur() + ')');

        NoeudInterne noeud2 = new NoeudInterne('*',noeud1,nb3);
        System.out.println(noeud2.calculerValeur());

        NoeudInterne noeud3 = new NoeudInterne('/',noeud2,new Nombre(9));
        System.out.println(noeud3.calculerValeur());

    }
}
