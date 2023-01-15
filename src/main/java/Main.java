import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {2, 3, 4, 5};
        System.out.println(Arrays.toString(Solution.intersect(nums1, nums2)));
    }

    public static class Solution {
        public static int[] intersect(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int i = 0;
            int j = 0;
            ArrayList<Integer> numsList = new ArrayList<>();
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    numsList.add(nums1[i]);
                    i++;
                    j++;
                } else if (nums1[i] < nums2[j]) {
                    i++;
                } else {
                    j++;
                }
            }
            int[] outnums = new int[numsList.size()];
            for (int k = 0; k < numsList.size(); k++) {
                outnums[k] = numsList.get(k);
            }
            return outnums;
        }
    }
}