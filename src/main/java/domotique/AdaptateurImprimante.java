package domotique;

public class AdaptateurImprimante implements Connectable{

    private Imprimante imprimante;

    public AdaptateurImprimante(Imprimante m){
        imprimante = m;
    }

    @Override
    public void configurer(String config){
        System.out.println("On configure l'imprimante avec du papier" + config);
    }

    @Override
    public void demarrer(){
        imprimante.imprimer();
    }

}