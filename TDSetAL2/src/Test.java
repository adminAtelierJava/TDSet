public class Test {
    public static void main(String[] args) {

        EspritHashSet esp=new EspritHashSet();

        Enseignant ens1=new Enseignant(1,"nom1","prenom1");
        Enseignant ens2=new Enseignant(1,"nom1","prenom1");

        Enseignant ens3=new Enseignant(2,"nom2","prenom2");

        Enseignant ens4=new Enseignant(3,"nom3","prenom3");

        esp.ajouterEnseignant(ens1);
        esp.ajouterEnseignant(ens2);
        esp.ajouterEnseignant(ens3);
        esp.ajouterEnseignant(ens4);
        esp.ajouterEnseignant(ens4);

        esp.displayEnseignants();
        System.out.println(esp.rechercherEnseignant(new Enseignant(2,"nom2","prenom2")
));

        EspritTreeSet esptr=new EspritTreeSet();
        esptr.ajouterEnseignant(ens1);
    }
}
