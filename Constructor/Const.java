public class Const extends Parent 
{
    public Const display()
        {
        return this;
        }
    public void myMethod()
    {
        System.out.println("x");
    }
    public void print()
    {
        System.out.println("print");
    }
    public static void main(String args[])
    {
        Const c=new Const();
        c.print();
        c.myMethod();
	c.display();
        
    }
}
