
public class BinaryIterativeSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "Binary Iterative search";
	}

	@Override
	public int search(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		while(low > high) {
			int midPoint;
			midPoint = (low + high) / 2;

			if (target == arr[midPoint])          
				return midPoint;                   
			else if (target < arr[midPoint])      
		        high = midPoint - 1;
			else                           
		        low = midPoint + 1;
		    }
		return -1;
	}
}
