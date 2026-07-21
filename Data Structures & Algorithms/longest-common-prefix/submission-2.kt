class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if(strs.isEmpty()) return ""

        val shortest = strs.minByOrNull{it.length} ?: ""

        for(i in shortest.indices){
            val char = shortest[i]
            for(str in strs){
                if(str[i] != char){
                    return shortest.substring(0,i)
                }
            }
        }

        return shortest

    }
}
