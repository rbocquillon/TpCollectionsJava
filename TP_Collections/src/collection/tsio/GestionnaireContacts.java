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
		gestionnaire.put(p, c);
		return this.gestionnaire.containsValue(c);
	}
	
	public Contact contact(Personne p) {
		return this.gestionnaire.get(p);
	}
	
	public boolean modifier(Personne p, Contact c) {
		return ajouter(p,c);
	}
	
	public Set<Personne> personnes() {
		return this.gestionnaire.keySet();
	}
	
	public Set<Personne> personnes(String prefix) {
		Set<Personne> keys = this.gestionnaire.keySet();
		Set<Personne> set = new HashSet<Personne>();
		Iterator<Personne> iterator = keys.iterator();
		while (iterator.hasNext()) {
			Personne p = iterator.next();
			String nom = p.getNom();
			boolean bool = nom.matches("^" + prefix +".*");
			if (bool) {
				set.add(p);
			}
		}
		return set;
	}
	
	public boolean supprimer(Personne p) {
		Contact c = gestionnaire.remove(p);
		return !this.gestionnaire.containsValue(c);
	}
}
