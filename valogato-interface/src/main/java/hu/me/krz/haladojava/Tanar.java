package hu.me.krz.haladojava;

public class Tanar extends Szemely implements Valogato<Tanar> {
	private double atlagjegy;

	public Tanar(String name, int age, double atlagjegy) {
		super(name, age);
		this.atlagjegy = atlagjegy;
	}

	public boolean joAlanyE() {
		if( this.getAge()<30 && this.atlagjegy > 4) {
			return true;
		}else
			return false;
	}

	@Override
	public String toString() {
		return "Tanar [atlag=" + atlagjegy + ", toString()=" + super.toString() + "]";
	}
	
}
