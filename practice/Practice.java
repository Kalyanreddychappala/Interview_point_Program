package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Practice {

	public static void main(String[] args) {
	
		
	List<Integer> number=Arrays.asList(10,20,50,40,60);
	
	Optional<Integer> second=number.stream()
			.sorted(Comparator.reverseOrder())
			.skip(1)
			.findFirst();
	System.out.println(second);
			
		}
	}

