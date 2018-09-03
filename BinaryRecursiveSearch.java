
public class BinaryRecursiveSearch implements Practice2Search {
	int[] arr;
	@Override
	public String searchName() {
		return "Binary Recursive search";
	}

	
	public int search(int[] arr, int target) {
		this.arr = arr;
		int low = 0;
		int high = arr.length - 1;
		return binarySearch(target, high, low);
	}
	public int binarySearch(int target, int low, int high) {
	
		if (low > high)          
		      return -1;
		else{
		      int midPoint;
		      midPoint = (low + high) / 2;

		      if (target == arr[midPoint])          
		        return midPoint;                   
		      else if (target < arr[midPoint])      
		        
		        return binarySearch (target, low, midPoint - 1);
		      else                           
		        
		        return binarySearch (target, midPoint + 1, high);
		    }
	}
}
