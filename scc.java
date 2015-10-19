import java.util.Scanner;

public class scc {

	public static void main(String[] args) {
		
		int convert = 1 ; 
		double temp = 0.00 ;

		Scanner scn = new Scanner(System.in);
		
		System.out.println("CONVERTISSEUR DEGR\u00C9S CELSIUS ET DEGR\u00C9S FAHRENHEIT\n"
						+  "-------------------------------------------------");
		System.out.println("Choisissez le mode de conversion :");
		System.out.println("1. Convertisseur Celsius - Fahrenheit");
		System.out.println("2. Convertisseur Fahrenheit - Celsius");
		convert = scn.nextInt();
		
		if (convert==1)
		{ 
			System.out.println("Température à convertir : ");	
			temp = scn.nextDouble();
			
			double calculF = temp * 9 / 5 + 32 ;
			double afficheF = (double) ((int)(calculF*100))/100;
			System.out.println(temp + "°C correspond à : " + afficheF + "°F");
			System.out.println(" ... proposer renouveller ou fin ... ");
		}
		
		else if (convert==2)
		{
			System.out.println("Température à convertir : ");	
			temp = scn.nextDouble();
			double calculC = (temp - 32) / 9 * 5 ;
			double afficheC = (double) ((int)(calculC*100))/100;
			System.out.println(temp + "°F correspond à : " + afficheC + "°C");
			System.out.println(" ... proposer renouveller ou fin ... ");
		}
		else
		{
			System.out.println(" ... Faire retour à la question ... ");
		}
		
	}

}
