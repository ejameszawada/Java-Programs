import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SortandFrequency {
	//quicksort
	public void quickSort(int[] Array, int low, int high) {
		if (Array == null || Array.length == 0)
			return;
 
		if (low >= high)
			return;
 
		//choose the pivot
		int middle = low + (high - low) / 2;
		int pivot = Array[middle];
		
		int i = low;
		int j = high;
		
		while (i <= j) {
			//left less than the pivot
			while (Array[i] < pivot) {
				i++;
			}
			//right greater than the pivot
			while (Array[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = Array[i];
				Array[i] = Array[j];
				Array[j] = temp;
				i++;
				j--;
			}
		}
 
		//recursively sort
		if (low < j)
			quickSort(Array, low, j);
 
		if (high > i)
			quickSort(Array, i, high);
	}
	//create method to write to file
	public void fileWriter(String filename, int Array[]) throws IOException {
		//create file writer object
		FileWriter fw;
		fw = new FileWriter(new File(filename));
		  
		int j = 0;
		int count = 0;
		int num = 0;
		//calculate frequency
		while(j < Array.length) {
			count = 0;
			for (int i = j; i < Array.length; i++) {
				num = Array[j];
				if(Array[i] == num) {
					count++;
				}
			 }
		//writes the amount of times each number occurs through the while loop
		 fw.write(num + " occurred " + count + " time(s).\n");
		 j+= count;
		 }
		//close the file writer
		fw.close();
	}	
}