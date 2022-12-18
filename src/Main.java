import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = twoSum(new int[] {1, 3, 4, 4, 5, 6}, 11);


        System.out.println(Arrays.toString(myArray));
    }

        public static int[] twoSum(int[] nums, int target) {
            int index = 0;
            int outdex = index + 1;
            int sum = 0;
            int[] result = new int[2];
            for (index = 0; index < (nums.length - 1); index++){
                for (outdex = index + 1; outdex < nums.length; outdex++){
                    sum = nums[index] + nums[outdex];

                    if (sum == target) {
                        result[0] = index;
                        result[1] = outdex;
                    }
                }

            }
            return result;
        }

}
