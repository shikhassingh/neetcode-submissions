class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()

        for(num in nums){
          map[num] = map.getOrDefault(num,0) +1
        
        if((map[num] ?:0) > nums.size/2){
            return num
        }
    }

        return -1
    }
}
