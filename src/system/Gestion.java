package system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Evenement;
import model.Inscrit;
import model.Lieu;
import model.Photo;
import model.Theme;

public class Gestion {
    private List<Inscrit> inscrits = new ArrayList<Inscrit> ();

    private static Gestion Instance;

    public List<Evenement> evenements = new ArrayList<Evenement> ();

    private Gestion() {
    }

    public static Gestion getInstance() {
        // TODO Auto-generated return
        return null;
    }

    public boolean sInscrire(final String email, final String login, final String username, final String password) {
              if(checkEmail(email) && checkLogin(login) && checkUsername(username) && checkPasswd(password)){
        
                    this.inscrits.add(new Inscrit(email, login, username, password));
        
                    return true;
        
              } else{
        
                   return false;
        
             }
        
    }

    public boolean sInscrire(final long numero, final String login, final String username, final String password) {
        // TODO Auto-generated return
        return false;
    }

    public boolean checkEmail(final String email) {
        // TODO Auto-generated return
        return false;
    }

    public boolean checkNumber(final long number) {
        // TODO Auto-generated return
        return false;
    }

    public boolean checkLogin(final String login) {
        // TODO Auto-generated return
        return false;
    }

    public boolean checkUsername(final String username) {
        // TODO Auto-generated return
        return false;
    }

    public boolean checkPasswd(final String passwd) {
        // TODO Auto-generated return
        return false;
    }

    public boolean seConnecter(final String email, final String password) {
        Inscrit inscrit = rechercherParEmail(email);
        
                if(inscrit != null){
        
                      if(inscrit.checkPasswordConcordance(password)){
        
                             return true;
        
                      } else{
        
                            return false;
        
                      }
        
                } else{
        
                     System.err.println("Ce mail ne correspond à aucun membre existant !");
        
                     return false;
        
                }
        
    }

    public boolean seConnecter(final long numero, final String password) {
        // TODO Auto-generated return
        return false;
    }

    public boolean checkPasswordConcordance(final String passwordEntered) {
               if(this.password.equals(password)){
        
                     return true;
        
                else{
        
                     System.err.println("Le mot de passe ne correspond pas !");
        
                     return false;
        
                }
    }

    public void afficherProfil(final Inscrit inscrit) {
    }

    public boolean modifierUnProfil(final Inscrit profilAModifier, final String email, final long numero, final String username, final String passwd, final String description) {
        // TODO Auto-generated return
        return false;
    }

    public void participerAEvenement(final Evenement evenement, final Inscrit participant) {
    }

    public void afficherEvenement(final Evenement evenement) {
        System.out.println(e);
        
        //Demande à l'utilisateur s'il veut participer à l'événement
        
        //Si true
        
        //Appel à participerEvenement()
        
    }

    public void ajouterEvenement(final Evenement e) {
               this.evenements.add(e);
    }

    public boolean rechercherUnEvenement(final String nom, final Date dateDebut, final Date dateFin, final Lieu localisation, final Theme theme, final List<Inscrit> invites, final boolean estPrive, final String description, final int placesDisponibles, final List<Photo> photos, final boolean estAnnule) {
        // TODO Auto-generated return
        return false;
    }

    public Inscrit rechercherProfilParUsername(final String username) {
        // TODO Auto-generated return
        return null;
    }

    public Inscrit rechercherProfilParEmail(final String email) {
        // TODO Auto-generated return
        return null;
    }

    public Inscrit rechercherProfilParLogin(final String login) {
        // TODO Auto-generated return
        return null;
    }

    public Inscrit rechercherProfilParNumero(final long numero) {
        // TODO Auto-generated return
        return null;
    }

    public boolean envoyerUnEmail(final String email, final String message) {
        // TODO Auto-generated return
        return false;
    }

    public boolean envoyerUnSMS(final long num, final String message) {
        // TODO Auto-generated return
        return false;
    }

    public void ajouterInscrit(final Inscrit i) {
    }

    public Evenement getEvenement() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.evenement;
    }

    public void setEvenement(final Evenement value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.evenement = value;
    }

}
