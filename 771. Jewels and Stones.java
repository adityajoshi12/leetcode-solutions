class Solution {
    public int numJewelsInStones(String jewels, String stones) {
    Map<Character,Integer> map=new HashMap<Character,Integer>();
    
    for(int i=0;i<stones.length();i++){
        char ch=stones.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);  
    }
    
    int count=0;
    for(int i=0;i< jewels.length();i++){
       char ch= jewels.charAt(i);
       if(map.containsKey(ch)){
           int num =map.get(ch);
           count=count+num;           
       }  
    }
    return count;
    }
}