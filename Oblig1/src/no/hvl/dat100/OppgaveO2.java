package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO2 {

	public static void main(String[] args) {

		// Oppgave a)

//		Scanner sc = new Scanner(System.in);
//		System.out.print("Skriv inn poengsum: ");
//		int poengsum = sc.nextInt();
//		
//		
//		
//		Boolean A, B, C, D, E, F;
//		A = (poengsum <= 100 && poengsum >= 90);
//		B = (poengsum <= 89 && poengsum >= 80);
//		C = (poengsum <= 79 && poengsum >= 60);
//		D = (poengsum <= 59 && poengsum >= 50);
//		E = (poengsum <= 49 && poengsum >= 40);
//		F = (poengsum <= 39 && poengsum >= 0);
//
//		if (A) {
//			System.out.println("Karakter: A");
//		} else if (B) {
//			System.out.println("Karakter: B");
//		} else if (C) {
//			System.out.println("Karakter: C");
//		} else if (D) {
//			System.out.println("Karakter: D");
//		} else if (E) {
//			System.out.println("Karakter: E");
//		} else if (F) {
//			System.out.println("Karakter: F");
//		} else {
//			System.out.println("Ugyldig inntasting");
//		}

		// Oppgave 2
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; /*i++ (for oppg. b)*/){
		
		System.out.print("Skriv inn poengsum: ");
		int poengsum = sc.nextInt();
		
		Boolean A, B, C, D, E, F;
		A = (poengsum <= 100 && poengsum >= 90);
		B = (poengsum <= 89 && poengsum >= 80);
		C = (poengsum <= 79 && poengsum >= 60);
		D = (poengsum <= 59 && poengsum >= 50);
		E = (poengsum <= 49 && poengsum >= 40);
		F = (poengsum <= 39 && poengsum >= 0);
		
		if (A) {
			System.out.println("Karakter: A");
			i++;
		} else if (B) {
			System.out.println("Karakter: B");
			i++;
		} else if (C) {
			System.out.println("Karakter: C");
			i++;
		} else if (D) {
			System.out.println("Karakter: D");
			i++;
		} else if (E) {
			System.out.println("Karakter: E");
			i++;
		} else if (F) {
			System.out.println("Karakter: F");
			i++;
		} else {
			System.out.println("Ugyldig inntasting");
		}
		
		}
		sc.close();
	}

}
