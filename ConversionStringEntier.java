package lesBases;
import java.lang.Integer;


public class ConversionStringEntier {

	public static void main(String[] args) {
		
		int[] tab=stringToInt(args);
		int somme=sommeTableau(args);
		
		System.out.println("Affichage du tableau d'arguments");
		AfficherTableau(args);
		System.out.println("la somme des élements du tableau vaut :"+somme);

	}
	
	public static int[] stringToInt(String[] tableau) {
		int[] tab = new int[tableau.length];
		
		for( int i=0; i<tableau.length; i++) {
			tab[i]=Integer.parseInt(tableau[i]);
		}

		return tab;
	}
	
	public static int sommeTableau(String[] tab) {
		int somme=0;
		for(String nb:tab) {
			somme+=Integer.parseInt(nb);
		}
		return somme;
	}
	
	public static void AfficherTableau(String[] tableau) {
		
		for( String element:tableau) {
			System.out.println(element);
		}
	}

}
