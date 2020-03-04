
  
package hu.me.krz.haladojava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Astronomer {

	private final String nev;
	private final List<Planet> discoveredPlanets;

	public Astronomer(String nev, List<Planet> discoveredPlanets) {
		this.nev = nev;
		this.discoveredPlanets = new ArrayList<>();
		this.discoveredPlanets.addAll(discoveredPlanets);
	}

	public String getNev() {
		return nev;
	}

	public List<Planet> getDiscoveredPlanets() {
		return discoveredPlanets;
	}

	public void observeTheSky() {

		Random r = new Random();

		for (int i = 0; i < 10; i++) {

			double radius = r.nextDouble() * 1000;
			String nevHelper = nev + " " + (i + 1);
			Point pointHelper = new Point(0, 0, 0);
			Point t = new Point(((i + 1) + 10), 0, 0);
			pointHelper.translate(t);

			discoveredPlanets.add(new Planet(pointHelper, radius, nevHelper));

		}
	}
}