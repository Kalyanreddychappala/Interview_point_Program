package removeDuplicates;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,8);
		
		List<Integer> unique=list.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(unique);
		
		
		List<String> names=Arrays.asList("pavan","kalyan","reddy","pavan","kumar","pavan");
		
			List<String> notDuplicate=names.stream()
					.distinct()
					.collect(Collectors.toList());
			System.out.println(notDuplicate);
	}

}
