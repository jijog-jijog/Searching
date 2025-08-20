package Sort;

import java.util.Arrays;

public class mycode {
    public static void main(String[] args) {
        int[] arr = {8,6,0,9,4,3,2,10};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] nums, int low, int high){

        if (low >= high){
            return;
        }
        int s = low;
        int end = high;
        int mid = end + (s-end)/2;
        int pivot = nums[mid];

        while(s <= end){

            while(nums[s] < pivot){
                s++;
            }
            while (nums[end] > pivot){
                end--;
            }

            if (s <= end){
                int temp = nums[s];
                nums[s] = nums[end];
                nums[end] = temp;
                s++;
                end--;
            }
        }
        sort(nums,low,end);
        sort(nums,s,high);

    }
}
