//Sample Snippet code of Final method 

//create a Final method
class FinalMethod
{
public final void display()
{
System.out.println("This is a Final Method");
}
}
class Main extends FinalMethod
{
//try to override final method
public final void display()
{
System.out.println("The Final method is overriden");
}
public static void main(String args[])
{
Main ob=new Main();
ob.display();
}
}
