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
		return Instance;
	}
	//ROBIN DONE NOT VERIFIED
	public boolean sInscrire(final String email, final String login, final String username, final String password) {
		if(checkEmail(email) && checkLogin(login) && checkUsername(username) && checkPasswd(password)){
			this.inscrits.add(new Inscrit(email, login, username, password));
			return true;
		} else{
			return false;
		}
	}
	//ROBIN DONE NOT VERIFIED
	public boolean sInscrire(final long numero, final String login, final String username, final String password) {
		if(checkNumber(numero) && checkLogin(login) && checkUsername(username) && checkPasswd(password)){
			this.inscrits.add(new Inscrit(numero, login, username, password));
			return true;
		} else{
			return false;
		}
	}



	//ROBIN DONE NOT CHECKED
	public boolean checkNumber(final long number) {
		for (Inscrit inscrit : inscrits) {
			if (inscrit.getNumero()==number) {
				return false;
			}
		}
		return true;
	}


	//ROBIN DONE NOT CHECKED
	public boolean checkEmail(final String email) {
		if( email!=null && email.trim().length()>0 )
			return email.matches("^[a-zA-Z0-9\\.\\-\\_]+@([a-zA-Z0-9\\-\\_\\.]+\\.)+([a-zA-Z]{2,4})$");
		return false;
	}


	//ROBIN DONE NOT CHECKED
	public boolean checkLogin(final String login) {
		for (Inscrit inscrit : inscrits) {
			if (inscrit.getLogin()==login) {
				return false;
			}
		}
		return true;
	}

	//ROBIN DONE NOT CHECKED
	public boolean checkUsername(final String username) {
		for (Inscrit inscrit : inscrits) {
			if (inscrit.getUsername()==username) {
				return false;
			}
		}
		return true;
	}
	//ROBIN DONE NOT CHECKED
	public boolean checkPasswd(final String passwd) {
		if( passwd!=null && passwd.trim().length()>0 )   //true
			if (passwd.matches("^@([a-zA-Z0-9])$") ) {   //true
				for (Inscrit inscrit : inscrits) {
					if (inscrit.getPassword()==passwd) { //false !
						return false;
					}
				}
			}
		return false;

	}

	//Héloïse
	public boolean seConnecter(final String email, final String password) {
		Inscrit inscrit = rechercherProfilParEmail(email);

		if(inscrit != null){
			if(checkPasswordConcordance(password, inscrit)){
				return true;
			} else{
				return false;
			}

		} else{
			System.err.println("Ce mail ne correspond à aucun membre existant !");
			return false;
		}        
	}

	//Héloïse
	public boolean seConnecter(final long numero, final String password) {
		Inscrit inscrit = rechercherProfilParNumero(numero);
		if(inscrit != null){
			if(checkPasswordConcordance(password, inscrit)){
				return true;
			} else{
				return false;
			}
		} else{
			System.err.println("Ce mail ne correspond à aucun membre existant !");
			return false;
		}
	}

	//Héloïse
	public boolean checkPasswordConcordance(final String passwordEntered, final Inscrit inscrit) {
		if(inscrit.getPassword().equals(passwordEntered)){
			return true;
		}else{
			System.err.println("Le mot de passe ne correspond pas !");
			return false;
		}
	}

	public void afficherProfil(final Inscrit inscrit) {
		System.out.println(inscrit);
	}

	public void afficherEvenement(final Evenement evenement) {
		System.out.println(evenement);

		//Demande Ã  l'utilisateur s'il veut participer Ã  l'Ã©vÃ©nement

		//Si true

		//Appel Ã  participerEvenement()
	}

	public boolean modifierUnProfil(final Inscrit profilAModifier, final String email, final long numero, final String username, final String passwd, final String description) {
		// TODO Auto-generated return
		return false;
	}

	public void participerAEvenement(final Evenement evenement, final Inscrit participant) {

	}



	//David
	public Inscrit rechercherProfilParUsername(final String username) {
		// TODO Auto-generated return
		Inscrit user = null;
		for(Inscrit inscrit: inscrits){
			if(inscrit.getUsername().equals(username)){
				user = inscrit;
			}
		}

		return user;
	}

	//David
	public Inscrit rechercherProfilParEmail(final String email) {
		// TODO Auto-generated return
		Inscrit user = null;
		for(Inscrit inscrit: inscrits){
			if(inscrit.getEmail().equals(email)){
				user = inscrit;
			}
		}

		return user;
	}

	//David
	public Inscrit rechercherProfilParLogin(final String login) {
		// TODO Auto-generated return
		Inscrit user = null;
		for(Inscrit inscrit: inscrits){
			if(inscrit.getLogin().equals(login)){
				user = inscrit;
			}
		}

		return user;

	}

	//David
	public Inscrit rechercherProfilParNumero(final long numero) {
		// TODO Auto-generated return
		Inscrit user = null;
		for(Inscrit inscrit: inscrits){
			if(inscrit.getNumero()==numero){
				user = inscrit;
			}
		}

		return user;
	}



	public void ajouterEvenement(final Evenement e) {
		this.evenements.add(e);
	}


	public boolean rechercherUnEvenement(final String nom, final Date dateDebut, final Date dateFin, final Lieu localisation, final Theme theme, final List<Inscrit> invites, final boolean estPrive, final String description, final int placesDisponibles, final List<Photo> photos, final boolean estAnnule) {
		// TODO Auto-generated return
		return false;
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

	public List<Evenement> getEvenements() {
		// Automatically generated method. Please delete this comment before entering specific code.
		return this.evenements;
	}

	public void setEvenement(final Evenement value) {
		// Automatically generated method. Please delete this comment before entering specific code.
		this.evenements.add(value);
	}

}
