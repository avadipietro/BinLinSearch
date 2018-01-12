package ahhahaghdakdh;

public class SearchAlgorithms {
	public static void main (String[] args) {
		int[] test1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] test2 = {0, 4, 5, 6, 12, 15, 17, 23, 29};
		
		System.out.println(binSearch(test1, 3)); //2
		System.out.println(linSearch(test1, 3)); //2
		
		System.out.println(binSearch(test2, 23)); //7
		System.out.println(linSearch(test2, 23)); //7
		
		System.out.println(binSearch(test2, 25)); //-1
		System.out.println(linSearch(test2, 25)); //-1
		
		System.out.println(binSearch(test1, 10)); //9
		System.out.println(linSearch(test1, 1)); //0
		
		System.out.println(binSearch(test1, 1)); //0
	}
	
	public static int linSearch(int[] arr, int query) {
		
		for (int x = 0; x <= arr.length - 1; x++) {
			if (arr[x] == query) {
				return x;
			}
		}
		return -1;
	}
	
	public static int binSearch(int[] arr, int query) {
		
		int x = 0;
		int y = arr.length - 1;
		while (x <= y) {
			int mid = (x + y) / 2;
			if (query == arr[mid]) {
				return mid;
			}
			else if (query < arr[mid]) {
				y = mid - 1;
			}
			else if (query > arr[mid]) {
				x = mid + 1;
			}
		}
		return -1;
	}
}
