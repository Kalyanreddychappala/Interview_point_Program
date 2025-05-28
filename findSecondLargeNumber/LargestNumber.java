package findSecondLargeNumber;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LargestNumber {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,30,50,80,10,30);
		
		Optional<Integer> secondLargest=list.stream()
				.sorted(Comparator.reverseOrder())//descending order
				.skip(1)
				.findFirst();
		
		System.out.println(secondLargest);

	}

}
