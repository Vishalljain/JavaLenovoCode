package HCL;

import java.util.stream.IntStream;

public class parallelStream {
	public static void main(String[] args) {
		long start = 0;
		long end = 0;
		start = System.currentTimeMillis();
		IntStream.range(1, 100).forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Plain Stram took time"+(end-start)+"in ms");
		
		
		start = System.currentTimeMillis();
		IntStream.range(1, 100).parallel().forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Parallel Stram took time"+(end-start)+"in ms");
		
	}

}
