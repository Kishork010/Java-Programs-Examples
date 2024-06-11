package arrays;
import java.util.Scanner;
public class semester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of semesters");
		int semesters = scan.nextInt();
		
		//creating the array
		boolean [] arr = new boolean[semesters];
		
		//storing the backlogs in array
		for(int i=0 ; i<=arr.length-1 ; i++) 
		{
			System.out.println("Do you have any backlogs in semester" +(i+1)+":");
		arr[i] = scan.nextBoolean();
		}
		
		//Displaying the percentage
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("backlog in semester"+(i+1)+"is"+arr[i]);
		}

	}

}
