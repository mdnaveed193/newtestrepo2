class Solution {
     public boolean canJump(int[] nums) {

        int farthestReach = 0;

        for (int i = 0; i < nums.length; i++) {

            // We cannot even reach the current index
            if (i > farthestReach) {
                return false;
            }

            farthestReach = Math.max(
                farthestReach,
                i + nums[i]
            );

            // We can already reach the last index
            if (farthestReach >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }
}