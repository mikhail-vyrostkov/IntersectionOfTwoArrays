import junit.framework.TestCase;

import java.util.Arrays;

public class IntersectionOfTwoArraysTest extends TestCase {

    public void testExample1(){
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {2, 3, 4, 5};
        Main.Solution.intersect(nums1, nums2);
        int[] actualPrices = Main.Solution.intersect(nums1, nums2);
        int[] expectedPrices = {2, 3, 4};
        assertEquals(Arrays.toString(expectedPrices), Arrays.toString(actualPrices));
    }

    public void testExample2(){
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        Main.Solution.intersect(nums1, nums2);
        int[] actualPrices = Main.Solution.intersect(nums1, nums2);
        int[] expectedPrices = {4, 9};
        assertEquals(Arrays.toString(expectedPrices), Arrays.toString(actualPrices));
    }
}