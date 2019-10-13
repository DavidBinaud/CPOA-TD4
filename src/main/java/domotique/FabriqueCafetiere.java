package domotique;

public class FabriqueCafetiere extends FabriqueConnectable {

    @Override
    public Connectable creer(){
        Cafetiere c = new Cafetiere();
        return c;
    }

    @Override
    public void configurer(Connectable c){
        c.configurer("60°C");
    }
}