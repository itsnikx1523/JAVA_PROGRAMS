import java.util.Scanner;
class Overloading
{
void take(String name)
{
System.out.println("Your Name="+name);
}
void take(int roll,int marks)
{
System.out.println("Roll no="+roll);
System.out.println("Marks obtained in Java="+marks);
}
}
public class Funcloading
{
public static void main(String []args)
{
Scanner take=new Scanner(System.in);
System.out.println("Enter Your name");
String s=take.next();
System.out.println(" Enter your roll no and marks");
int a=take.nextInt();
int b=take.nextInt();
Overloading ol =new Overloading();
ol.take(s);
ol.take(a,b);
}
}

