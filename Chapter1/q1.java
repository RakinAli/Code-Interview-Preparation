/*
  Implement an algorithm to determine if a string has all unique characters.
 */

public class q1 {
  // Input can only be a-z and A - Z. Not anything else
  static boolean isUnique(String abc){
    if(abc.length()>26){
      return false; 
    }
    boolean checker[] = new boolean[26];
    
    for(int i = 0; i<abc.length(); i++){
      int value = abc.toLowerCase().charAt(i)-97;
      if(value>=0 && value<26){
        if (checker[value])
          return false;
      }
      checker[value]=true;
    }   
    return true;
  }

  /*
   * Time complexity: O(1) = Constant because only 26 letters
   * Space complexity O(26 bits because of the boolean array )
  */


  public static void main(String[] args) {
    String test1 = "abcdefg";  // true
    String test2 = "aabcdeefg"; // false

    //Testing for capital sized alphabets
    String test3= "abcABC"; // false
    String test4="abcDEF"; // true 

    if(isUnique(test1)){
      System.out.println("Passed first test - True");

    }else{
      System.out.println("Failed first test");
    }

    if(!isUnique(test2)){
      System.out.println("Passed second test - False");
    }else{
      System.out.println("Failed second test");
    }

    if (!isUnique(test3)) {
      System.out.println("Passed third test - False");
    } else {
      System.out.println("Failed third test");
    }

    if (isUnique(test4)) {
      System.out.println("Passed forth test - True");
    } else {
      System.out.println("Failed fourth test");
    }


            
  }
}

