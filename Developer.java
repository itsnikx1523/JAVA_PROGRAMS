/* Interface is just like a class which contains only abstract methods.
To achieve inerface ,java provides a keyword called Implements
Note--: 1) Interface methods are by deafault public and private.
2) Interface variables are by default public+static+final.
*/
import java.util.Scanner;
interface client
{
void input();
void output();
}
class Developer implements client
{
String name;
double sal;
public void input()
{
Scanner g=new Scanner(System.in);
System.out.println("Enter Username:");
name=g.nextLine();
System.out.println("Enter Salary :");
sal=g.nextDouble();
}
public void output()
{
System.out.println("Username:"+name);
System.out.println("Salary:"+sal);
}
public static void main(String args[])
{
client c=new Developer();
c.input();
c.output();
}
}

