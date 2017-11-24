package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import system.Gestion;

public class Inscrit {
	private String email;

	private long numero;

	private String login;

	private String username;

	private String password;

	private String description;

	private List<Evenement> evenementsOrganises = new ArrayList<Evenement> ();

	private List<Evenement> evenementsProposes = new ArrayList<Evenement> ();

	private List<Evenement> evenementsParticipes = new ArrayList<Evenement> ();

	private List<Theme> themesPreferes = new ArrayList<Theme> ();

	private Photo photo;

	private List<Inscrit> followings = new ArrayList<Inscrit> ();

	private static List<Inscrit> followers = new ArrayList<Inscrit> ();

	public Inscrit(final String email, final String login, final String username, final String password) {
	}

	public Inscrit(final long numero, final String login, final String nom, final String password) {
	}

	public void follow(final Inscrit following) {
		this.followings.add(following);

		following.followers.add(this);
	}

	public void unfollow(final Inscrit following) {
	}

	public boolean creerUnEvenement(final String nom, final Date dateDebut, final Date dateFin, final Lieu localisation, final Theme theme, final List<Inscrit> invites, final boolean estPrive, final String description, final int placesDisponibles, final List<Photo> photos, final boolean estAnnule) {
		creerUnEvenement(String nom, DateTime dateDebut, DateTime dateFin, Lieu localisation, Theme theme, ArrayList<Inscrit> invites, boolean estPrive, String description, int placesDisponibles, ArrayList<Photo> photos, boolean estPrive){


			//Vérification des différents paramètres

			Evenement e =  new Evenement(nom, dateDebut, dateFin, ...);

			Gestion g = g.getInstance();

			//On ajoute l'événement à la liste totale d'événement du singleton Gestion

			g.ajouterEvenement(e);

			//On ajoute l'évenement dans la liste d'événements organisés par l'utilisateur

			this.evenementsOrganises.add(e);

		}
	}
	//ROBIN DONE NOT VERIFIED
	public boolean modifierUnEvenement(final Evenement evtAModifier, final String nom, final Date dateDebut, final Date dateFin, final Lieu localisation, final Theme theme, final List<Inscrit> invites, final boolean estPrive, final String description, final int placesDisponibles, final List<Photo> photos, final boolean estAnnule) {
		if(evtAModifier.isOrganisateur(this.getLogin())) {
			
			evtAModifier.setNom(nom);
			evtAModifier.setDateDebut(dateDebut);
			evtAModifier.setDateFin(dateFin);
			evtAModifier.setLieu(localisation);
			evtAModifier.setDescription(description);
			evtAModifier.setTheme(theme);
			evtAModifier.setParticipants(invites);
			evtAModifier.setEstAnnule(estAnnule);
			evtAModifier.setEstPrive(estPrive);
			evtAModifier.setPhotos(photos);
			evtAModifier.setPlacesDisponibles(placesDisponibles);
			evtAModifier.setOrganisateur(this);
			return true;
		}
		return false;
	}


	public void setEmail(final String value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.email = value;
	}

	public String getEmail() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.email;
	}

	public void setNumero(final long value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.numero = value;
	}

	public long getNumero() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.numero;
	}

	public void setLogin(final String value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.login = value;
	}

	public String getLogin() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.login;
	}

	public void setUsername(final String value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.username = value;
	}

	public String getUsername() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.username;
	}

	public void setPassword(final String value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.password = value;
	}

	public String getPassword() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.password;
	}

	public void setDescription(final String value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.description = value;
	}

	public String getDescription() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.description;
	}

	public List<Theme> getThemesPreferes() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.themesPreferes;
	}

	public void setThemesPreferes(final List<Theme> value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.themesPreferes = value;
	}

	public Photo getPhoto() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.photo;
	}

	public void setPhoto(final Photo value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.photo = value;
	}

	public List<Inscrit> getFollowings() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.followings;
	}

	public void setFollowings(final List<Inscrit> value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.followings = value;
	}

	public List<Evenement> getEvenementsOrganises() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.evenementsOrganises;
	}

	public void setEvenementsOrganises(final List<Evenement> value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.evenementsOrganises = value;
	}

	public List<Evenement> getEvenementsProposes() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.evenementsProposes;
	}

	public void setEvenementsProposes(final List<Evenement> value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.evenementsProposes = value;
	}

	public List<Evenement> getEvenementsParticipes() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.evenementsParticipes;
	}

	public void setEvenementsParticipes(final List<Evenement> value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.evenementsParticipes = value;
	}

	public void setFollowers(final List<Inscrit> value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.followers = value;
	}

}
