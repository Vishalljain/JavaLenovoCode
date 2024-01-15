
public class TOFindVowelsConstonentsSpecialCharacter {
	public static void main(String[] args) {
		String x="hello @";
		char[] y=x.toCharArray();
		int size=y.length;
		int i=0;
		int vowCount=0;
		int specCount=0;//This include blank space also
		int consCount=0;
		while(i!=size)
		{
			if(y[i]>='a' && y[i]<='z')
				{
					if(y[i]=='a'|| y[i]=='e'||y[i]=='i'||y[i]=='o'||y[i]=='u')
						{
							vowCount++;
					
						}
					else 
						{
							consCount++;
						}
				
			}
			else
				{
					specCount++;
				}
			i++;
				}
		System.out.println("The vowels count are"+vowCount);
		System.out.println("The constonanta count are"+consCount);
		System.out.println("The special character count are"+specCount);
	}

}
