import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int a : nums) {

            if(set.contains(a)) {
                return true;   // duplicate found
            }

            set.add(a);
        }

        return false;  // finished, no duplicate
    }
}
