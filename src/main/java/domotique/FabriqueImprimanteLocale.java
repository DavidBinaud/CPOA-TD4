package domotique;

public class FabriqueImprimanteLocale extends FabriqueConnectable {

    @Override
    public Connectable creer(){
        Connectable ImprimanteLocale = new AdaptateurImprimante(new ImprimanteLocale());
        return ImprimanteLocale;
    }

    @Override
    public void configurer(Connectable c){
        c.configurer("C'est une imprimante Locale");
    }
}