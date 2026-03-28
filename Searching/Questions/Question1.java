package Searching.Questions;

public class Question1 {
public static void main(String[] args) {
    //Find index of first occurance of target element in a sorted array.

    int [] nums = {2,4,3,3,4,3,7,9,6,4,6};
    int key = 4;

    int left = nums[0];
    int right = nums.length;
    int minIndex = 0;
    while (left <= right){
      int mid = left*((right-left)/2);
      if (nums[mid] == key){
        minIndex = mid;
        right = mid-1;
      }
      if (key > nums[mid]){
        left = mid + 1;
      }
      else{
        right = mid - 1;
      }
      left++;
      right--;
    }
    System.out.println(minIndex);
  }
}
