package org.example.e141;

public class E141AccessModifiers {
    public static int maxValue(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must be null or empty");
        }
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
    
    
    public static void main(String[] args) {
        int[]nums={1, 5, 22, 3, 7};
        int max=maxValue(nums);
        System.out.println(max);
    }
}
