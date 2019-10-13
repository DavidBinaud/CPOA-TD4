package domotique;

public class Cafetiere implements Connectable {

    @Override
    public void configurer(String config) {
        System.out.println("On configure la cafetière avec " + config);
    }


    @Override
    public void demarrer() {
        System.out.println("La cafetière démarre");
    }
}
