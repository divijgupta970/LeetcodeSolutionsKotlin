class Solution {
    fun countAndSay(n: Int): String {
        if(n == 1)
            return "1"
        val inp = countAndSay(n - 1)
        var count = 1
        var num = inp[0]
        val ans = StringBuilder()
        for(i in 1 until inp.length) {
            if(inp[i] == num) 
                count++
            else {
                ans.append(count).append(num)
                count = 1
                num = inp[i]
            }
        }
        ans.append(count).append(num)
        return ans.toString()
    }  
}