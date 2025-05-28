package maxAndmin;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxAndMin {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,20,3,4,10,50,60);
		Optional<Integer> max=list.stream().max(Integer::compareTo);
		System.out.println(max);
		
		Optional<Integer> min=list.stream().min(Integer::compareTo);
		System.out.println(min);

	}

}
