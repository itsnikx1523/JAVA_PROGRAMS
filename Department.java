import  java.util.*;

abstract class college
{
abstract void show();//declare
}
class BCA extends  college
{
void show()//define
{
int a=10;
System.out.print("A="+a);
}
}

public class Department
{
public static void main(String[] args)
{
BCA d=new BCA();
d.show();
}
}