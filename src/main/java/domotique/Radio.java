package domotique;

public class Radio implements Connectable {


    @Override
    public void configurer(String config) {
        System.out.println("On configure la radio avec " + config);
    }


    @Override
    public void demarrer() {
        System.out.println("La radio démarre");
    }
}
