import java.util.HashMap;

public class Practice {

    static int search(int[] nums, int target) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }

    static void twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if ((nums[i] + nums[j]) == target) {
                    map.put(null, null);
                }
            }
        }
        System.out.println();
        // System.out.println(res);

    }

    public static void main(String args[]) {
        int[] nums = { 1, 4, 5, 2 };
        int target = 5;
        int res = search(nums, target);
        twoSum(nums, target);
        System.out.println();
        // System.out.println(res);

    }
}
