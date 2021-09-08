class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int shift=0;
        char[] c=s.toCharArray();
        
        for(int i=shifts.length-1;i>=0;i--){
            
            shift=(shifts[i]+shift)%26;
            
            c[i]=(char)((c[i]-'a'+shift)%26+'a');
            
        }
        return new String(c);
    }
}