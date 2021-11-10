package adm.learn;

public class overloading {
	public int add(int n1, int n2) {
		System.out.println("add - int, int");
		int sum = n1+n2;
		return sum;
	}
	
	public int add(int n1, int n2, int n3) {
		System.out.println("add - int, int, int");
		int sum = n1+n2+n3;
		return sum;
	}
	
	public float add(float n1, float n2) {
		System.out.println("add - float, float");
		float sum = n1+n2;
		return sum;
	}
	
	public float add(int n1, float n2) {
		System.out.println("add - int, float");
		float sum = n1+n2;
		return sum;
	}

}
