package stringLowerCase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LowerCase {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("PAVAN","KALYAN","REDDY","KUMAR");
		List<String> lower=list.stream()
				.map(String::toLowerCase)
				.collect(Collectors.toList());
		System.out.println(lower);

	}

}
