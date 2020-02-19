package hu.me.krz.haladojava;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Proba {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int db=0;
		
		System.out.println("adja meg hany diak legyen! (a tobbi meghal)");
			
		try {
			db=sc.nextInt();
		}catch(Exception ex) {
			System.err.println("hiba " + ex.getMessage());
		}
		
		sc.close();
		Diak[] diakok = new Diak[db];
		
		for(int i=0;i<db;i++) {
			String nev = "diak0" + i;
			Random r = new Random();
			int kor = r.nextInt(25-18+1) + 18;
			int puska = r.nextInt(5-0);
			
			diakok[i] = new Diak(nev, kor, puska);
		}
		
		Arrays.sort(diakok);
		for(Diak a : diakok) {
			System.out.println(a);
		}
		
		
		
	}

}
