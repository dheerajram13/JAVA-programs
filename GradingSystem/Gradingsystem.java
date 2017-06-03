import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Gradingsystem {
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int i;
System.out.print("Enter the number of subjects: ");
int n =scan.nextInt();    
System.out.println("Enter the subjects:  ");
int[] arr = new int[n];
for(i= 0;i<n;i++){
int grade = scan.nextInt();
   if(grade<38){
  arr[i] = grade ;
   }
    else{
int f1 =grade +1;
int f2 = grade +2;
  if(f1%5==0){
 arr[i] = f1;
}
    else if(f2%5==0){
        arr[i] = f2;
    }
    else{
        arr[i] = grade;
    }
}
System.out.println(arr[i]);
}
}
}