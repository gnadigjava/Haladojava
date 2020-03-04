package hu.me.krz.haladojava;

public class Point {

	private long x;
	private long y;
	private long z;

	public Point(long x, long y, long z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Point point = (Point) o;
		//Point other = (Point) obj;
		if (x != point.x)
			return false;
		if (y != point.y)
			return false;
		return z == point.z;
		//if (z != other.z)
		//	return false;
		//return true;
	}

	@Override
	public int hashCode() {
		//final int prime = 31;
		//int result = 1;
		
		int result = (int) (x ^ (x >>> 32));
		result = 31 * result + (int) (y ^ (y >>> 32));
		result = 31 * result + (int) (z ^ (z >>> 32));
		return result;
	}

	public long getX() {
		return x;
	}

	public long getY() {
		return y;
	}

	public long getZ() {
		return z;
	}

	public void translate(Point move) {
		this.x = move.x;
		this.y = move.y;
		this.z = move.z;
	}

}
