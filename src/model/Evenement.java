package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import system.Gestion;

public class Evenement {
    private String nom;

    private Date dateDebut;

    private Date dateFin;

    private boolean estPrive;

    private String description;

    private int placesDisponibles;

    private boolean estAnnule;

    private Inscrit organisateur;

    private List<Inscrit> invites = new ArrayList<Inscrit> ();

    private List<Inscrit> participants = new ArrayList<Inscrit> ();

    private Lieu lieu;

    private Theme theme;

    private List<Photo> photos = new ArrayList<Photo> ();
    
    //ROBIN DONE NOT CHECKED
    public boolean isOrganisateur(final String login) {
    	Inscrit user= new Inscrit();
    	Gestion gestion = gestion.getInstance();
    	user=gestion.rechercherProfilParLogin(login);
        ArrayList<Evenement> listeEvenement= new ArrayList<Evenement>();
        listeEvenement=(ArrayList<Evenement>) user.getEvenementsOrganises();
        for(Evenement event : listeEvenement) {
        	if(this.equals(event)) {
        		return true;
        	}
        }
        return false;
    }

    public boolean estPlein() {
        // TODO Auto-generated return
        return false;
    }

    // THIERRY DONE
    public void ajouterParticipant(final Inscrit participant) {
    	this.participants.add(participant);
    }

    public String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    public void setNom(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

    public void setDateDebut(final Date value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.dateDebut = value;
    }

    public Date getDateDebut() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.dateDebut;
    }

    public Date getDateFin() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.dateFin;
    }

    public void setDateFin(final Date value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.dateFin = value;
    }

    public boolean isEstPrive() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.estPrive;
    }

    public void setEstPrive(final boolean value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.estPrive = value;
    }

    public String getDescription() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.description;
    }

    public void setDescription(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.description = value;
    }

    public void setPlacesDisponibles(final int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.placesDisponibles = value;
    }

    public int getPlacesDisponibles() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.placesDisponibles;
    }

    public void setEstAnnule(final boolean value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.estAnnule = value;
    }

    public boolean isEstAnnule() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.estAnnule;
    }

    public Inscrit getOrganisateur() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.organisateur;
    }

    public void setOrganisateur(final Inscrit value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.organisateur = value;
    }

    public List<Inscrit> getInvites() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.invites;
    }

    public void setInvites(final List<Inscrit> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.invites = value;
    }

    public List<Inscrit> getParticipants() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.participants;
    }

    public void setParticipants(final List<Inscrit> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.participants = value;
    }

    public Lieu getLieu() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.lieu;
    }

    public void setLieu(final Lieu value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.lieu = value;
    }

    public Theme getTheme() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.theme;
    }

    public void setTheme(final Theme value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.theme = value;
    }

    public List<Photo> getPhotos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.photos;
    }

    public void setPhotos(final List<Photo> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.photos = value;
    }

}
