class Solution {
    public int prefixCount(String[] words, String pref) {
        int s = 0;
        for(int i = 0; i < words.length; i++){
            if(words[i].startsWith(pref)){
                s++;
            }
        }

        return(s);
    }
}
