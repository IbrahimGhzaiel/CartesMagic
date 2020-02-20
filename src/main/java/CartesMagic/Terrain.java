package CartesMagic;

public class Terrain extends Cartes {

	int valeur;
	public Terrain(int cout, String nomCarte, int valeur, Couleur couleur) {
		super(cout, nomCarte);
		this.valeur = valeur;
		this.couleur = couleur;
	}
	
	


	@Override
	public String toString() {
		return "Terrain [valeur=" + valeur + ", couleur=" + couleur + ", toString()=" + super.toString() + "]";
	}


	// charger la methode jouer pour la spécilaiser
	@Override
	public int jouer(int energie) throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		return super.jouer(energie)+valeur;
	}
	
}
