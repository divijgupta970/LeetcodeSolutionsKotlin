class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var curr = 0
        var size = 0
        for(i in nums.indices) {
            if (nums[i] != `val`) {
                nums[curr++] = nums[i]
                size++
            }
        }
        return size
    }
}