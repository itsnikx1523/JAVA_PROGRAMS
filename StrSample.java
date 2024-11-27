import java.util.*;
import java.util.Scanner;
public class StrSample
{
static void Str()
{
Scanner in=new Scanner(System.in);
System.out.println("Enter your name in lowercase form");
String S=in.nextLine();
String M=S.toUpperCase();

System.out.println("Name in block letters="+M);
}
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
Str();
String my="JavaProgramming";
char result =my.charAt(4);
System.out.println("character at 4th Index="+result);
int result2=my.codePointAt(4);
System.out.println(result2);

//using compareTo()
String str1="Program";
String str2="Program";
System.out.println(str1.compareTo(str2));//Return  0 because they are equal

//using compareToIgnoreCase()
String stra="Program";
String strb="PROGRAM";
System.out.println(stra.compareToIgnoreCase(strb));//return 0 :compares the string with ignoring the case of letters 

//using Concat()
System.out.println("Enter your First name");
String Fname=in.nextLine();
String fn=Fname.toUpperCase();
System.out.println("Enter your Last name");
String Lname=in.nextLine();
System.out.println( "Full name "+fn.concat(Lname));

//Using contains()-- checks whether a string contains a sequence of characters
String Smpl="JavaPRogrammiNG";
System.out.println(Smpl.contains("iNG"));//true
System.out.println(Smpl.contains("PRogram"));//true
System.out.println(Smpl.contains("miNG"));//true
System.out.println(Smpl.contains("java"));//false

//using copyValueOf()-- returns a String that represents the characters of a char array

char[] mystr={'J','a','v','a','P','r','o','g','r','a','M'};
String mystr2="";
mystr2=mystr2.copyValueOf(mystr,0,9);
System.out.println("Returned String:"+mystr2);




}
}
