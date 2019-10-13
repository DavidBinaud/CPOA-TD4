package domotique;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AppliDomotique {
    private static ArrayList<Connectable> objets = new ArrayList<>();

    private static void demarrerLesObjets() {
        for (Connectable c : objets)
            c.demarrer();
    }

    private static String getTypeObjet() {
        String nomClasse = "";
        System.out.println("Taper Entrée pour finir ou le nom de la classe de l'objet à connecter");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            nomClasse = in.readLine();
        } catch (IOException e) {
            System.out.println("Problème de saisie");
        }
        return nomClasse;
    }

    private static void connecter(String type) throws ClassNotFoundException {
        FabriqueConnectable f;
        switch (type) {
            case "Radio":
                f = new FabriqueRadio();
                break;
            case "Cafetiere":
                f = new FabriqueRadio();
                break;
            case "Radiateur":
                f = new FabriqueRadiateur();
                break;
            case "Imprimante":
                f = new FabriqueImprimante();
                break;
            default:
                throw new ClassNotFoundException("pas de dispositif connectable de ce type");
        }

        objets.add(f.fabriquer());
    }

    public static void main(String[] args) {
        String type = "";
        while (!(type = getTypeObjet()).isEmpty()) {
            try {
                connecter(type);
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
                System.out.println("veuillez recommencer");
            }
        }
        System.out.println("Les objets connectés : " + objets);


        demarrerLesObjets();
    }
}