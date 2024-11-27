import java.util.Scanner;
interface Shape
{
void Size();
void Face();
}
class RectangleInterface implements Shape
{
public void Size()
{
System.out.println("Contains Length and breadth");
}
public void Face()
{
System.out.println("Face can be eg:- Brick ,mobile etc");
}

class Square implements Shape
{
public void Size()
{
System.out.println("Contains Side");
}
public  void Face()
{
System.out.println("Face can be eg:- Tool box");
}
}
public static  void main(String args[])
{
Shape S=new RectangleInterface();
//Shape S1=new Square();
//S1.Size();
//S1.Face();
S.Size();
S.Face();
}
}