public class Solution_5 {
    public int search(int[] nums, int target) {
        int left = 0; //left为数组开头索引
        int right = nums.length - 1; //right为末尾

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {  //如果 nums[mid] 小于目标值 target，将 left 移动到 mid + 1的位置
                left = mid + 1;
            } else {  //同理
                right = mid - 1;
            }
        }

        return -1; //不在数组中
    }

    public static void main(String[] args) {
        Solution_5 binarySearch = new Solution_5();

        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        int target1 = 9;
        int result1 = binarySearch.search(nums1, target1);
        System.out.println("Output1: " + result1);

        int[] nums2 = {-1, 0, 3, 5, 9, 12};
        int target2 = 2;
        int result2 = binarySearch.search(nums2, target2);
        System.out.println("Output2: " + result2);
    }
}