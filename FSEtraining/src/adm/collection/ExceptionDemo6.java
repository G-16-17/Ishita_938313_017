package adm.collection;

import java.util.Scanner;



public class ExceptionDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		int []arr = {10,20,30,40,50};
		String str = null;
		try {
			c=a/b;
			System.out.println("C= "+c);
			int value = arr[c];
			System.out.println("Value= "+value);
			System.out.println("Length = " + str.length());
			System.out.println("End of try block");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			c=a;
			System.out.println(e.getMessage());
			System.out.println("ErrorOccurred..." + e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Provide valid values");
			System.out.println("error..."+e);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("super class exception handle- always at last");
			System.out.println(e);
		}
		System.out.println("value of c= " +c);
		System.out.println("End of program");
	}

}
