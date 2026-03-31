package InsertionSort;

public class InsertionSortSyntax {
    public static void main(String[] args) {
        int[] arr = {5,2,4,6,1,3};
        int n = arr.length;

        for(int cardIndex = 1; cardIndex < n; cardIndex++){
            int cardValue = arr[cardIndex];
            int currentIndex = cardIndex-1;

            while(currentIndex >=0 && cardValue < arr[currentIndex]){
                arr[currentIndex+1] = arr[currentIndex];
                currentIndex--;
            }
            arr[currentIndex + 1] = cardValue;
        }
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}
