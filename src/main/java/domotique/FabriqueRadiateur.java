package domotique;

public class FabriqueRadiateur extends FabriqueConnectable {

    @Override
    public Connectable creer(){
        Radiateur r = new Radiateur();
        return r;
    }

    @Override
    public void configurer(Connectable c){
        c.configurer("90°C");
    }
}