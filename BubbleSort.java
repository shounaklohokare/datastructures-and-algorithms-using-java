package basicJavaPrograms;

import java.util.Arrays;

public class Bubble {
	
	public static void main(String[] args) {
		
		int[] arr = {5,4,3,2,1};
		
		bubble(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void bubble(int[] arr) {
		
		boolean swapped;
		
		for(int i=0; i<arr.length; i++) {    // counts passes
			swapped = false;
			for(int j=1; j<arr.length-i; j++) { // performs pass and reduces length of each pass by 1 at each iteration
				
				if(arr[j-1] > arr[j]) {  // compares prev element with current
					int temp = arr[j];    // if prev is greater than current then performs a swap
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped = true;    
				}	
			}
			if(!swapped) break;  // if swap isn't occured at a particular pass then it won't further thus it breaks the loop
		}
	}

}
