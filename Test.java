abstract class aa
{
	int c;
	aa()
	{
		c=10;
		System.out.println(" constructor of aa");
		
	}
	
	public abstract int add(int a,int b);
	public int sub(int a,int b)
	{
		return c; 
		
	}
	

}


class A extends aa
{
 A()
 {
	 System.out.println(" constructor of A");
 }
 @Override
	public int add(int a, int b) {
	return a+b;
	}
	
}


public class Test
{
public static void main(String[] args)
{
	A a=new A();
	
	//first run this code see the output
//	then uncomment beolw code and again see the output
	
	
	//System.out.println(a.sub(0,0));
	
}

}
