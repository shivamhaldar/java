public class Excep6 
{
    public static void main(String args[])
    {
    try
        {
            try
            {
            int b=39/0;
            System.out.println("going to divide "+b);
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            try
            {
                int a[]=new int[5];
                a[5]=4;
            }
            catch(ArrayIndexOutOfBoundException e)
            {
                System.out.println(e);
            }
            System.out.println("Other Statement");
        }
            catch(Exception e)
        {
            System.out.println("handled");
        }
        //System.out.println(Normal flow);
    }      
}


