package stringUpperCase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("pavan","kalyan","reddy","kumar");
		
		List<String> upper=names.stream()
				.map(e->e.toUpperCase())//map(String::toUppperCase)
				.collect(Collectors.toList());
		System.out.println(upper);

	}

}
