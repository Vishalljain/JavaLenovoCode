
public class SortString {
		public static void main(String[] args) {
			String s = "abc";
			char[] y = s.toCharArray();
			char temp;
			for(int i =0;i<y.length;i++) {
				for(int j =i+1;j<y.length;j++) {
					if(y[i]>y[j]) {
						temp=y[i];
						y[i]=y[j];
						y[j]=temp;
						
					}
					
				}
			}
			for(char a : y) {
				System.out.println(a);
			}
		}

	}



