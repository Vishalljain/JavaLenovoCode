//important apti question
public class last {
public static void main(String[] args) {
	int a=10;
	int b =10;
	System.out.println(a==b);//true
	
	int c=10;
	Integer d =10;
	System.out.println(d==c);//true
	
	Integer e =10;
	Integer f =10;
	System.out.println(e==f);//true
	System.out.println(e.equals(f)+"w");
	
	Integer g = 10;
	Integer h = new Integer(10);
	System.out.println(g==h);//false
	System.out.println("hello"+g.equals(h));
	
	
	Integer i = new Integer(10);
	Integer j = new Integer(10);
	System.out.println(i==j);//false
	
	int k=10;
	Integer l = new Integer(10);
	System.out.println(k==l);//true
	//System.out.println(k.equals(l));false
	
	Integer y = new Integer(10);
	Integer z = new Integer(10);
	System.out.println(y.equals(z));//true
	
	Integer q =10;
	Integer r =10;
	System.out.println(q==r);//true
	int s =10;
	System.out.println(l.equals(q));
	
	
	
	
	
	
	
	
}
}
