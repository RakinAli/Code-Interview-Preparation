public class q2 {
  /* Given two strings, write a method to decide if one is a permutation of the other */

  static boolean isPermutation(String a, String b){
    if(!(a.length()==b.length()))
      return false;
    boolean checker = sort(a).equals(sort(b));    
    return checker; 
  }

  static String sort(String string){
    char[] array = string.toCharArray();
    java.util.Arrays.sort(array);
    return new String(array);
  }

  // The main was taken from github to test
  public static void main(String[] args) {
    String[][] pairs = { { "apple", "papel" }, { "carrot", "tarroc" }, { "hello", "llloh" } };
    for (String[] pair : pairs) {
      String word1 = pair[0];
      String word2 = pair[1];
      boolean anagram = isPermutation(word1, word2);
      System.out.println(word1 + ", " + word2 + ": " + anagram);
    }
  }
}
