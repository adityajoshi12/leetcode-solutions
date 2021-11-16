class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length<2) return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
 
        int startTime=intervals[0][0];
        int endTime=intervals[0][1];
        
        List<int[]> res = new ArrayList<>();
        for(int i=1; i<intervals.length;i++){
            int currentStart=intervals[i][0];
            int currentEnd = intervals[i][1];
            
            
            if(currentStart<=endTime){
                endTime=Math.max(endTime,currentEnd);
            }
            else{
               
                res.add(new int[]{startTime, endTime});
                startTime=currentStart;
                endTime=currentEnd;
            }
            
        }
         res.add(new int[]{startTime, endTime});
        
        return res.toArray(new int[res.size()][]);
    }    
}

// Using linkedlist approach

/* class Solution {
    public int[][] merge(int[][] intervals) {
        
       if(intervals.length<2) return intervals;

       Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    
       LinkedList<int[]> res=new LinkedList();
        
        for(int[] interval : intervals){
            if(res.isEmpty() || res.getLast()[1]< interval[0]){
                res.add(interval);
            }
            else {
                res.getLast()[1]=Math.max(res.getLast()[1], interval[1]);
            }
        }
        
        return res.toArray(new int[res.size()][]);
    }   
}

*/
