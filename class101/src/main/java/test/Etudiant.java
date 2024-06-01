package test;

public class Etudiant {

    private String nom;
    private int id;
    private float note = 0;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNote(float note) {
        if (note > 0 && note < 20) {
            this.note = note;
        }
    }

    public String getNom() {
        return this.nom;
    }

    public int getId() {
        return id;
    }

    public float getNote() {
        return note;
    }

    public void afficher() {
        System.out.println(
                "l'id est : " + getId() +
                        "  le nom est : " + getNom() +
                        "  la note est : " + getNote()
        );
    }

    public Etudiant(int id, String nom, float note) {
        setId(id);
        this.note = note ;
        setNom(nom);
    }
}
