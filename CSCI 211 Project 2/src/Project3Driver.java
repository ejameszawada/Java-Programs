import java.io.IOException;
import java.util.Scanner;

/*
Name: Ethan Zawada
Current Date: 10/23/2019
Sources Consulted: I consulted with Nick Grovich as well as looking in my book and online

By submitting this work, I attest that it is my original work and that I did
not violate the University of Mississippi academic policies set forth in the
M book.
*/ 

public class Project3Driver {

	public static void main(String[] args) throws IOException {
		//create an object "saf" to call the sort and frequency class
		SortandFrequency saf = new SortandFrequency();
		//create a scanner
		Scanner scan = new Scanner(System.in); 
		//ask for user input
		System.out.print("How many numbers would you like to have on the list?: ");
		//set nums equal to what the user enters
		int nums = scan.nextInt(); 
		//create an array the size of user input
		int Array[] = new int[nums]; 
		
		//ask user the amount of numbers they requested to add to the list
		System.out.println("Enter " + nums + " numbers to add to the list");
		//loop for the amount of numbers for the user input
		for(int i= 0 ; i < Array.length; i++) {
			Array[i] = scan.nextInt();
		}
		//set bottom and top of the sort
		int low = 0; 
		int high = Array.length - 1; 
		//call the quicksort
		saf.quickSort(Array, low, high); 
		
		System.out.println("");
		
		System.out.println("Here are the numbers you entered sorted from smallest to largest:"); 
		//looping through the array to list out the sorted numbers
		for (int i = 0; i < Array.length; i++) { 
			System.out.print(Array[i]+ " ");
	}
		System.out.println("");
		//write the frequency as well as being sorted to a file
		saf.fileWriter("Frequency", Array);
		//direct the user where to find the file
		System.out.println("Search for the file titled 'Frequency' on your PC to see the frequency.");
	}
}