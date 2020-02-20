package CartesMagic;

public class Sort extends Cartes {
	String effet; // effet principale
	Sort effetSecondaire; // effet secondaire

	public Sort(int cout, String nomCarte, String effet, Sort effetSecondaire) {
		super(cout, nomCarte);
		this.effet = effet;
		this.effetSecondaire = effetSecondaire;
	}

	public Sort(int cout, String nomCarte, String effet) {
		this(cout, nomCarte, effet, null);
	}
	public String getEffets() {
		if(effetSecondaire != null) {
			return effet +" {"+effetSecondaire.getEffets()+"}";
		}
		return effet;
	}

	@Override
	public String toString() {
		
			return "Sort [effet=" + this.getEffets() +"," + super.toString() +"]";
		
	}

}
