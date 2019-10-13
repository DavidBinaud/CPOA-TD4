package domotique;

public abstract class FabriqueConnectable {

    public abstract Connectable creer();

    public abstract  void configurer(Connectable c);

    public Connectable fabriquer(){
        Connectable c = creer();
        configurer(c);
        return c;
    }

}
