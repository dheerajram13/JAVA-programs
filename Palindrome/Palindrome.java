import java.io.*;
import java.util.Scanner;

public class palindrome{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Input a String to check if it is a palindrome or not: ");
String original =scan.next();
String rev = "";
int n = original.length();
for(int i=n-1;i>=0;i--){
	rev = rev + original.charAt(i);
}
 if (original.equals(rev)){
	 System.out.println("The given String " + rev +" is a plaindrome ");
 }
 else{
	 System.out.println("It is not a palindrome");
 }
}
}