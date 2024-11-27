import java.util.Scanner;
 interface Animal
{
 void Voice();
 void Action();
}
class Dog implements Animal
{
public void Voice()
{
String e="bark";
System.out.println("Dog_Voice="+e);
}
public  void Action()
{
String f="Kind";
System.out.println("Dog_Action="+f);
}
public static void main(String args[])
{
Animal I=new Dog();
I.Voice();
I.Action();
}
}
