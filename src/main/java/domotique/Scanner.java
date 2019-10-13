package domotique;

public class Scanner extends Multifonction{

    public Scanner(Imprimante imprimanteDecorée) {
        decorateur = imprimanteDecorée;
    }

    @Override
    public void imprimer() {
        decorateur.imprimer();
        System.out.println("La fonction Scanner est activée");
    }
}
