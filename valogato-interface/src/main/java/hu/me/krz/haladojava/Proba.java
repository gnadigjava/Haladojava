package hu.me.krz.haladojava;

import java.util.Scanner;

public class Proba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int db=0;
		
		System.out.println("adjaon meg 1 parametert");
			
		try {
			db=sc.nextInt();
		}catch(Exception ex) {
			System.err.println("hiba " + ex.getMessage());
		}
		sc.close();
		
		Szemely[] szemelyek = new Szemely[db];
		//for()
		
		
	}

}
