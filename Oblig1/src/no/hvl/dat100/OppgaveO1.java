package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO1 {

	public static void main(String[] args) {

		double l�nnEtterSats;
		double l�nnSkattet;
		double sats;
		Boolean Trinn0, Trinn1, Trinn2, Trinn3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Skriv inn l�nn: ");
		int l�nn = sc.nextInt();

		Trinn0 = l�nn <= 164100;
		Trinn1 = l�nn <= 230950;
		Trinn2 = l�nn <= 580650;
		Trinn3 = l�nn <= 934050;

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
		l�nnEtterSats = l�nn - (l�nn * (sats/100));
		l�nnSkattet = (l�nn *  (sats/100));
		System.out.println("L�nn f�r sats: " + l�nn + 
				"\n" + "Sats: " + sats + "%" + 
				"\n" + "L�nn etter sats: " + l�nnEtterSats +
				"\n" + "Kroner skattet: " + l�nnSkattet);
		sc.close();
	}

}
