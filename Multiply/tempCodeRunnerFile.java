public class Multiply
{
	public int area(int l,int b)
	{
	return l*b;
	}
	public static void display()
	{
	System.out.println("Display Called");
	}
	public static void main(String args[])
	{
		Multiply m=new Multiply();
	System.out.println("Area is "+m.area(10,20));
	Multiply.display();
	}
}