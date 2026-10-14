
class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicate = 0, missing = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == 2) {
                duplicate = nums[i];
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            boolean found = false;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }
}

