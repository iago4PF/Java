package lesBases;

import java.util.Scanner;



public class structureDeBase {

	public static void main(String[] args) {
		System.out.println("1.Maximum entre 4 valeurs");
		System.out.println("2.Factorielle");
		System.out.println("3.Test si un nombre positif est premier");
		System.out.println("Veuillez faire un choix 1, 2 ou 3 :");
		Scanner sc= new Scanner(System.in);
		int choix=sc.nextInt();
		switch(choix) {
			case 1:
				System.out.println("Maximum entre 4 valeurs");
				maximum();
				break;
			case 2:
				System.out.println("Factorielle");
				factorielle();
				break;
			case 3:
				System.out.println("nombre positif est premier");
				premier();
				break;
			default:
				while((choix!=1)&&(choix!=2)&&(choix!=3)) {
					System.out.println("1.Maximum entre 4 valeurs");
					System.out.println("2.Factorielle");
					System.out.println("3.Test si un nombre positif est premier");
					choix=sc.nextInt();
				}
					
				}
		}
		
		
	public static void maximum() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Veuillez rentrer la premiere valeur:");
		int val1=sc.nextInt();
		System.out.println("Veuillez rentrer la deuxieme valeur:");
		int val2=sc.nextInt();
		System.out.println("Veuillez rentrer la troisieme valeur:");
		int val3=sc.nextInt();
		System.out.println("Veuillez rentrer la quatrieme valeur:");
		int val4=sc.nextInt();
		if(val1>=val2&&val1>=val3&&val1>=4) {
			
			System.out.println("Le maximum est :"+val1);
			
		}else if(val2>=val1&&val2>=val3&&val2>=val4) {
			
			System.out.println("Le maximum est :"+val2);
			
		}else if(val3>=val1&&val3>=val2&&val3>=val4) {
			
			System.out.println("Le maximum est :"+val3);
			
		}else if(val4>=val1&&val4>=val2&&val4>=val3) {
			
			System.out.println("Le maximum est :"+val4);
		}
	}
	public static void factorielle() {
		System.out.println("Veuillez rentrer un entier:");
		Scanner sc=new Scanner(System.in);
		int val1=sc.nextInt();
		int fact=1;
		for(int i=1; i<=val1; i++) {
			fact=fact*i;
		}
		System.out.println("factorielle de "+val1+" vaut :"+fact);
		
	}
	
	public static void premier() {
		System.out.println("Veuillez rentrer un entier:");
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		int n=0;
		for(int i=2; i<val; i++) {
			if(val%i==0) {
				n++;
				break;
			}
		}
		if(n!=0) {
			System.out.println("Le nombre n'est pas premier");
		}else {
			System.out.println("Le nombre est premier");
		}
		
	}
}

