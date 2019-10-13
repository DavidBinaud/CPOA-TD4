package domotique;

public class Fax extends Multifonction {

    @Override
    public void imprimer() {
        decorateur.imprimer();
        System.out.println("La fonction Fax est activée");
    }
}
