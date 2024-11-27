import java.util.Scanner;
public class CompreOperator
{
public static void main(String args[])
{
Scanner t=new Scanner(System.in);
int a,b;
float c,d;
System.out.println("Enter any two numbers of your choice as Integer");
a=t.nextInt();
b=t.nextInt();

System.out.println("Enter any two numbers of your choice as Floating Point");
c=t.nextFloat();
d=t.nextFloat();

if(a==b&&c==d)
{
System.out.println("Both numbers are equal");
}
else if(a>b&&c>d)
{
System.out.println("A and C are Superior");
}

else if(b>a&&d>c)
{
System.out.println("B and  D are Superior");
}
else
{
System.out.println("All numbers are superior");
}
}
}

