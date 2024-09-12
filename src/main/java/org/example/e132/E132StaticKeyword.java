package org.example.e132;

public class E132StaticKeyword {

    public static double[][]reduce10(double[][]nums){
        double[][] result=new double[nums.length][nums[0].length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                result[i][j]=nums[i][j]-10;

            }
        }
        return result;
    }


    public static void main(String[] args) {
        double[][]nums={
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };

        double[][] reducedNums = reduce10(nums);

        for (int i = 0; i < reducedNums.length; i++) {
            for (int j = 0; j < reducedNums[i].length; j++) {
                System.out.print((int)reducedNums[i][j]+" ");
            }
            System.out.println();
        }

    }}

