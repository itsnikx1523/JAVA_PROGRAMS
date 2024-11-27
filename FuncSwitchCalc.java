import java.util.Scanner;
public class FuncSwitchCalc
{
static void Menu()
{
System.out.println("Press 1- for addition");
System.out.println("Press 2- for Subtraction");
System.out.println("Press 3- for Multiplication");
System.out.println("Press 4- for Divison");
System.out.println("Press 5- for Modulo--Remainder");
System.out.println("Press 6- for exit");
}

static void UserInput()
{
Scanner in=new Scanner(System.in);
System.out.println("Enter your choice of option");
int a=in.nextInt();
switch(a)
{
case 1:
System.out.println("Enter any two numbers of your choice");
int b=in.nextInt();
int c=in.nextInt();
int Sum=b+c;
System.out.println("Sum="+Sum);
break;
case 2:
System.out.println("Enter any two numbers of your choice");
int d=in.nextInt();
int e=in.nextInt();
int Diff=d-e;
System.out.println("Difference="+Diff);
break;
case 3:
System.out.println("Enter any two numbers of your choice");
int m=in.nextInt();
int n=in.nextInt();
int Pro=m*n;
System.out.println("Product="+Pro);
break;
case 4:
System.out.println("Enter any two numbers of your choice");
int x=in.nextInt();
int y=in.nextInt();
int Div=x/y;
System.out.println("Division="+Div);
break;
case 5:
System.out.println("Enter any two numbers of your choice");
int i=in.nextInt();
int j=in.nextInt();
int Rem=i%j;
System.out.println("Remainder="+Rem);
break;
case 6:
break;
default:
System.out.println("Wrong Input");
break;
}
}

public static void main(String args[])
{
Menu();
UserInput();
}
}


