
public class BufferVsBuilder {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");
		
			for(int i =0; i <1000000; i++) {
				sb.append("Technology");
			}
			System.out.println("The time taken by stringBuffer is "+(System.currentTimeMillis()-time)+"ms");
			time = System.currentTimeMillis();
			StringBuilder sb1 = new StringBuilder("Java");
			
				for(int i =0; i <1000000; i++) {
					sb1.append("Technology");
				}
				System.out.println("The time taken by StringBuilder is "+(System.currentTimeMillis()-time)+"ms");
	}

}
//Amdocs code

//the time taken by stringBuffer is 96ms
//The time taken by StringBuilder is 35ms