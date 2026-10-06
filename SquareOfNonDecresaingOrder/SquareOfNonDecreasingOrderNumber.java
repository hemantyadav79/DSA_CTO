// package Java.SquareOfNonDecresaingOrder;

public class SquareOfNonDecreasingOrderNumber {
    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];

        int i= 0, j= nums.length - 1, k = nums.length - 1;

        while(i <= j) {
            if(Math.abs(nums[i]) > Math.abs(nums[j])) {
                res[k] = nums[i] * nums[i];
                i = i +1;
            } else {
                res[k] = nums[j] * nums[j];
                j = j - 1;
            }
            k = k -1;
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = sortedSquares(nums);
        System.out.println(java.util.Arrays.toString(result));
    }
    
}
