package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Practice {

	public static void main(String[] args) {
	
		
	List<Integer> number=Arrays.asList(10,20,50,40,60);
	
	Optional<Integer> second=number.stream()
			.sorted(Comparator.reverseOrder())
			.skip(1)
			.findFirst();
	System.out.println(second);
	Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
    .map(f -> f[0])
    .limit(10)
    .forEach(n -> System.out.print(n + " "));
			
		}
	}

