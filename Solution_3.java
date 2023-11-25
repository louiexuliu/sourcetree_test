/**
 * Author: Louie Liu
 * Time: 2023/11/25 3:33
 */
class Solution_3 {
    public static int[] twoSum(int[] nums, int target) {
//双循环找和
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        //没有就返回空
        return new int[]{};
    }

        public static void test1() {
            int[] nums = {2, 7, 11, 15};
            int target = 9;

            int[] result = twoSum(nums, target);
            if (result.length == 2) {
                System.out.println("[" + result[0] + "," + result[1] + "]");
            }else{
                System.out.println("can't find");
            }

        }

        public static void test2() {
            int[] nums = {3,2,4};
            int target = 6;

            int[] result = twoSum(nums, target);
            if (result.length == 2) {
                System.out.println("[" + result[0] + "," + result[1] + "]");
            }else{
                System.out.println("can't find");
            }
        }

        public static void test3() {
            int[] nums = {3,3};
            int target = 6;

            int[] result = twoSum(nums, target);
            if (result.length == 2) {
                System.out.println("[" + result[0] + "," + result[1] + "]");
            }else{
                System.out.println("can't find");
            }
        }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }
}
