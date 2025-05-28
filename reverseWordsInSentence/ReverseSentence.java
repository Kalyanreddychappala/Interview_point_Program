package reverseWordsInSentence;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSentence {

	public static void main(String[] args) {
		List<String> data=Arrays.asList("pavan kalyan reddy").stream()
				.map(e->new StringBuilder(e).reverse().toString())
				.collect(Collectors.toList());
		System.out.println(data);
		
		
		
		

	}

}
