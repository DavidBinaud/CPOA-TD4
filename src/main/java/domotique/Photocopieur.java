package domotique;

public class Photocopieur extends Multifonction{


    public Photocopieur(Imprimante imprimanteDecorée) {
        decorateur = imprimanteDecorée;
    }

    @Override
    public void imprimer() {
        decorateur.imprimer();
        System.out.println("La fonction Photocopieur est activée");
    }
}
