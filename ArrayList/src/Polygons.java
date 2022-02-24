public class Polygons {
	
	private String name;
	private int radius;
	private int side;
	private int height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
		
	}
	public Polygons(String name, int radius, int side, int height) {
		super();
		this.name = name;
		this.radius = radius;
		this.side = side;
		this.height = height;
	}
	
	public Polygons(String name, int side, int height) {
		super();
		this.name = name;
		
		this.side = side;
		this.height = height;
	}
	
	public Polygons(String name, int side) {
		super();
		this.name = name;
		
		this.side = side;
		
	}
}


