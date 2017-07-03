# Count
import java.io.*;
import java.util.*;
public class Count
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("Enter a digit");
while(n>0)
{
n=n/10;
}
System.out.println("count of a digit is:"+n);
}
}
