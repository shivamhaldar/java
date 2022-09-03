public class Childc extends Parent
{
	public int area(int l,int b)
  {
	if(l==b)
	{
	System.out.println("Area of "+this.judgeshape(l,b)+" is "+super.area(l,b));
	}
	else
	{
	System.out.println("Area of "+this.judgeshape(l,b)+" is "+super.area(l,b));
	}
	return 0;
  }
	public String judgeshape(int l,int b)
  {
	if(l==b)
	{
	return "square";
	}
	else
	{
	return "reactangle";
	}
  }
public static void main(String args[])
	{
	Child c=new Child();
	c.area(10,10);
	}
}