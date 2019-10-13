package domotique;

public class Fax extends Multifonction {


    public Fax(Imprimante imprimanteDecorée) {
        decorateur = imprimanteDecorée;
    }

    @Override
    public void imprimer() {
        decorateur.imprimer();
        System.out.println("La fonction Fax est activée");
    }
}
