package adm.learn;
import java.util.Scanner;

public class continueDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int num=1;
		while(num<=n) {
			if(num%2==0) {
				num++;
				continue;
			}
			System.out.println(num++);
		}

	}

}
