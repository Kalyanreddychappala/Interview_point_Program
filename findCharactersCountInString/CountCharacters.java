package findCharactersCountInString;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountCharacters {

	public static void main(String[] args) {
		String name="pavan kalyan reddy";
		
		Map<Character,Long> charCount=name.chars()
										.mapToObj(c->(char)c)
										.collect(Collectors.groupingBy(e->e, Collectors.counting()));
		System.out.println(charCount);
		System.out.println();
		
		charCount.entrySet().stream()
		.filter(e->e.getKey()!=' ')
		.filter(e->e.getValue()>1)
		.forEach(e->System.out.println(e.getKey()+": "+e.getValue()));
		
		System.out.println();
		//normal method
		Map<Character,Integer> count=new HashMap<Character,Integer>();
		for(int i=0;i<name.length();i++) {
			
			char ch=name.charAt(i);
			
			if(ch!=' ') {
				count.put(ch,count.getOrDefault(ch, 0)+1);
			}
		}
		for(Map.Entry<Character,Integer> entry:count.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+": "+entry.getValue());
			}
		}
		
	}

}
