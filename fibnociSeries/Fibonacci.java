package fibnociSeries;

import java.util.stream.Stream;

public class Fibonacci {

	public static void main(String[] args) {
	
		int first=0;
		int second=1;
		int next;
		for(int i=0;i<10;i++) {
			next=first+second;
			first=second;
			second=next;
			System.out.print(next+" ");
		}
		
		System.out.println();
		Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
        .map(f -> f[0])
        .limit(10)
        .forEach(n -> System.out.print(n + " "));
	}

}
