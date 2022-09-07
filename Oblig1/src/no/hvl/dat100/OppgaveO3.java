package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv inn et heltall: ");
		int tallInn = sc.nextInt();
		int fakultet = 1;
		
		while (tallInn < 0) {
			System.out.println("Ugyldig. Skriv inn et heltall over 0: ");
			tallInn = sc.nextInt();
		}
		
		for(int i = tallInn; i>0; i--) {
			fakultet = fakultet*i;
		}
			
		System.out.println(tallInn + " fakultet er " + fakultet);
		
		sc.close();
		
	}	
}
