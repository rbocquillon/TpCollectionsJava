package collection.tsio;

import java.util.Calendar;

public class Personne implements Comparable<Personne> {

	protected String nom;
	protected String prenom;
	protected Calendar anniversaire;
	
	public Personne(String nom, String prenom, Calendar anniversaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.anniversaire = anniversaire;
	}
	
	
	public String getNom() {
		return nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public Calendar getAnniversaire() {
		return anniversaire;
	}

	@Override
	public String toString() {
		return prenom + " " + nom + " : " + 
			anniversaire.get(Calendar.DAY_OF_MONTH) + "/" + 
			anniversaire.get(Calendar.MONTH) + "/" + 
			anniversaire.get(Calendar.YEAR); 
	}
	
	@Override
	public int compareTo(Personne p) {
		return this.prenom.compareTo(p.getPrenom());
	}
	
}
