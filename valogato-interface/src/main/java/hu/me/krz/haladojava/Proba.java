package hu.me.krz.haladojava;

import java.util.Random;
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
		
		
		
		Valogato[] szemelyek = new Valogato[db];

		for (int i = 0; i < szemelyek.length; i++) {
			
			Random r = new Random();
			int age = r.nextInt(80 - 16 + 1) + 16;
			
			if(age%2 == 0) {
				String name = "Tanar Bela" + (i + 1);
				double atlagjegy = r.nextDouble()*5;
				szemelyek[i] = new Tanar(name, age, atlagjegy);
			}else {
				String name = "diák" + (i + 1);
				int puska = r.nextInt(6-0) % 6;
				szemelyek[i] = new Diak(name, age, puska);
			}
		}

		for (Valogato a : szemelyek) {
			if (a.joAlanyE()) {
				System.out.print("jó cucc: \t");
			}else {
				System.out.print("rossz cucc: \t");
			}
			System.out.println(a);
		}
	}

}
