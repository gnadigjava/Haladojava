package hu.me.krz.haladojava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Vasarlast {

	public static void main(String[] args) {
		List<Tanulo> tanulok = new ArrayList<>(Arrays.asList(new Tanulo("Andras"), new Tanulo("Tamas"), new Tanulo("Angelika"), new Tanulo("Bela"), new Tanulo("Anasztazia")));
		
		Random r = new Random();
		
		for(int i=0; i<6; i++) {
			System.out.println("-------------------------------------" +i);
			int osszespenz=0;
				
				for(int j=0; j<tanulok.size(); j++) {
					if(tanulok.get(j).fogyasztas(r.nextInt((3000 - 1500) + 1) + 1500)) {
						tanulok.remove(tanulok.get(j));
					}
				}
				
				System.out.println("Tanulók száma "+ tanulok.size());
				for(Tanulo t : tanulok) {
					osszespenz += t.getPenz();	
				}
				System.out.println("atlag penz: " + osszespenz/tanulok.size());
				
				for(Tanulo t : tanulok) {
					System.out.println(t);
				}
			}
			
		}
		
		
}
	


