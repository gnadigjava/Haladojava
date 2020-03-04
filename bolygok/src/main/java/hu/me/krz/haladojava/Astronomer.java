package hu.me.krz.haladojava;

import java.util.List;
import java.util.Random;

public class Astronomer {
	
	private String nev;
	private List<Planet> discoverdPlanets;
	
	public Astronomer(String nev) {
		super();
		this.nev = nev;
	}
	

	public List<Planet> getDiscoverdPlanets() {
		return discoverdPlanets;
	}
	
	public String getNev() {
		return nev;
	}
	

	public void observeTheSky() {
		
		Random r = new Random();
		
		for(int i=0;i<10;i++) {
			double radius = r.nextDouble() * 100;
			String nev = getNev() + " " + (i + 1);
			Point p = new Point(0, 0, 0);
			Point t = new Point(((i + 1) * 10), 0, 0);
			p.translate(t);

			Planet[] bolygok = new Planet[10];
			bolygok[i] = new Planet(p, radius, nev);

			System.out.println(bolygok[i]);
		}
	}


	
}
