public class binarySearch {
	
	
	public static void main(String[] args) {
		
		
		int[] arr = {1, 22, 54, 222, 821};
		
		int ele =222;
		
		int ans = binarySearch(arr, ele);
		System.out.print(ans);
	
	}
	
	
	public static int binarySearch(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length-1;
		
		
		while(start <=  end) {
			
			int mid = start + (end-start) / 2;
			
			if(arr[mid]==target) return mid;
			
			else if(arr[mid] < target) start = mid+1;
			
			else end = mid-1;
			
		}
		
		return -1;
		
	}

}
