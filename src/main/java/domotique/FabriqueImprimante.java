package domotique;

public class FabriqueImprimante extends FabriqueConnectable {

    @Override
    public Connectable creer(){
        Imprimante imprimante = new Imprimante();
        AdaptateurImprimante a = new AdaptateurImprimante(imprimante);
        return a;
    }

    @Override
    public void configurer(Connectable c){
        c.configurer("encre noir");
    }
}