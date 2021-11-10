package adm.learn;
import java.util.Arrays;

public class arrayDemo2 {

	public static void main(String[] args) {
		
		int []arr = {90,67,34,22,88,45,12,23,69};
		int len=arr.length;
		int arr1[]= Arrays.copyOf(arr,len);
		//System.out.println(Arrays.t);
		
		int []arr4= Arrays.copyOfRange(arr,2,7);
		System.out.println(Arrays.toString(arr4));
		
		Arrays.sort(arr);
		//System.out.println(Arrays.toString());
		
		
		
	}

}
