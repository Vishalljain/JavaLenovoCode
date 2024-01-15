//String builder is more efficient than string buffer
public class StringbuffervsStringBuilder {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("JAVA");
		for(int i=0;i<10000000;i++) {
		sb.append("TUTORIALS");
		}
		System.out.println("Time taken by StringBuffer"+(System.currentTimeMillis()-startTime)+"ms");
		startTime = System.currentTimeMillis();
		StringBuilder sbuilder = new StringBuilder("JAVA");
		for(int i=0;i<10000000;i++) {
		sb.append("TUTORIALS");
		}
		System.out.println("Time taken by StringBuilder"+(System.currentTimeMillis()-startTime)+"ms");
	}

}
