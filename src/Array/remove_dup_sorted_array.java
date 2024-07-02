package Array;

import java.sql.SQLOutput;
import java.util.HashSet;

public class remove_dup_sorted_array {
    static int remove_dup(int nums[], int ans){
        HashSet<Integer> hs = new HashSet<>();
        int x = 0;
        int j = 1;
        hs.add(nums[0]);        ;
        for(int i=1;i<nums.length;i++){
            x = nums[i];
            if(!hs.contains(nums[i])){
                nums[j] = x;
                j++;
            }
            hs.add(nums[i]);
        }
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
        System.out.println();
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
        return nums.length - hs.size();
    }
    public static void main(String[] args) {
        int nums[] = {1,1,2};
        int ans = 0;

        System.out.println();
     remove_dup(nums, ans);
    }
}
