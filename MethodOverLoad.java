import java.util.Scanner;
public class MethodOverLoad
{
static  void Area()
{
Scanner in=new Scanner(System.in);
System.out.println("Enter Length and Breadth ");
int l=in.nextInt();
int b=in.nextInt();
int ar=l*b;
System.out.println("Area="+ar);
}
static void Area(int l1)
{
Scanner t=new Scanner(System.in);
int b1,ar1;
System.out.println("Enter Breadth ");
 b1=t.nextInt(); 
ar1=l1*b1;
System.out.println("Area1= "+ar1);
}

static void Area(int l2,int b2)
{
int ar2;
ar2=l2*b2;
System.out.println("Area2= "+ar2);
}

public static void main(String args[])
{
Area();
Area(23);
Area(23,15);
}
}



