/* Hard 2 
You are given a string s. You can convert s to a 
palindrome by adding characters in front of it.
Return the shortest palindrome you can find by performing this transformation.
*/


public class hard {
    public String shortPalindrome(String s) {
      String temp = s + "#" + new StringBuilder(s).reverse().toString();
      int[] table = getTable(temp);
  
      return new StringBuilder(s.substring(table[table.length - 1])).reverse().toString() + s;
    }
  
    public int[] getTable(String s) {
      int[] x = new int[s.length()];
  
      int count = 0;
      for (int i = 1; i < s.length(); ) {
          if (s.charAt(count) == s.charAt(i)) {
              x[i] = ++count;
              i++;
          } else {
              if (count > 0) {
                  count = x[count-1];
              } else {
                  count = 0;
                  i ++;
              }
          }
      }
      return x;
    }
  }
