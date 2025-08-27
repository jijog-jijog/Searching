package Leetcode;

import java.util.Arrays;

public class Merge88 {
    public static void main(String[] args) 
        int[] nums1 = {7,8,1,2,3,0,0,0};
        int m = 5;
        int[] nums2 = {2,5,6};
        int n = 3;

        int i =0;
        while (i < nums2.length){
            nums1[m+i] = nums2[i];
            i++;
        }

        int[] ans = mergesort(nums1);
        System.out.println(Arrays.toString(ans));
    }
    static int[] mergesort(int[] nums){

        if (nums.length == 1){
            return nums;
        }
        int mid = nums.length/2;

        int[] leftarr = mergesort(Arrays.copyOfRange(nums,0,mid));

        int[] rightarr = mergesort(Arrays.copyOfRange(nums,mid,nums.length));

        return sort(leftarr,rightarr);


    }
    static int[] sort(int[] arrleft, int[] arrright){
        int[] mer = new int[arrleft.length + arrright.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < arrleft.length && j < arrright.length){
            if (arrleft[i] < arrright[j]){
                mer[k] = arrleft[i];
                i++;
            }else{
                mer[k] = arrright[j];
                j++;
            }
            k++;
        }
        while (i<arrleft.length){
            mer[k] = arrleft[i];
            i++;
            k++;
        }
        while (j < arrright.length){
            mer[k] = arrright[j];
            j++;
            k++;
        }

        return mer;

    }
}
