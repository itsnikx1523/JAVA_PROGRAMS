public class SampleStatic
{
static
{
System.out.println("Hello!I am Static Field");
}
public static int data=1523;//Static Field 
public static void Intro()//Static Method
{
System.out.println("Introducing myself as the static method");
}
public static void main(String args[])
{
SampleStatic.Intro();
System.out.println(SampleStatic.data);
}
}