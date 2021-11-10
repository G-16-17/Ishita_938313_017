package adm.Streams;

import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {
		// TODO Auto-generated constructor stub
		public static void main(String[] args){
			Integer[] arr= new Integer[] {234,567,113,546,678,500,33,22,1};
			List<Integer> numList1 = Arrays.asList(arr);
			
			Stream<Integer> numStream= numList1.stream();
			long size = numStream.distinct().count();
			System.out.println(size);
			numList1.stream().sorted().forEach(num-> System.out.println(num));
			System.out.println("-------");
			numList1.stream().sorted().forEach(System.out::println);
			System.out.println("-------");
			
			Predicate<Integer> cond1= num-> num%2==0;
			
			numList1.stream().filter(cond1).sorted().forEach(System.out::println);
			System.out.println("-------");
			List<Integer> resList= numList1.stream().filter(num->num>200).collect(Collectors.toList());
			ResultSet.forEach(System.out::println);
			System.out.println("------------");
			
			resList= numList1.stream().mapToInt(num->num*num).forEach(System.out::println);
			//resList.forEach(System.out::println);
			
			Optionsl<Integer> op= numList1.stream().max(Integer::compareTo);
			if(op.isPresent()) {
				System.out.println(op.get());
			}
			
			int min= numList1.stream().min(Integer::compareTo).get();
			System.out.println(min);
			op= numList1.stream().filter(num->num=5332).findFirst();
			if(op.isPresent()) {
				System.out.println(op.get()+"  Object available");
				
			}
			else {
				System.out.println("object not available");
			}
			
			int max1= numList1.stream().max((a,b)->(a>b)?1:1).get();
			System.out.println(max1);
			int max1= numList1.stream().max(Comparator.naturalOrder()).get();
			System.out.println(max2);
		}
	
}
