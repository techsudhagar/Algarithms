import java.util.*;

public class SumOfThree{
   public static boolean findSumOfThree(int[] nums, int target) {
      
      Arrays.sort(nums);
      int len = nums.length;
      int low = 1;
      int high = len - 1;
      int current = 0;
      int calcTarget = 0;
      int currMaxLen = len - 2;
      while (current < currMaxLen){
        
        calcTarget = nums[current]+ nums[low]+nums[high];
        
        if (calcTarget == target) {
          return true;
        } else if (calcTarget < target) {
          low++;
          
        } else {
          high--;
        }
        
        if(low == high || low > high) {
          current++;
          low = current + 1;
          high = len - 1;
        }
        
      }
    
      return false;
   }

   public static void main(String[] args) {
    int[] nums = {1,-1,0};
    int target = -1;

    if ( findSumOfThree(nums, target) ) {
        System.out.println("Found");
    } else {
        System.out.println("Not Valid");
    }
   }
}