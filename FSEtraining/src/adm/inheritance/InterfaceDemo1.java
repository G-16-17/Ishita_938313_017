package adm.inheritance;

public class InterfaceDemo1 {
	public static void main(String[] args) {
		MySquare s = new MySquare();
		System.out.println(s.calculateArea());
		System.out.println(s.calculateCircum());
		System.out.println(s.getSide());
		
		Ishape sh;
		
		sh=s;
		
		System.out.println(sh.getClass());
		System.out.println(s.calculateArea());
		System.out.println(s.calculateCircum());
		System.out.println("----");
		
		sh = new MyCircle(23);
		System.out.println(sh.getClass());
		System.out.println(s.calculateArea());
		System.out.println(s.calculateCircum());
	}

}
