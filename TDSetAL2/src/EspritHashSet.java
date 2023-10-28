import java.util.HashSet;
import java.util.TreeSet;

public class EspritHashSet implements GestionEnseigant{


    private HashSet<Enseignant> hash=new HashSet<>();


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

    public TreeSet<Enseignant> trieparIdCroi()
    {

        TreeSet<Enseignant> tre=new TreeSet<>();
        tre.addAll(hash);
        return tre;
    }
    public TreeSet<Enseignant> trieparNomde()
    {

        TreeSet<Enseignant> tre=new TreeSet<>(new TriNom());
        tre.addAll(hash);
        return tre;
    }
}
