package com.hitema;

import java.util.Scanner;

public class Multiplier {

	private static final String VERSION = "1.2" ;
	
	public static void main(String[] args) {
		System.out.println("***********Multiplier Table Java ( Version :"+VERSION+")*****************");
		if (args.length > 0) {
			for(int i=0;i < args.length ;i++ ) {
				String param = args[i] ;
				switch ( param ) {
					case "--i" : 
						interactive();
						break;
					case "--n" : 
						batch(args[++i]);
						break;
					 default :
				System.out.println("Unknown parameter :"+param);
				}
			}
		}
		else {
			System.out.println("Il n'y a aucun paramètre");
		}
		System.out.println("End...");
	}

	private static void batch(String number) {
		System.out.println("Compute table of :"+number);
		computeAndDisplay(Integer.valueOf(number));
	}
		
	private static void interactive() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Quelle table voulez-vous calculer (Enter=Exit) ? :");

			String rep = scanner.nextLine();
			if (rep.equals("") )
				break;

			int multiplier = Integer.valueOf(rep);

			computeAndDisplay(multiplier);
		}
		scanner.close();
	}

	private static void computeAndDisplay(int multiplier) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(multiplier + " X " + i + " = " + (i * multiplier));
		}
	}

}
