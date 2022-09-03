public  class Child extends Parent
{
	public void print()
	{
	System.out.println("print called");
	}
	public static void main(String args[])
	{
	Child c=new Child();
	c.print();
	}
}