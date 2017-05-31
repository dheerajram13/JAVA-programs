import java.io.*;
import java.util.Scanner;

public class Same {
public static void main(String args[]){
System.out.print("Enter the array size: ");
Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
	int highest = 0;
	int arr[] = new int[n];
System.out.println("Enter the array elements: ");
    for(int i=0;i<n;i++){
    	arr[i] = scan.nextInt();
    	if(arr[i]>highest){
    		highest = arr[i];
    	}
    }
    int total=0;
    for(int i=0;i<n;i++){
    	if(highest==arr[i]){
    		total++;
    	}
    }
System.out.println("Number of same elements in the array: ");
System.out.println(total);
 
}
}
