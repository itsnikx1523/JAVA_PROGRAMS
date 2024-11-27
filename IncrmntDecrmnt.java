import java.util.Scanner;
public class IncrmntDecrmnt
{
public static void main(String args[])
{
Scanner g=new Scanner(System.in);
System.out.println("Enter any two numbers of your choice");
int a=g.nextInt();
int b=g.nextInt();
System.out.println("value of a="+(a++));
System.out.println("value of a="+(++a));
System.out.println("value of b="+(++b));
System.out.println("value of b="+(b++));
System.out.println("Sum="+(a+b));
}
}



