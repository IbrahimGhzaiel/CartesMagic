package CartesMagic;

import java.util.ArrayList;
import java.util.List;

public class Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creature creature = new Creature(15, "Ibracadabra", 20);
		System.out.println(creature);
		Cartes terrain = new Terrain(1, "Ibracadabra", 15, Couleur.Blanc);
		Cartes terrain2 = new Terrain(1, "exemple", 78, Couleur.Vert);
		System.out.println(terrain);
		Sort sortBase = new Sort(1, "Plouf", "mouillé");
		Sort sortPlus = new Sort(14, "boule de feu", "trésmouillé", sortBase);
		Sort sortPlusPlus = new Sort(16, "explosion", "remouille", sortPlus);
		System.out.println(sortPlusPlus);
		// creation d'une liste de carte
		List<Cartes> listeDeCartes = new ArrayList<Cartes>();
		listeDeCartes.add(sortPlus);
		listeDeCartes.add(creature);
		listeDeCartes.add(sortPlusPlus);
		
		listeDeCartes.add(terrain);
		listeDeCartes.add(sortBase);
		try {
			int energie = 100;
			for (Cartes carte : listeDeCartes) {
				energie = carte.jouer(energie, terrain2);
				System.out.println("Energie restante : " + energie);
			}
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}
	}

}
