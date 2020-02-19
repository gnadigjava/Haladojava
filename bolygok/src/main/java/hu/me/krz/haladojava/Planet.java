package hu.me.krz.haladojava;

public final class Planet {
	
	private int position;
	private double radius;
	private String name;
	
	
	public Planet(int position, double radius, String name) {
		super();
		this.position = position;
		this.radius = radius;
		this.name = name;
	}


	public int getPosition() {
		return position;
	}
	
	public double getRadius() {
		return radius;
	}

	public String getName() {
		return name;
	}

	
	

}
