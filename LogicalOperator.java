import java.util.Scanner;
public class LogicalOperator
{
public static void main(String args[])
{
Scanner nm=new Scanner(System.in);
System.out.println("Enter any four numbers of your choice ");
int a=nm.nextInt();
int b=nm.nextInt();
int c=nm.nextInt();
int d=nm.nextInt();
if(a==b&&c==d)
{
System.out.println("All Inputs are same");
}
if(a>b||c>d)
{
System.out.println("OR operator is Working");
}
if(a!=b)
{
System.out.println("A is not equal to B");
}
}
}