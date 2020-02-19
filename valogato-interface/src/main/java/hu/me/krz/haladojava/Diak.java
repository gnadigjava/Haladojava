package hu.me.krz.haladojava;

public class Diak extends Szemely implements Valogato<Diak> {
	private int puska;
	
	
	public Diak(String name, int age, int puska) {
		super(name, age);
		this.puska = puska;
	}
	
	public boolean joAlanyE() {
		if(puska == 0)
			return true;
		else return false;
	}

	@Override
	public String toString() {
		return "Diak [puska=" + puska + ", toString()=" + super.toString() + "]";
	}
	
	
}
