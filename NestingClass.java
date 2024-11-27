class Outer
{
public void Show()
{
System.out.println("This is a outerclass");
}
 class Inner
{
public void Display()
{
System.out.println("This is a Inner Class");
}
 class InnerMost
{
public void View()
{
System.out.println("This is a Innermost class");
}
}
}
}
public class NestingClass
{
public static void main(String args[])
{
Outer O=new Outer();
Outer.Inner inn;
Outer.Inner.InnerMost Inm;
O.Show();
inn.Display();
Inm.View();
}
}
