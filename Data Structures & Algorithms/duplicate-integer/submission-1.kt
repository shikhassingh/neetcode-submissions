class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val map = HashMap<Int,Int>()
        for (i in nums){
            val count = (map[i] ?: 0) + 1
            if(count>1) return true
            map[i] = count
        }
       return false 
    }
}
