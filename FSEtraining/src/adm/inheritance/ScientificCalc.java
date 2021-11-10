package adm.inheritance;

public class ScientificCalc extends BasicCalc {
	
	private int o3;
	//hiding of a field-hiding parent class field - not recommended
	//private int o1
	
	public  int geto3() {
		return o3;
	}
	public void seto3(int o3) {
		this.o3= o3;
	}
	public double mySqrt() {
		return Math.sqrt(o3);
	}
	public double average() {
		//int sum= o1+o3;   //error bcoz o1 is private
		int sum = o3 +geto1() + geto2();
		double avg = sum*1.0/3;
		return avg;
	}
	
	public int add() {
		return geto1()+geto2()+o3;
	}

}
