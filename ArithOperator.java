import java.util.Scanner;
public class ArithOperator
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a,b,s,pro,div,diff,mod;
float c,d,s1,pro1,div1,diff1,mod1;
System.out.println("Enter any two numbers of your choice as Integer");
a=in.nextInt();
b=in.nextInt();

System.out.println("Enter any two numbers of your choice as  Floating");
c=in.nextFloat();
d=in.nextFloat();

// "+"--operator
s=a+b;
s1=c+d;

//"-"--operator
diff=a-b;
diff1=c-d;
//"*"-- operator
pro=a*b;
pro1=c*d;

//"/"--operator
div=a/b;
div1=c/d;
//mod operator--"%"
mod=a%b;
mod1=c%d;

System.out.println("IntSum="+s+"\n"+"FloatSum="+s1);
System.out.println("IntDifference="+diff+"\n"+"FloatDifference="+diff1);
System.out.println("IntProduct="+pro+"\n"+"FloatProduct="+pro1);
System.out.println("IntDivision="+div+"\n"+"FloatDivision="+div1);
System.out.println("IntModulo="+mod+"\n"+"FloatModulo="+mod1);
}
}




