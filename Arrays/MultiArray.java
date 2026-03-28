package Arrays;

import java.util.Scanner;

public class MultiArray {
	 public static void main(String[] args) {
	        int[][] arr;

	        // Initializing row and column sizes
	        arr = new int[3][3];

	        // Assigning values
//	        arr[0][0] = 3;
//	        arr[0][1] = 5;
//	        arr[0][2] = 7;
//	        arr[1][0] = 3;
//	        arr[1][1] = 5;
//	        arr[1][2] = 7;
//	        arr[2][0] = 3;
//	        arr[2][1] = 5;
//	        arr[2][2] = 7;
	        
	        //Assigning values using loops
	        Scanner sc = new Scanner(System.in);
	        for(int i = 0; i < 3; i++) {
	        	for (int j = 0; j < 3; j++) {
	        		System.out.print("Enter value for " + i + " " + j + ": ");
	        		arr[i][j] = sc.nextInt();
	        		
	        	}
	        }
	        sc.close();

	        // Displaying values
//	        System.out.println("arr[0][0] = " + arr[0][0]);
//	        System.out.println("arr[0][1] = " + arr[0][1]);
//	        System.out.println("arr[0][2] = " + arr[0][2]);
//	        System.out.println("arr[0][0] = " + arr[1][0]);
//	        System.out.println("arr[0][1] = " + arr[1][1]);
//	        System.out.println("arr[0][2] = " + arr[1][2]);
//	        System.out.println("arr[0][0] = " + arr[2][0]);
//	        System.out.println("arr[0][1] = " + arr[2][1]);
//	        System.out.println("arr[0][2] = " + arr[2][2]);
	        
	        //Displaying using loop
	        for (int i = 0; i < 3; i++) {
	        	for (int j = 0; j < 3; j++) {
	        		System.out.print(arr[i] [j] + " ");
	        	}
	        System.out.println();
	        }
	        
	    }
}
