package Arrays;
public class Array90Deg {
    public static void main(String[] args) {

        //Rotate array by 90 degree

        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //Transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] =temp;
            }
        }

        //Reverse
        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = arr[i].length - 1; // Use arr[i].length for safety
            while (left < right) {
                int temp = arr[i][left]; // Use 'i' instead of 'row'
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }

        System.out.println();
    
        //Array rotated 90 degree
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
