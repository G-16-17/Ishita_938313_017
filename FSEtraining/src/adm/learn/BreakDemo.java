package adm.learn;

import java.util.Scanner;
import com.learn.pack1.Item;

public class BreakDemo {

	public static void main(String[] args) {
		//user defined class
		Item item1 = new Item();
		//predefined class
		Scanner sc= new Scanner(System.in);
		//nextInt(), nextFloat(), nextDouble, next(), nextLine()
		//byte b1 = sc.nextByte();, nextShort(), nextLong()
		//8 primitve - 7 mthods are available
		//to get a char, we dont have a method
		
		System.out.println("Enter n");
		int n = sc.nextInt();
		int num = 1;
		while(true) {
			System.out.println("Inside Loop");
			num++;
			if(num>n) {
				break;
			}
			System.out.println(num);
		}
		System.out.println("Outside loop");
		}
	}

