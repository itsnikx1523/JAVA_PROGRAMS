import java.util.Scanner;
class Example
{
static void Sum(int a,int b)
{
int s=a+b;
System.out.println("Integer_Sum="+s);

}
}
class Sample extends Example
{
static void Sum(float a, float b)
{
float s=a+b;
System.out.println("Floating_Sum="+s);
}
}
public class OverrideEg
{
public static void main(String args[])
{
Sample s=new Sample();
s.Sum(2.3f,1.5f);
}
}
