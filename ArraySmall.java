import java.util.Scanner;
public class ArraySmall
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int []el=new int[5];
System.out.println("Enter any five elements in array");
for(int i=0;i<5;i++)
{
el[i]=in.nextInt();
}
System.out.println("Printing elements First");
for(int i=0;i<5;i++)
{
System.out.println("Elements:"+el[i]);
}
int l=el[0];

for(int i=0;i<5;i++)
{


if(el[i]>l)
{
l=el[i];

}

}
System.out.println("Larger no:"+l);
}
}
