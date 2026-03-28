package Arrays;
public class Assignment_Day01 {

	public static void main(String[] args) {
		System.out.println("-----------------Reverse an array in place------------------");

		int nums[] = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}

		int start = 0;
		int end = nums.length - 1;
		reverse(nums, start, end); //calling function

		System.out.println();
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
		System.out.println();
		
		
		System.out.println("-----------------Rotate an array by k elements------------------");


		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = arr.length;
		int k = 2;
		k = k % n;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();

		int left = 0, right = n - 1;
		reverse(arr, left, right);

		left = k;
		right = n - 1;
		reverse(arr, left, right);
	
		left = 0;
		right = k - 1;
		reverse(arr, left, right);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		

		System.out.println("-----------------Transpose of matrix-----------------");

		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i <= j) {
					int temp = array[i][j];
					array[i][j] = array[j][i];
					array[j][i] = temp;
				}
			}

		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}


	static void reverse(int [] arr, int left, int right){
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
}
