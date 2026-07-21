class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        val list = strs.map{it.toMutableList()}
        val minLength = list.minOf{it.size}
        var prefixLength = 0

        for (i in 0 until minLength) {
            val refChar = list[0][i]
            val allMatch = list.all {it[i] == refChar}
            if (allMatch) prefixLength++  else break
        }

        val eliminated = strs[0].substring(0, prefixLength)
        return eliminated    
    }
}
