import java.math.BigDecimal;

public class SizeOpe {
	public static void main(String[] args) {
	//	System.out.println(Byte.SIZE);
		//System.out.println(Byte.MAX_VALUE);
		
		int i =100;
		long l =200l;
		i=(int) l;//from long to int explicit mapping 
		System.out.println(i);
		
		int i1=100;
		long l1 =i1;//implicit mapping
		System.out.println(l1);
		
		float f = 12.2f;
		int i77 = (int)f;
		System.out.println(i77);//12
		
		int q = 100;
		float f1 = q;
		System.out.println(f1);//100.0
		
		
		
		int i11 = 10;
		int j22 = i11++;//here int j22=i11 first..... no increment same value
		System.out.println(j22);//10
		System.out.println(i11);//11
		
		//here we have int j22 = i11++
		//just split int i11++ that is i11 then ++ will come  that is int j22 first get i11  value then  ++ increment happens
		
		
		int a = 15;
		int b = ++a;//here int b = ++ ----so increment
		System.out.println(b);//16
		System.out.println(a);//16
		
		int c = 11;
		int d = c--;
		System.out.println(d);//11
		System.out.println(c);//10
		
		int c1 = 11;
		int d1 = --c1;
		System.out.println(d1);//10
		System.out.println(c1);//10
	
	
	 float fa  = 124.39101000f;
	 float fb =  123.29190000f;
	 System.out.println(fa+fb);
	
	 //to get more accurate values we use BigDecimal and it is inmuttable;
	
 
//	BigDecimal b12 = new BigDecimal("123.29190000f");
//	BigDecimal add1 = b11.add(b12);
//	System.out.println(add1);
//	
	
	
	}

}
