class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        return x.toLong() == x.reverse()
    }

    fun Int.reverse(): Long {
        var ans = 0L
        var num = this
        while (num != 0) {
            ans = ans * 10 + num % 10
            num /= 10
        }
        return ans
    }
}