import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> num1= new HashSet<>();
        for(int num:nums){
            if (num1.contains(num))
                return true;
            num1.add(num);
        }
        return false;
    }
}

public class Contains_duplicate {
    public static void main(String[] args) {
        Solution s1=new Solution();
        int[] nums={4,5,6,7,1};
        s1.containsDuplicate(nums);
    }
}