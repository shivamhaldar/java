
public class MyException1
{
    public static void main(String args[])
    {
        try
        {
        int a=10;
        // int b=5;
        int b=0;
        int c=a/b;
        
        System.out.println("Output is "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception Handling");
            System.out.println(e);
        }
        System.out.println("Rest of the code");
    
    }
}
