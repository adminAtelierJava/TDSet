import java.util.Comparator;

public class TriNom implements Comparator<Enseignant> {
    @Override
    public int compare(Enseignant o1, Enseignant o2) {
        return o2.getNom().compareTo(o1.getNom());
    }
}
