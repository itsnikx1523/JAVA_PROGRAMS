import java.util.Scanner;
public class Array
{
public static void main(String []args)
{
Scanner in =new Scanner(System.in);
int larr[]=new int[10];
System.out.println("Enter elements for array");
for(int i=0;i<10;i++)
{
larr[i]=in.nextInt();
}
System.out.println("Array Elements are");
for(int i=0;i<10;i++)
{
System.out.println( "Elements "+larr[i]);
}


