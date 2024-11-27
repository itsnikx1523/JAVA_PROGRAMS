import java.util.Scanner;
public class Matrix
{
public static void main(String []args)
{
Scanner in =new Scanner(System.in);
int matrix[][]=new int[3][3];
System.out.println("Enter 9 elements for array");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{

matrix[i][j]=in.nextInt();
}
}

System.out.println("Matrix as shown below:");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{

System.out.print(matrix[i][j]+"  ");
}
System.out.println(" ");
}
}
}


