package Back_tracking;

import java.util.ArrayList;
import java.util.List;

public class subsets_leetcode_78 {
    public static void genrate_subsets(int input_arr[], int index, List<Integer> list) {
        if(index == input_arr.length){
            for(int nums: list){
                System.out.print(nums);
            }
            System.out.println();
            return;
        }
        list.add(input_arr[index]);
        genrate_subsets(input_arr, index+1,list);
        list.remove(list.size()-1);
        genrate_subsets(input_arr, index+1, list);
    }
    public static void main(String[] args) {
        int input_arr[] = {1,2,3};
        int index = 0;
        List<Integer> list = new ArrayList<>();
        genrate_subsets(input_arr, index, list);
    }
}
