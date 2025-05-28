package sumOfAllElements;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfElements {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,30,40,50);
		
		int sum=list.stream()
				.mapToInt(i->i)
				.sum();
		System.out.println(sum);
		
		int add=list.stream()
				.reduce(0, (a,b)->a+b);
		System.out.println(add);
		
		//substraction
		int sub=list.stream()
				.reduce((a,b)->a-b).orElse(0);
		System.out.println("Substraction: "+sub);
		//multiplication
		int mul=list.stream().reduce(1, (a,b)->a*b);
		System.out.println(mul);
		
		List<List<String>> data = List.of(List.of("a", "b"), List.of("c", "d"));
		List<String> flat = data.stream()
		                        .flatMap(List::stream)
		                        .collect(Collectors.toList());
		
		System.out.println(flat);
		
		

	}

}
