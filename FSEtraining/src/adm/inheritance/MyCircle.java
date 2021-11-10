package adm.inheritance;

public class MyCircle implements Ishape {
	private double rad;
	
	public MyCircle() {
		
	}
	
	public MyCircle(double rad) {
		this.rad=rad;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI*rad*rad;
	}

	@Override
	public double calculateCircum() {
		// TODO Auto-generated method stub
		return 2*Math.PI*rad;
	}

}
