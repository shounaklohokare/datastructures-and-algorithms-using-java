package basicJavaPrograms;


public class LinearSearch {
	
	
	public static void main(String[] args) {
		
		
		int[] arr = {1, 97, 54, 22, 821};
		int target = 23;
		
		int ans = linearSearch(arr, target);
		
		if (ans>-1) {
			System.out.println("The target is found at index: " + ans);
		}else {
			System.out.println("The target is not found in the array.");
		}
		
	}
	
	public static int linearSearch(int[] arr, int target) {
		
		if(arr.length==0) return -1;
		
		for(int i=0; i<arr.length; i++) {
			
			int element = arr[i];
			
			if(element==target) return i;
		}
		
		return -1;
	}

}
