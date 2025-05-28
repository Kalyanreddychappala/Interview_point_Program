package stringStratsWith;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStarts {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Apple","Arun","Arjun","Pavan","kiran");
		
		List<String> start=names.stream()
				.map(e->e.toUpperCase())
				.filter(e->e.startsWith("A"))
				.collect(Collectors.toList());
		System.out.println(start);

	}

}
