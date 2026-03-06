public class Solution {
    public int PrefixCount(string[] words, string pref) {
        int s = 0;
        for(int i = 0; i < words.Length; i++){
            if(words[i].StartsWith(pref))s++;
        }
        return(s);
    }
}
