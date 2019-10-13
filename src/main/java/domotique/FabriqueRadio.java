package domotique;

public class FabriqueRadio extends FabriqueConnectable {

    @Override
    public Connectable creer(){
        Radio r = new Radio();
        return r;
    }

    @Override
    public void configurer(Connectable c){
        c.configurer("105.6");
    }
}