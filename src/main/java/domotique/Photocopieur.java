package domotique;

public class Photocopieur extends Multifonction{

    @Override
    public void imprimer() {
        decorateur.imprimer();
        System.out.println("La fonction Photocopieur est activée");
    }
}
