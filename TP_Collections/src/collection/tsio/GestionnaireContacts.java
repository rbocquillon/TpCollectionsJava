package collection.tsio;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GestionnaireContacts {

	protected HashMap<Personne, Contact> gestionnaire;
	protected String nom;

	public GestionnaireContacts(String nom) {
		HashMap<Personne, Contact> hashMap = new HashMap<Personne, Contact>();
		this.gestionnaire = hashMap;
		this.nom = nom;
	}
	
	public GestionnaireContacts(String nom, HashMap<Personne, Contact> gestionnaire) {
		this.gestionnaire = gestionnaire;
		this.nom = nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public HashMap<Personne, Contact> getGestionnaire() {
		return gestionnaire;
	}

	public void setGestionnaire(HashMap<Personne, Contact> gestionnaire) {
		this.gestionnaire = gestionnaire;
	}
	
	public boolean ajouter(Personne p, Contact c) {
		HashMap<Personne, Contact> gestionnaire= this.getGestionnaire();
		gestionnaire.put(p, c);
		this.setGestionnaire(gestionnaire);
		return this.getGestionnaire().containsValue(c);
	}
	
	public Contact contact(Personne p) {
		return this.getGestionnaire().get(p);
	}
	
	public boolean modifier(Personne p, Contact c) {
		return ajouter(p,c);
	}
	
	public Set<Personne> personnes() {
		return this.getGestionnaire().keySet();
	}
	
	public Set<Personne> personnes(String prefix) {
		Set<Personne> test = this.getGestionnaire().keySet();
		Set<Personne> test2 = new HashSet<Personne>();
		Iterator<Personne> iterator = test.iterator();
		while (iterator.hasNext()) {
			Personne p = iterator.next();
			String nom = p.getNom();
			boolean bool = nom.matches("^" + prefix +".*");
			if (bool) {
				test2.add(p);
			}
		}
		return test2;
	}
	
	public boolean supprimer(Personne p) {
		HashMap<Personne, Contact> gestionnaire= this.getGestionnaire();
		Contact c = gestionnaire.remove(p);
		this.setGestionnaire(gestionnaire);
		return !this.getGestionnaire().containsValue(c);
	}
}
