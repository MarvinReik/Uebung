package pack;

import java.util.Arrays;

public class Aufgabe3 {


	public String zeichnen(){
		
		String [] tannenbaum = new String[6];
		String hilf = "";

	for (int i = 1; i <= 6; i++) {

		for (int j = 1; j <= 6 - i; j++){
	
			hilf = hilf + " ";}

		for (int j = 1; j <= (2 * i - 1); j++){
		
			hilf = hilf + "*";}


		tannenbaum[i]=hilf;
		hilf = "";
		System.out.println(Arrays.toString(tannenbaum));
	}
			System.out.println(tannenbaum);                                                     
	for (double i = 1; i < 4.5; i++)
		System.out.print(" ");
	System.out.println("***");
	for (double i = 1; i < 4.5; i++)
	System.out.print(" ");
	System.out.println("***");
	
	return tannenbaum;

}
}



