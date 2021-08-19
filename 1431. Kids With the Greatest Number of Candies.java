class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
                int greatestNum = candies[0];
        int length = candies.length;
        for(int i = 1; i < length; i++) 
            if(candies[i] > greatestNum)
                greatestNum = candies[i];        
        
        List<Boolean> result = new ArrayList();
        for(int i = 0; i < length; i++)             
           result.add(candies[i] + extraCandies >= greatestNum);
            
        return result; 
    }
}