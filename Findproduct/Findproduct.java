import java.io.*;
import java.util.Scanner;

class Findproduct{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
long product = 1;
System.out.print("Enter the array size: ");
int n = scan.nextInt();
System.out.println("Enter the array elements:");
int[] arr = new int[n];
for(int i=0;i<n;i++){
arr[i] = scan.nextInt();
product = ((product*arr[i])%((long)(Math.pow(10,9))+7));
}
System.out.println(product);
}
}
