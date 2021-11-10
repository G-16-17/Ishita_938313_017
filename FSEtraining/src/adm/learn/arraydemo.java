package adm.learn;
import java.util.Arrays;
public class arraydemo {

	public static void main(String[] args) {
		int []arr= {90,67,34,22,88,45,12,23,69};
		System.out.println("Before Sort");
		for(int num: arr) {
			System.out.println(num+" ");
		}
		Arrays.sort(arr);
		System.out.println("\n After Sort");
		for(int num: arr) {
			System.out.println(num+" ");
		}
		System.out.println("\n--------------");
		int []arr2= new int[10];
		String s = Arrays.toString(arr2);
		System.out.println(s);
		Arrays.fill(arr2,100);
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]+" ");
		}
		System.out.println("\n-------------");
		//endindex -1
		Arrays.fill(arr2,2,7,500);
		String str = Arrays.toString(arr2);
		System.out.println(str);

	}

}
