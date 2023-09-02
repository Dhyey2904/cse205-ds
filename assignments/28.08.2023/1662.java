class  S1662 {
  public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int w1 = 0, w2 = 0;
        int s1 = 0, s2 = 0;
        
        while (w1 < word1.length && w2 < word2.length) {
            if (word1[w1].charAt(s1++) != 
                word2[w2].charAt(s2++)) {
                return false;
            }
            if (s1 == word1[w1].length()) {
                w1++;
                s1 = 0;
            }
            if (s2 == word2[w2].length()) {
                w2++;
                s2 = 0;
            }
        }
        return w1 == word1.length && w2 == word2.length;
    }
}
