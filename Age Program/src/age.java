import java.util.Scanner;

/**
 * 
 */

/**
 * @author DHEERAJ
 *
 */
public class age {

	public static void main(String[] args) {
	System.out.println("enter your Age:");
	Scanner Scan =  new Scanner(System.in);
	int age=Scan.nextInt();
	
	
	int months = age * 12;
	int days = age *365;
	int minutes = age*24*60;
	System.out.println(" you are " + months + " months ,or " + days + " days, or " + minutes +" minutes old." );
	}

}
