package stringLength;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringLength {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Apple","Arun","Arjun","Pavan","kiran");
		
		Map<String,Integer> size=names.stream()
				.collect(Collectors.toMap(
						name->name,
						name->name.length()
						));
		System.out.println(size);
		
		
		
		

	}

}
