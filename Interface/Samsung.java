
public class Samsung extends SuperClass implements I1,I2,I3
{
    public void channelUp()
    {
        System.out.println("Up");
    }
    public void channelDown()
    {
        System.out.println("Down");
    }
    public void volumeUp()
    {
        System.out.println("Volume Up");
    }
    public void volumeDown()
    {
        System.out.println("Volume Down");
    }
    public void childLock()
    {
        System.out.println("Child Lock");
    }
    public static void main(String args[])
    {
        Samsung s=new Samsung();
        s.display();
        s.channelUp();
        s.channelDown();
        s.volumeUp();
        s.volumeDown();
        s.childLock();
        
    }
}
