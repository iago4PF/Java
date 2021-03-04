package lesBases;

import java.util.Scanner;

public class calculetteSimple {

	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner(System.in); // c'et un objet
		System.out.println("Saisir un entier :");// classe system.out possède la méthode println
		int value=sc.nextInt();// c'est un réel
		//sc.nextInt(); méthodde de l'objet scanner
		
		System.out.println("Saisir un autre entier:");
		int value2=sc.nextInt();
		int resultat= value+value2;
		int diff=value-value2;
		int produit=value*value2;
		int quotient=value/value2;// division entière
		
		System.out.println("La somme est :" + resultat);
		System.out.println("La différence est :" +diff);
		System.out.println("Le produit est :"+produit);
		System.out.println("Le quotient est :"+quotient);
		
		sc.close();
		

	}

}
