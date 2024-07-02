package Back_tracking;

import java.util.ArrayList;
import java.util.List;

public class subset_2 {
    public static void generateSubsets(int[] input_arr, int index, List<Integer> list, List<List<Integer>> results) {
        if (index == input_arr.length) {

            results.add(new ArrayList<>(list));
            return;
        }
        list.add(input_arr[index]);
        generateSubsets(input_arr, index, list, results);

        // Exclude the current element (backtracking)
        list.remove(list.size() - 1);
        generateSubsets(input_arr, index + 1, list, results); // Note: index is incremented here
    }

    public static void main(String[] args) {
        int[] input_arr = {1, 2, 2};
        int index = 0;
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> results = new ArrayList<>();
        generateSubsets(input_arr, index, list, results);

        for (List<Integer> subset : results) {
            System.out.println(subset);
        }
    }

}
