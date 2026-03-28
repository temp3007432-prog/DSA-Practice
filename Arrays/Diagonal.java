package Arrays;

public class Diagonal {
	public static void main(String[] args) {
		
		int [][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
//		int length = arr.length;
//		System.out.println(length); //3


//---------------Diagonal---------------//
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][i]);
		}
		
		System.out.println();
    
//-------------Anti-Diagonal-------------//
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][arr.length - 1 - i]);
		}
	}
}
