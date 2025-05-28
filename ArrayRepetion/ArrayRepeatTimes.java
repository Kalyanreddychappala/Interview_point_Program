package ArrayRepetion;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayRepeatTimes {

	public static void main(String... args) {
		int[] arr= {1,1,1,3,4,5,2,2};
		if(arr.length==0) {
			System.out.println("Null");
			return;
		}
		
		Map<Integer,Long> frequency=Arrays.stream(arr)
				.boxed()//convert int to Integer
				.collect(Collectors.groupingBy(e->e,
						Collectors.counting()));
		System.out.println(frequency);
		
		Map.Entry<Integer, Long> max=Collections.max(
				
				frequency.entrySet(),
				Map.Entry.comparingByValue());
		
		System.out.println(max.getKey()+": "+max.getValue());
		
		System.out.println();
		//normal method
		
		int maxcount=0;
		int maxfrequency=0;
		
		for(int i=0;i<arr.length;i++) {
			int count=1;
			
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>maxcount) {
				maxcount=count;
				maxfrequency=arr[i];
			}
			
		}
		System.out.println(maxfrequency+": "+maxcount);
		
	}
	

}
