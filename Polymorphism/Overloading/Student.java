public class Student
{
	public void getmarks(int m,String s)
	{
	System.out.println("Hello "+s+" You got "+m+" Marks" );
	}
	public void getmarks(String s,int m)
	{
	if(m>=30)
	{
	System.out.println("Hello "+s+" You got "+m+" Marks and you are pass");
	}
	else
	{
	System.out.println("Hello "+s+" You got "+m+" Marks and you are fail");
	}
	}
public static void main(String args[])
{
  Student s=new Student();
  s.getmarks(50,"Ram");
  s.getmarks("Shyam",25);
  s.getmarks("Rahul",33);
}
}