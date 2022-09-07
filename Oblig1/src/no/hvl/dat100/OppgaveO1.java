package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO1 {

	public static void main(String[] args) {

		double lønnEtterSats;
		double lønnSkattet;
		double sats;
		Boolean Trinn0, Trinn1, Trinn2, Trinn3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Skriv inn lønn: ");
		int lønn = sc.nextInt();

		Trinn0 = lønn <= 164100;
		Trinn1 = lønn <= 230950;
		Trinn2 = lønn <= 580650;
		Trinn3 = lønn <= 934050;

		if (Trinn0) {
			sats = 0.00;
			
		} else if (Trinn1) {
			sats = 0.93;

		} else if (Trinn2) {
			sats = 2.41;
			
		} else if (Trinn3) {
			sats = 11.52;
			
		} else {
			sats = 14.52;
		}
		lønnEtterSats = lønn - (lønn * (sats/100));
		lønnSkattet = (lønn *  (sats/100));
		System.out.println("Lønn før sats: " + lønn + 
				"\n" + "Sats: " + sats + "%" + 
				"\n" + "Lønn etter sats: " + lønnEtterSats +
				"\n" + "Kroner skattet: " + lønnSkattet);
		sc.close();
	}

}
