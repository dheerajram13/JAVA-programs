import java.util.Scanner;

class add{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
    System.out.print("Enter the array size: ");
    int n = scan.nextInt();
	int sum = 0;
	int arr[] = new int[n];
    System.out.println("Enter the array elements: ");
    for(int i=0;i<n;i++){
    	arr[i] = scan.nextInt();
    	sum += arr[i];
    }
    System.out.println(sum);
}
}
