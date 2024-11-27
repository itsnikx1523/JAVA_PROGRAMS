//Create A Final Class 
//Sample code snippet of Final class

final class FinalSample
{
public void display()
{
System.out.println("This is a final class");
}
}

//try to extend the final class
class Main extends FinalSample
{
public void display()
{
System.out.println("The Final Method is Overriden");
}

public static void main(String args[])
{
Main obj=new Main();
obj.display();
}
}