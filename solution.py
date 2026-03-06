class Solution:
    def prefixCount(self, words, pref):
        s = 0
        for w in words:
            if w.startswith(pref):
                s += 1
        
        return s
