class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val map = HashMap<Char, Int>();
        var globalMax = Integer.MIN_VALUE
        var currMax = 0;
        var minInd = 0
        for(i in s.indices) {
            if(map.containsKey(s[i]) && map[s[i]]!! >= minInd) {
                minInd = map[s[i]]!! + 1
                currMax = i - map[s[i]]!!
            } else {
                globalMax = max(globalMax, ++currMax)
            }
            map[s[i]] = i
        }
        globalMax = max(globalMax, currMax)
        return globalMax
    }
}