public class Student 
{
    String name;
    /*final*/ String PAN;
    Student(String name,String PAN)
    {
        this.name=name;
        this.PAN=PAN;
    }
    public void displayInfo()
    {
        System.out.println("Name is "+name+" PAN Number is "+PAN);
    }
    // Hacked Details
    public void changeInfo(String name,String PAN)
    {
        this.name=name;
        this.PAN=PAN;
    }

    public static void main(String args[])
    {
        Student s1=new Student("Student 1","BRPHX185LW");
        Student s2=new Student("Student 2","BRPHX185LX");
        Student s3=new Student("Student 3","BRPHX185LY");
        Student s4=new Student("Student 4","BRPHX185LZ");
        s2.changeInfo("HACKER","HACKED"); // Hacker Details
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        s4.displayInfo();
    }
}
