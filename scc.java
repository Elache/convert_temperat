import java.util.Scanner;

public class scc {

	public static void main(String[] args) {

		int convert = 1;
		double temp = 0.00;
		char boucle = 'O';
		Scanner scn = new Scanner(System.in);

		while (boucle == 'O') {

			System.out
					.println("CONVERTISSEUR DEGR\u00C9S CELSIUS ET DEGR\u00C9S FAHRENHEIT\n"
							+ "-------------------------------------------------");
			System.out.println("Choisissez le mode de conversion :");
			System.out.println("1. Convertisseur Celsius - Fahrenheit");
			System.out.println("2. Convertisseur Fahrenheit - Celsius");
			convert = scn.nextInt();

			System.out.println("Temp�rature � convertir : ");
			temp = scn.nextDouble();

			if (convert == 1) {
				double calculF = temp * 9 / 5 + 32;
				double afficheF = (double) ((int) (calculF * 100)) / 100;
				System.out.println(temp + "�C correspond � : " + afficheF
						+ "�F");
			} else if (convert == 2) {
				double calculC = (temp - 32) / 9 * 5;
				double afficheC = (double) ((int) (calculC * 100)) / 100;
				System.out.println(temp + "�F correspond � : " + afficheC
						+ "�C");
			} else {
				System.out
						.println("Vous n'avez pas choisi le sens de conversion �C<->�F");
			}

			System.out
					.println("Souhaitez-vous convertir une autre temp�rature ? (O/N)");
			boucle = Terminal.lireString().charAt(0);

		}

		System.out.println("Au revoir");
		scn.close();
	}
}
