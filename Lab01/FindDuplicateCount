
public class FindDuplicateCount {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 2, 4, 3, 0, 5, 3, 2};
		
	
		
		
		for(int i =0; i < arr.length; i++) {
			int duplicates=0;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
				duplicates++;
				}
			}
			if(duplicates == 0) {
				System.out.println("No duplicates with value " + arr[i] + " beyond Index " + i);
			}
			
			if(duplicates == 1) {
				System.out.println("There is only 1 more occurrence of value " + arr[i] + " starting at index " + i);
			}
			
			if(duplicates > 1) {
				System.out.println("There are " + duplicates +" more occurrences of value " + arr[i] + " starting at index " + i);
			}
		}
		
		// Fill-in
	}

}
