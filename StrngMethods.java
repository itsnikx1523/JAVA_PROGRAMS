import java.util.Scanner;
public class StrngMethods
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter your First name");
String name=in.nextLine();
//using length()--to find the length of variable
int value=name.length();
System.out.println("Length ="+value);
//using substring()--returns a substring from start to the end substring.
System.out.println("value:--"+name.substring(2));
//using substring(int start,int end)--returns a substring from start index  to the end index.
System.out.println("value:--"+name.substring(1,4));

//using replace()--:returns a new string after replacing previous onw with new one

System.out.println("Changed_Name="+name.replace('i','e'));
//using startsWith()--:returns true if name starts with desired string as input by user

System.out.println("option:"+name.startsWith("Nik"));
String lang=new String("JavaProgramming");
//using endswith()--: returns true if input ends with desired letters by user
System.out.println("Opt:"+lang.endsWith("ing"));

//using indexOf()--: returns the index of the given string
System.out.println("IndexVaue:"+name.indexOf('l'));
System.out.println("IndexVaue1:"+lang.indexOf("Pro"));

//using lastIndexOf()--: returns the last index of the given string
System.out.println("IndxVle:"+lang.lastIndexOf('m'));

}
}

