class Solution {
    public boolean isAnagram(String s, String t) {
      if ( s.length() != t.length()) {
        return false ; 
      }
      // Create an array to count characters frequencies 
      int[] charCounts = new int[26] ; //assuming only lowercase English letters

      //Increment count for each character in 's' and decrement for each in 't'
      for( int i = 0 ; i < s.length();i++) {
        charCounts[s.charAt(i) - 'a']++;
        charCounts[t.charAt(i) - 'a']--;
      }

      for (int count : charCounts) {
        if (count != 0 ) {
          return false ;
        }
      }
      return true ;
    }
}
