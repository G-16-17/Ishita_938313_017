package adm.learn;

public class OverloadInvoke {
	
	public static void main(String[] args) {
		int a=10,b=20,c=30;
		float f1=23.45f, f2=45.56f;
		double d1=45.67, d2=45.56f;
		byte b1=56,b2=45;
		
		overloading o = new overloading();
		int res = o.add(a,b);
		System.out.println("sum= "+res);
		System.out.println(o.add(f1,f2));
		System.out.println(o.add(a,b,c));
		System.out.println(o.add(a,f1));
		System.out.println("------------");
		
		System.out.println(o.add(b1,b2));
		System.out.println(o.add(b1,f1));
		System.out.println(o.add(f1,a));
		
		//The method add(int, int) in the type overloading is not applicable for the arguments (double, double)
		//no matching method - double cannot be converted into float or int
		//System.out.println(o.add(d1,d2));
		
		
		
		}

}
