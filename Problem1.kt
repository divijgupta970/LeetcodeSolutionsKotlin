class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        val ans = intArrayOf(0, 0)
        for (i in nums.indices) {
            if (map.containsKey(target - nums[i])) {
                ans[0] = map[target - nums[i]]!!
                ans[1] = i
                break
            }
            map[nums[i]] = i
        }
        return ans
    }
}