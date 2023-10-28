public class Enseignant implements Comparable<Enseignant>{
    private int id;
    private String nom,prenom;

    public Enseignant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    public boolean equals(Object o)
    {

        if(this==o) return true;
        if(o==null) return false;
if(o.getClass()!=this.getClass())return false;
if(((Enseignant)o).id==id)return true;
return false;
    }

    public int hashCode(){
        return id;
    }

    @Override
    public int compareTo(Enseignant o) {
        return this.id-o.id;
    }
}
