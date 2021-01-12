class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var carry = 0
        var itr1 = l1
        var itr2 = l2
        var prev : ListNode? = null
        while(itr1 != null && itr2 != null) {
            val sum = itr1.`val` + itr2.`val` + carry
            itr1.`val` = sum % 10
            carry = sum / 10
            prev = itr1
            itr1 = itr1.next
            itr2 = itr2.next
        }
        while(itr1 != null) {
            val sum = itr1.`val` + carry
            itr1.`val` = sum % 10
            carry = sum / 10
            prev = itr1
            itr1 = itr1.next
        }
        if(prev == null)
            return l2
        while(itr2 != null) {
            val sum = itr2.`val` + carry
            prev!!.next = ListNode(sum % 10)
            carry = sum / 10
            prev = prev.next
            itr2 = itr2.next
        }
        if(carry != 0)
            prev!!.next = ListNode(carry)
        return l1
    }
}