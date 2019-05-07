package collection.tsio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import collection.tsio.NumTel.TypeTel;

public class Main {

	public static void main(String[] args) {
		List<Personne> personnes = new ArrayList<Personne>();
		Calendar c1 = Calendar.getInstance();
		c1.set(1997, 10, 7);
		Personne personne1 = new Personne("Dodefroy", "Simon", c1);
		Calendar c2 = Calendar.getInstance();
		c2.set(1993, 4, 31);
		Personne personne2 = new Personne("AAA", "Bruno", c2);
		Calendar c3 = Calendar.getInstance();
		c3.set(1957, 10, 28);
		Personne personne3 = new Personne("Godefroy", "René", c3);
//		personnes.add(personne1);
//		personnes.add(personne1);
//		personnes.add(personne2);
//		personnes.add(personne3);
//		System.out.println("Print--------------------------------------");
//		afficherPersonnes(personnes);
//		System.out.println("Reverse---------------------------------------");
//		Collections.reverse(personnes);
//		afficherPersonnes(personnes);
//		System.out.println("Schuffle---------------------------------------");
//		Collections.shuffle(personnes);
//		afficherPersonnes(personnes);
//		System.out.println("HashSet---------------------------------------");
//		HashSet<Personne> ensemble = new HashSet<Personne>();
//		ensemble.add(personne2);
//		ensemble.add(personne3);
//		ensemble.add(personne1);
//		ensemble.add(personne1);
//		afficherPersonnes(ensemble);
//		System.out.println("CompareTo------------------------------------");
//		System.out.println(personne1.compareTo(personne2));
//		System.out.println(personne2.compareTo(personne1));
//		System.out.println(personne1.compareTo(personne1));
//		System.out.println("TreeSet-------------------------------------");
//		TreeSet<Personne> treeSet = new TreeSet<Personne>();
//		treeSet.add(personne3);
//		treeSet.add(personne1);
//		treeSet.add(personne1);
//		treeSet.add(personne2);
//		treeSet.add(personne2);
//		afficherPersonnes(treeSet);
//		System.out.println("TreeSetComparator-----------------------------------");
//		TreeSet<Personne> treeSet2 = new TreeSet<Personne>(new ComparatorPersonneAnniversaire());
//		treeSet2.add(personne3);
//		treeSet2.add(personne1);
//		treeSet2.add(personne1);
//		treeSet2.add(personne2);
//		treeSet2.add(personne2);
//		afficherPersonnes(treeSet2);
//		System.out.println("--------------------------------------------");
		GestionnaireContacts gestionnaire = new GestionnaireContacts("gestionnaire");
		Calendar datex = Calendar.getInstance();
		datex.set(1997, 10, 7);
		Personne x = new Personne("XABC", "ABCDEFG", datex);
		Calendar datey = Calendar.getInstance();
		datey.set(1993, 4, 31);
		Personne y = new Personne("ABCY", "EDFABCDEFG", datey);
		Calendar datez = Calendar.getInstance();
		datez.set(1957, 10, 28);
		Personne z = new Personne("ZZZZZ", "XYZJSDJSIGDJDFJ", datez);
		NumTel numTel1 = new NumTel("0123456789", TypeTel.FIXEPROF);
		NumTel numTel2 = new NumTel("0123456789", TypeTel.FIXEDOM);
		Adresse adresse1 = new Adresse(98, "Carnot", 77590, "Bois-Le-Roi");
		Mail mail1 = new Mail("szgodefroy", "IMTLD.fr");
		gestionnaire.ajouter(x, numTel1);
		gestionnaire.ajouter(y, adresse1);
		gestionnaire.ajouter(z, mail1);
		gestionnaire.modifier(x, numTel2);
		System.out.println(gestionnaire.personnes("ABC"));
		System.out.println(gestionnaire.personnes());
		System.out.println(gestionnaire.contact(x));
		System.out.println(gestionnaire.contact(y));
		gestionnaire.supprimer(z);
		System.out.println(gestionnaire.personnes());
	}
	
	public static void afficherPersonnes(Collection<Personne> c) {
		Iterator<Personne> iterator = c.iterator();
		while (iterator.hasNext()) {
			Personne p = iterator.next();
			System.out.println(p);
		}
	};

}
