package org.example;

import test.Etudiant;

public class Main {

    private Etudiant etudiant1 ;
    private Etudiant etudiant2 ;
    private Etudiant etudiant3 ;

    public Main(){
//        etudiant.setNote(18);
//        etudiant.setId(1);
//        etudiant.setNom("Badr");

        etudiant1 = new Etudiant(1, "Badr", -18);
        etudiant2 = new Etudiant(2, "Amina", 568);
        etudiant3 = new Etudiant(3, "Said", 16);


        etudiant1.afficher();
        etudiant2.afficher();
        etudiant3.afficher();

    }

    public static void main(String[] args) {
        new Main();
    }
}