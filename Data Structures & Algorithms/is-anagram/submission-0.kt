class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val left = s.toCharArray().sorted()
        val right = t.toCharArray().sorted()
        if (left == right) {
            return true
        }
        return false
    }
}
