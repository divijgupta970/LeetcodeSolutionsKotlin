class Solution {
    fun removeDuplicates(arr: IntArray): Int {
        var size = arr.size
        var j = 0
        for (i in 1 until arr.size) {
            if (arr[i] == arr[i - 1]) size--
            if (arr[j] != arr[i]) {
                arr[++j] = arr[i]
            }
        }
        return size
    }
}