package lesBases;

public class PrintArgs {

	public static void main(String[] args) {
		System.out.println("M�thode classique");
		int taille=args.length;
		for(int i=0; i<taille; i++) {
			System.out.println("argument"+(i+1)+" : "+args[i]);
		}
		//commentarie
		
		System.out.println(" ");
		System.out.println("M�thode forEach ");
		for(String a : args) {
		System.out.println(a.toString());
		}

	}

}
