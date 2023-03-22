/* Medium 2 
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. 
*/

import java.util.ArrayList;
import java.util.HashMap;

public class medium {
        static ArrayList < Integer > majorityEle(int arr[], int n) {
          HashMap < Integer, Integer > map = new HashMap < > ();
          ArrayList < Integer > ans = new ArrayList < > ();
      
          for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
          }
      
          for (int x: map.keySet()) {
            if (map.get(x) > (n / 3))
              ans.add(x);
          }
          return ans;
        }
    
}
