package CartesMagic;

public class Creature extends Cartes{
	int attaque;
	int defense;
	
	public Creature(int cout, String nomCarte, int attaque, int defense) {
		super(cout, nomCarte);
		this.attaque = attaque;
		this.defense = defense;
	}
	public Creature(int cout, String nomCarte, int force) {
	// constructeur ou attaque=defence donc il faut attribuer force à attaque et à defense
	this(cout, nomCarte, force, force);
	}
	
	@Override
	public int jouer(int energie, Cartes carteCible) {
		
		if (carteCible instanceof Creature) {
		System.out.println(nomCarte+" attaque "+carteCible.nomCarte);
		}
		else {
			throw new UnsupportedOperationException("erreur");
		}
		return super.jouer(energie, carteCible); 
	}
	
	@Override
	public String toString() {
		return "Creature [attaque = " + attaque + ", defense = " + defense + "  " + super.toString() + "]";
	}
	
	

}
