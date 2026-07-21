class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

       val groups = mutableMapOf<List<Int>, MutableList<String>>()
        for(s in strs){
            val count = IntArray(26)
            
            for(char in s){
                count[char - 'a'] +=1
            }

            val key = count.toList()

            if(!groups.containsKey(key)){
                groups[key] = mutableListOf()
            }
            groups[key]?.add(s)
        }

        return groups.values.toList()

    }
}
