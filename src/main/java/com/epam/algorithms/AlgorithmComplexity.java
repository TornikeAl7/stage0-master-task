package com.epam.algorithms;

import com.epam.algorithms.utils.Complexity;

import java.util.ArrayList;
import java.util.List;

/**
 * Tasks for assessing the algorithm complexity. The following are the ratios of the constants with the BigO estimate:
 * <p>
 * Complexity.O_LOG_N       -> O(log N) Complexity.O_N_2         -> O(log N^2) Complexity.O_FACTORIAL_N -> O(!N)
 * Complexity.O_2_N         -> O(2 * N) Complexity.O_N_LOG_N     -> O(N * log N) Complexity.O_1           -> O(1)
 * Complexity.O_N           -> O(N)
 */
public class AlgorithmComplexity {

    /**
     * Return the linear search complexity if the element you are looking for is at the end of the array.
     */
    public Complexity badLinerSearch() {
        int[] array = {1, 2, 3, 4, 5};
        int target = array[array.length - 1];
        for (int item : array) {
            if (item == target) {
                return Complexity.O_N;
            }
        }
        return Complexity.O_N;
    }

    /**
     * Return the complexity of accessing an array element by index.
     */
    public Complexity arrayIndexItemAccess() {
        int[] array = {1, 2, 3, 4, 5};
        int index = 2;
        int element = array[index];
        return Complexity.O_1;
    }

    /**
     * Return the complexity of a binary search.
     */
    public Complexity binarySorting() {
        int[] array = {1, 2, 3, 4, 5};
        int low = 0;
        int high = array.length - 1;
        int target = array[array.length - 1]; // Assuming the array is sorted in ascending order
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                return Complexity.O_LOG_N;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return Complexity.O_LOG_N;
    }

    /**
     * Return the complexity of the twoCycleSorting algorithm.
     */
    public Complexity twoCycleSorting() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);
        int n = list.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return Complexity.O_N_2;
    }

}
