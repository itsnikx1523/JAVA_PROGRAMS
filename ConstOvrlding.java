public class ConstOvrlding
{
ConstOvrlding()
{
System.out.println(" I am a Constructor with no arguments");

}
ConstOvrlding(int a)
{
int b=a;
System.out.println("Value of b:"+b);
}

public static void main(String args[])
{
ConstOvrlding C=new ConstOvrlding();
ConstOvrlding C1=new ConstOvrlding(23);


}
}
