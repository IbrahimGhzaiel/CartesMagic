package CartesMagic;

import java.util.ArrayList;
import java.util.List;

public abstract class Cartes {
	// les attributs
	int cout;
	String nomCarte;
	protected Couleur couleur;
	static List<Cartes> listeCartesJouées;

	// les Constructeurs faut pas les oublier obligatoires !!
	public Cartes(int cout, String nomCarte) {
		super();

		this.cout = cout; // instance
		this.nomCarte = nomCarte; // instance
	}

	// creation d'un autre constructeur mais comme signature différentes java saura
	// ou chercher l'info
	public Cartes(String nomCarte) {
		this(0, nomCarte); // attribuer Cartes avec cout = 0
	}

	@Override
	public String toString() {
		return "Cartes [cout=" + cout + ", nomCarte=" + nomCarte + ", creature" + " = " + super.toString() + "]";
	}

	public int jouer(int energie) throws UnsupportedOperationException {
		if (energie > cout) {
			if (listeCartesJouées == null) {
				listeCartesJouées = new ArrayList<Cartes>();

			}
			if (listeCartesJouées.contains(this)) {
				throw new UnsupportedOperationException("Carte déjà jouée");
			} else {
				listeCartesJouées.add(this); // this c'est l'instance de la methode dans laquelle on est ici
			} 								// ici on veut ajouter carte c pour céla on a utilisé this

			return energie - cout;
		}
		throw new UnsupportedOperationException("Pas assez d'énergie");

	}
	public int jouer(int energie, Cartes carteCible)  {
		//appel de l'autre methode jouer 
		return jouer(energie);
	}
}
