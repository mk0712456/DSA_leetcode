package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class rotate_array {
    static void sort(int nums[], int start, int end){
        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        if(k==nums.length){
            return;
        }
        if(k>nums.length){
            k = k % nums.length;
        }
        sort(nums, 0, nums.length-1);
        sort(nums, 0, k-1);
        sort(nums, k, nums.length-1);
    }
}
