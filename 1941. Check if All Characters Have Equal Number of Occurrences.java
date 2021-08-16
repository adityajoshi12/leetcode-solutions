class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char inputchar = s.charAt(i);
		map.put(inputchar, map.getOrDefault(inputchar, 0) + 1);
        }
        
        int c=map.get(s.charAt(0));
        for (Map.Entry<Character,Integer>  entry : map.entrySet())
              {
                  if(c!=entry.getValue()){
                      return false;
                  
                  }
              }
        return true;
    }
}