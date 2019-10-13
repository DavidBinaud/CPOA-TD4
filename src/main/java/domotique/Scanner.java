package domotique;

public class Scanner extends Multifonction{

    @Override
    public void imprimer() {
        decorateur.imprimer();
        System.out.println("La fonction Scanner est activée");
    }
}
