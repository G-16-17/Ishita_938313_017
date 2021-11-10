package adm.inheritance;

public class MySquare implements Ishape {
	private double side;
	public MySquare() {
		
	}
	public MySquare(double side) {
		this.side=side;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side=side;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Max= "+MAX);
		return side*side;
	}

	@Override
	public double calculateCircum() {
		// TODO Auto-generated method stub
		return 4*side;
		
	}

}
