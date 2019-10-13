package domotique;

public class Radiateur implements Connectable {

    @Override
    public void configurer(String config){
        System.out.println("On configure le radiateur avec" + config);
    }

    @Override
    public void demarrer(){
        System.out.println("la radiateur démarre");
    }
}