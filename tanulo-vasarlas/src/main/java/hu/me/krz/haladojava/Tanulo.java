package hu.me.krz.haladojava;

public class Tanulo {
	private final String nev;
	private int penz;
	private int tanulok=0;
	
	public Tanulo(String nev, int penz) {
		super();
		this.nev = nev;
		this.penz = penz;
		tanulok++;
	}
	
	public Tanulo(String nev) {
		this(nev, 10000);
	}
	
	public String getNev() {
		return nev;
	}

	public int getPenz() {
		return penz;
	}

	public int getOssztanulo() {
		return tanulok;
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		tanulok--;
	}

	@Override
	public String toString() {
		return "Tanulo [" + nev + "]" + ", penz=" + penz;
	}
	
	public boolean fogyasztas(int koltseg) {
		this.penz-=koltseg;
		if(this.penz < 0) {
			return true;
		}else {
			return false;
		}
	}
	
}
