import java.io.*;
import java.util.Scanner;
                                                           //selection sort  in Java
public class test1
	{
	    public void sort(int arr[])
	    {
	        int n = arr.length;   // size of the array 
	 
	  
	        for (int i = 0; i < n-1; i++)          //i:iterate from the zero  to array of length - 1
	        {
	            int min = i;                        //min:assign i values 
	            for (int j = i+1; j < n; j++)        // j: start iterate from second to last element 
	                if (arr[j] < arr[min])           //compare j with the min then assign min:j

	                    min = j;
	   
	            int temp = arr[min];                 // it goes from left to right for suppose if left is greater than right element than
                                                        //use temporary variable  and  
	            arr[min] = arr[i];                   //swap the variables 
	            arr[i] = temp;                
	        }
	    }
	 
	    
	   public void printArray(int arr[])                      //method to print array 
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	 
	    public static void main(String args[])
	    {
	    Scanner scan = new Scanner(System.in);
	        test1 srt = new test1();                           //create object and access the sort,print methods
	        int size = scan.nextInt();
	        int arr[] = new int[size];                         //input the array elements
	        for(int a=0;a<size;a++){
	        arr[a] = scan.nextInt();
	        }
	        srt.sort(arr);
	        System.out.println("Sorted array");
	        srt.printArray(arr);
	    }
	}
