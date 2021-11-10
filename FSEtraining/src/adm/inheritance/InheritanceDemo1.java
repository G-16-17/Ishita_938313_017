package adm.inheritance;

public class InheritanceDemo1 {
	public static void main(String[] args) {
		
		BasicCalc bc = new BasicCalc();
		bc.seto1(100);
		bc.seto1(200);
		
		System.out.println(bc.add());
		System.out.println(bc.product());
		
		ScientificCalc sc = new ScientificCalc();
		sc.seto1(10);
		sc.seto2(20);
		sc.seto3(30);
		System.out.println(sc.add());
		System.out.println(sc.product());
		System.out.println(sc.mySqrt());
		
	}

}
