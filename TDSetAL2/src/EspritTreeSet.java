import java.util.TreeSet;

public class EspritTreeSet implements GestionEnseigant{
    private TreeSet<Enseignant> hash=new TreeSet<>();


    @Override
    public void ajouterEnseignant(Enseignant e) {
        hash.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return hash.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for (Enseignant e:hash)
        { if(e.getId()==id)
            return true;}
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        System.out.println(hash.remove(e));
    }

    @Override
    public void displayEnseignants() {


        for (Enseignant e:hash)
            System.out.println(e);
    }
}
