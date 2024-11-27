import java.util.Scanner;
public class SwtchSmple
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter your choice of number from dice no's(1-6)");
int a=in.nextInt();
switch(a)
{
case 1:
System.out.println("You have write a 4 line Poetry");
break;
case 2:
System.out.println("You have write a propsosal letter to the third person of your whatsapp contact");
break;
case 3:
System.out.println("You have Sing a romantic song");
break;
case 4:
System.out.println("You have to write few words on your parents");
break;
case 5:
System.out.println("You have to write a shayari of 10 words");
break;
case 6:
System.out.println("You have to write  14 line ghazal");
break;
default:
System.out.println("The number you have selected does not exist in dice..Try again!!");
break;
}
}
}

