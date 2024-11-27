//Sample code snippet of Interface
interface Structure
{
void shape();
}
class Decison implements Structure
{
public void shape()
{
System.out.println("It Configures rhombus shape");
}
}
class Process implements Structure
{
public void shape()
{
System.out.println("It Configures Rectangle shape");
}
}
public class TestingInterface
{
public static void main(String []args)
{
Structure S=new Process();
S.shape();
Structure S1=new Decison();
S1.shape();
Process P=new Process();
P.shape();
}
}