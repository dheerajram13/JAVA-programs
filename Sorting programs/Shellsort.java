import java.io.*;
import java.util.*;

class ShellSort
{
    /* An utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    /* function to sort arr using shellSort */
    int sort(int arr[])
    {
        int n = arr.length;
 
        // Start with a big pos, then reduce the pos
        for (int pos = n/2; pos > 0; pos /= 2)
        {
            // Do a posped insertion sort for this pos size.
            // The first pos elements a[0..pos-1] are already
            // in posped order keep adding one more element
            // until the entire array is pos sorted
            for (int i = pos; i < n; i += 1)
            {
                // add a[i] to the elements that have been pos
                // sorted save a[i] in t and make a hole at
                // position i
                int t = arr[i];
 
                // shift earlier pos-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= pos && arr[j - pos] > t; j -= pos)
                    arr[j] = arr[j - pos];
 
                // put t (the original a[i]) in its correct
                // location
                arr[j] = t;
            }
        }
        return 0;
    }
 
    // Driver method
    public static void main(String args[])
    {
        int arr[] = {12, 34, 54, 2, 3};
        System.out.println("Array before sorting");
        printArray(arr);
 
        ShellSort ob = new ShellSort();
        ob.sort(arr);
 
        System.out.println("Array after sorting");
        printArray(arr);
    }
} 