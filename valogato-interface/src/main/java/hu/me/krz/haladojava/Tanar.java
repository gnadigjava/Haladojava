package hu.me.krz.haladojava;

public class Tanar extends Szemely implements Valogato<Tanar> {
	private double atlag;

	public Tanar(String name, int age, double atlag) {
		super(name, age);
		this.atlag = atlag;
	}

	public boolean joAlanyE() {
		if( this.getAge()<30 && this.atlag > 4) {
			return true;
		}else
			return false;
	}

	@Override
	public String toString() {
		return "Tanar [atlag=" + atlag + ", toString()=" + super.toString() + "]";
	}
	
}
