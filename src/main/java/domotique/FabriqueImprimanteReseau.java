package domotique;

public class FabriqueImprimanteReseau extends FabriqueConnectable {

        @Override
        public Connectable creer(){
            Connectable ImprimanteReseau = new AdaptateurImprimante(new ImprimanteReseau());
            return ImprimanteReseau;
        }

        @Override
        public void configurer(Connectable c){
            c.configurer("C'est une imprimante Reseau");
        }
    }
