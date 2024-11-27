import java.util.Scanner;
 class First
{
static void Menu()
{

System.out.println("Press 1-For addition");
System.out.println("Press 2-For Subtraction");
System.out.println("Press 3-For divison");
System.out.println("Press 4-For Multiplication");
System.out.println("Press 5-for Modulo--(Remainder)");
System.out.println("Press 6-For Exit");
}
static void UserInput()
{
Scanner take=new Scanner(System.in);
System.out.println("Enter your choice of option ");
int a=take.nextInt();
switch(a)
{
case 1:
System.out.println("Enter any two numbers");
int c=take.nextInt();
int d=take.nextInt();
int sum=c+d;
System.out.println("Sum="+sum);
break;
case 2:
System.out.println("Enter any two numbers");
int e=take.nextInt();
int f=take.nextInt();
int Diff=e-f;
System.out.println("Difference="+Diff);
break;
case 3:
System.out.println("Enter any two numbers");
int m=take.nextInt();
int n=take.nextInt();
int div=m/n;
System.out.println("Division="+div);
break;
case 4:
System.out.println("Enter any two numbers");
int g=take.nextInt();
int h=take.nextInt();
int Pro=g*h;
System.out.println("Product="+Pro);
break;
case 5:
System.out.println("Enter any two numbers");
int i=take.nextInt();
int j=take.nextInt();
int Rem=i%j;
System.out.println("Remainder="+Rem);
break;
case 6:
//exit(0);
break;
default:
System.out.println("Wrong Input");
break;
}
}
}
public class FuncSwitch
{
public static void main(String args[])
{
First F=new First();
F.Menu();
F.UserInput();
}
}









