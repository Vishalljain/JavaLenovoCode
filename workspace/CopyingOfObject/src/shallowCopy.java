    // Creating a new reference that points to the same memory location. This is also called a Shallow copy.
public class shallowCopy {
	int i;
	int j;
	public static void main(String[] args) {
		shallowCopy abc=new shallowCopy();
		abc.i=10;
		abc.j=20;
		//System.out.println(abc);
		shallowCopy abc1=abc;
		abc1.i=100;
		//here we are not creating an object we have one object n 2 references 
		System.out.println("abc1:"+" "+abc1.i+" "+abc1.j);
		System.out.println("abc:"+" "+abc.i+" "+abc.j);
		//we are assigning the values of abc to abc1//consider one case if abc1.i=1001 then output will be 
		//for sysout abc=>i=1001 n abc1=> i=1001-->disadvantage because here 2 references are refering/pointing  to same obj.if change in one it will reflect in other.
		//Therefore any changes made in reference objects will be refelected in other objects
		
		//shallow coping is creating one object and 2references are pointing to same obj..
		
	}
}
	
