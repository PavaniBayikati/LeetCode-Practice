import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        
        // Find the maximum candies in the array without sorting
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        List<Boolean> booleanList = new ArrayList<>();
        
        // Determine if each child can have the maximum candies
        for (int candy : candies) {
            if (candy + extraCandies >= maxCandies) {
                booleanList.add(true);
            } else {
                booleanList.add(false);
            }
        }
        
        return booleanList;
    }
}
