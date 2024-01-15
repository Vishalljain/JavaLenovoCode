
public class BuilderVsBuffer {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");
		for(int i = 0 ; i<10000;i++) {
			sb.append("Technology");
			
		}
		System.out.println("TimeTaken by the StringBuffer is"+(System.currentTimeMillis()-time)+"ms");
	
	
	StringBuilder sb1 = new StringBuilder("Java");
	for(int i = 0 ; i<10000;i++) {
		sb1.append("Technology");
		
	}
	System.out.println("TimeTaken by the StringBuilder is"+(System.currentTimeMillis()-time)+"ms");
	

}
}
