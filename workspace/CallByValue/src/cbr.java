//when dealing with object heap will come..refernce will be in stack
public class cbr {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.length=10;
		modify(r1);
		System.out.println(r1);
		
	}

	public static void modify(Rectangle r2) {
		// TODO Auto-generated method stub
		r2.length=100;
		//output will be 100 for both r1 n r2 since new Rectangle() will create an object d in heap
		// so r1 and r2 in stack will pont to d object( as we creaed one object only) 
	}

}
class Rectangle{
	int length;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + "]";
	}
	
}

//in pass by reference ur sending the  memory address of a variable or pointer to the memory location into a function 
//so if u passed a memory location 
//into a function and if into that function something modifies in that variable it will change the original variable in the parent