class Solution {
    fun reverse(x: Int): Int {

        var current = x
        var result = 0

        var digit = 0
        while (current != 0) {
            digit = current % 10
            current /= 10

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) return 0
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) return 0
            result = (result * 10) + digit
        }

        return result
    }
}